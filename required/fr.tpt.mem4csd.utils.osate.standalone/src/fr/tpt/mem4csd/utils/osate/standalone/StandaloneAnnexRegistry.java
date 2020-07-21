/**
 * AADL-RAMSES
 * 
 * Copyright © 2012 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */

package fr.tpt.mem4csd.utils.osate.standalone;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osate.annexsupport.AnnexLinkingService;
import org.osate.annexsupport.AnnexParser;
import org.osate.annexsupport.AnnexProxy;
import org.osate.annexsupport.AnnexRegistry;
import org.osate.annexsupport.AnnexResolver;
import org.osate.annexsupport.AnnexTextPositionResolver;
import org.osate.annexsupport.AnnexUnparser;

public class StandaloneAnnexRegistry extends AnnexRegistry {
	
	public static class AnnexExtensionRegistration {
		final String id;
		final String annexName;
		final Class<?> extClass;
		
		/**
		 * @param extensionId The ID of the Annex Extension (From StandaloneAnnexRegistry)
		 */
		public AnnexExtensionRegistration(final String extensionId, final String annexName, final Class<?> extClass) {
			this.id = extensionId;
			this.annexName = annexName;
			this.extClass = extClass;
		}
		
		public String getId() {
			return id;
		}
		
		public String getAnnexName() {
			return annexName;
		}
		
		public Class<?> getExtClass() {
			return extClass;
		}
	}
	
	private static final Map<String, StandaloneAnnexRegistry> registries = new HashMap<String, StandaloneAnnexRegistry>();
	private static final Map<String, AnnexExtensionRegistration> extensionRegistry = new HashMap<String, AnnexExtensionRegistration>();
	
	public StandaloneAnnexRegistry( final String extensionId ) {
		registries.put( extensionId, this );
		
		initialize( extensionId );
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void initialize( final String extensionId ) {
		if ( Platform.isRunning() /*&& OsateResourceUtil.USES_GUI*/ ) {
			super.initialize(extensionId);
		}
		else {
			extensions = new HashMap<String, Object>();
			
			if ( extensionRegistry.containsKey(extensionId) ) {
				final AnnexExtensionRegistration ext = extensionRegistry.get(extensionId);
				try {
					extensions.put(ext.getAnnexName(), ext.getExtClass().getConstructor().newInstance());
				} catch (Exception e) {
					throw new RuntimeException("Error while initializing " + ext.getExtClass().getName() + " extension class.", e);
				}
			}
		}
	}

	public static StandaloneAnnexRegistry getRegistry( final String extensionId ) {
		StandaloneAnnexRegistry registry = registries.get( extensionId );

		if ( registry == null ) {
			registry = new StandaloneAnnexRegistry( extensionId );
			registries.put( extensionId, registry );
		}
		
		return registry;
	}
	
	public static void putExtensionRegistration( final String extensionId, final String annexName, final Class<?> className ) {
		putExtensionRegistration(new AnnexExtensionRegistration(extensionId, annexName, className));
	}
	
	public static void putAllExtensionRegistrations( final Collection<AnnexExtensionRegistration> extRegs ) {
		for (AnnexExtensionRegistration extReg : extRegs) {
			putExtensionRegistration(extReg);
		}
	}
	
	public static void putExtensionRegistration( final AnnexExtensionRegistration extReg ) {
		extensionRegistry.put(extReg.getId(), extReg);
	}

	@Override
	protected AnnexProxy createProxy( final IConfigurationElement configElem ) {
		return new StandaloneAnnexProxy( configElem );
	}

	public AnnexParser getAnnexParser( String annexName ) {
		return (AnnexParser) extensions.get( annexName.toLowerCase() );
	}

	public AnnexUnparser getAnnexUnparser( String annexName ) {
		return (AnnexUnparser) extensions.get( annexName.toLowerCase() );
	}

	public AnnexResolver getAnnexResolver( String annexName ) {
		return (AnnexResolver) extensions.get( annexName.toLowerCase() );
	}

	public AnnexTextPositionResolver getTextPositionResolver( String annexName ) {
		return (AnnexTextPositionResolver) extensions.get( annexName.toLowerCase() );
	}

	public AnnexLinkingService getAnnexLinkingService( String annexName ) {
		return (AnnexLinkingService) extensions.get( annexName.toLowerCase() );
	}
}