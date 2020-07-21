package fr.tpt.mem4csd.mtbench.aadl2aadl.eMoflon.tgg.tests;

import java.io.File;
import java.io.IOException;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;

import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.tgg.config.DemoclesRegistrationHelper;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.osate.aadl2.instance.SystemInstance;
import org.eclipse.emf.common.util.URI;
import fr.tpt.mem4csd.utils.osate.standalone.OsateStandaloneSetup;

public abstract class AbstractAadl2AadlTest extends SYNC {

	public String filename;
	public static String BASE_RESOURCES_DIR = "fr.tpt.mem4csd.mtbench.aadl2aadl.eMoflon.tgg.tests/resources/";
	public static IRegistrationHelper registrationHelper = new DemoclesRegistrationHelper();

	abstract protected Resource executeAadl2AadlTransformation
	(int testNumber, Result res) throws Exception;

	protected static final URI BASE_URI = URI.createFileURI(new File(".").getAbsolutePath());

	private final static String BASE_DIR = "resources/";

	protected ResourceSet createResourceSet() {
		return new OsateStandaloneSetup(BASE_URI).createResourceSet();
	}

	private final ResourceSet resourceSet;

	protected URI createURI(final String modelName, final String fileExtension) {
		final URI uri = URI.createFileURI(BASE_DIR + modelName).resolve(BASE_URI);
		return fileExtension == null ? uri : uri.appendFileExtension(fileExtension);
	}

	public AbstractAadl2AadlTest(String filename, String baseDir) throws IOException {
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			@Override
			public void saveModels() throws IOException {
				target.save(null);
				corr.save(null);
				protocol.save(null);
			}

			@Override
			public void loadModels() throws IOException {
				source = loadResource(BASE_RESOURCES_DIR + "/inputs/instances/" + filename);
				target = createResource(BASE_RESOURCES_DIR + "/outputs/refined_" + filename);
				corr = createResource(BASE_RESOURCES_DIR + "/inputs/instances/corr_" + filename);
				protocol = createResource(BASE_RESOURCES_DIR + "/inputs/instances/protocol_" + filename);

			}
		}));

		this.filename = filename;
		resourceSet = createResourceSet();
	}

}
