package fr.tpt.mem4csd.utils.osate.standalone;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.EFSURIHandlerImpl;

public class StandaloneURIHandler extends EFSURIHandlerImpl {
	
	private static final String PLATFORM_CONFIG = "PLATFORM_CONFIG";
	private static final String PLATFORM_PLUGIN = "PLATFORM_PLUGIN";
	private static final String PLATFORM_RESOURCE = "PLATFORM_RESOURCE";
	
	private final Map<String, String> relativeUrisMap;
	
	public StandaloneURIHandler(	final String p_configDir,
									final String p_pluginDir,
									final String p_workspaceDir ) {
		relativeUrisMap = new HashMap<String, String>();

        relativeUrisMap.put( PLATFORM_CONFIG, p_configDir );
        relativeUrisMap.put( PLATFORM_PLUGIN, p_pluginDir );
        relativeUrisMap.put( PLATFORM_RESOURCE, p_workspaceDir );
    }

//	@Override
//    public URI resolve( final URI p_uri ) {
	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options)
	throws IOException {
		return super.createInputStream(uri, options);
//        if ( p_uri.isRelative() && p_uri.isHierarchical() && p_uri.path() != null ) {
//        	final String dir;
//        	
//        	if ( p_uri.isPlatformResource() ) {
//        		dir = relativeUrisMap.get( PLATFORM_RESOURCE );
//            }
//        	else if ( p_uri.isPlatformPlugin() ) {
//        		dir = relativeUrisMap.get( PLATFORM_PLUGIN );
//            }
////        	else if ( p_uri. ) {
////        		
////        	}
//        	else {
//        		dir = null;
//        	}
//    		
//    		if ( dir != null ) {
//    			return createAbsURI( p_uri, dir );
//            }
//        }
//        
//        return super.resolve( p_uri );
    }
//
//    private URI createAbsURI(	final URI p_uri,
//    							final String p_dir ) {
//        return p_uri.resolve( URI.createFileURI( p_dir ) );
//    }
}
