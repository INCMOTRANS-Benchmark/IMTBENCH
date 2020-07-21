package org.emoflon.ibex.tgg.run.tgg.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.tgg.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.compiler.patterns.FilterNACStrategy;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.instance.InstancePackage;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
//		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/plugin/org.osate.aadl2/model/aadl2.ecore");
//		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/plugin/org.osate.aadl2/model/instance.ecore");

		EPackage.Registry.INSTANCE.put(org.osate.aadl2.Aadl2Package.eNS_URI, Aadl2Package.eINSTANCE);
		EPackage.Registry.INSTANCE.put(org.osate.aadl2.instance.InstancePackage.eNS_URI, InstancePackage.eINSTANCE);

	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new DemoclesTGGEngine());
		options.project.name("Test");
		options.project.path("Test");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		options.patterns.lookAheadStrategy(FilterNACStrategy.NONE);
		return options;
	}
	

}
