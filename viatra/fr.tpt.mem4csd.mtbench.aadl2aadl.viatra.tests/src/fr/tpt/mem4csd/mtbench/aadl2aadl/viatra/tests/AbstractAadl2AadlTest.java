package fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.osate.workspace.WorkspacePlugin;

import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage;
import fr.tpt.mem4csd.utils.osate.standalone.OsateStandaloneSetup;

public abstract class AbstractAadl2AadlTest {

	protected static final URI BASE_URI = URI.createFileURI(new File(".").getAbsolutePath());

	private final String baseDir;

	protected AbstractAadl2AadlTest(final String baseDir) {
		this.baseDir = baseDir;
		configureResourceSet();
	}

	protected void clear(Aadl2AadlTraceSpec aadlmodel) {
		if (!aadlmodel.getRightSystem().eContents().isEmpty()) {
			EcoreUtil.deleteAll(aadlmodel.getRightSystem().eContents(), true);
		}

		if (!aadlmodel.getTraces().isEmpty()) {
			aadlmodel.getTraces().clear();
		}

		try {// save traces
			aadlmodel.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try { // save refined model
			aadlmodel.getRightSystem().eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void clearAll() {
		for (int i = 1; i <= 10; i++) {
			URI modelUri = createURI("inputs/instances/" + "test" + i, Aadl2aadlPackage.eNAME);
			ResourceSet resSet = createResourceSet();
			Resource aadlTraceResource = resSet.getResource(modelUri, true);
			Aadl2AadlTraceSpec aadlTraceModel = (Aadl2AadlTraceSpec) aadlTraceResource.getContents().get(0);
			clear(aadlTraceModel);
		}

	}

	protected void clearRightSystem(Aadl2AadlTraceSpec aadlmodel) {
		if (aadlmodel.getRightSystem() != null) {
			final Resource rightSysRes = aadlmodel.getRightSystem().eResource();
			EcoreUtil.delete(aadlmodel.getRightSystem(), true);
			rightSysRes.unload();
			rightSysRes.getResourceSet().getResources().remove(rightSysRes);
		}
		aadlmodel.getTraces().clear();
	}

	protected ResourceSet createResourceSet() {
		return new OsateStandaloneSetup(BASE_URI).createResourceSet();
	}

	protected void configureResourceSet() {
		Aadl2aadlPackage.eINSTANCE.eClass();

		new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	protected URI createURI(final String modelName, final String fileExtension) {
		final URI uri = URI.createFileURI(baseDir + modelName).resolve(BASE_URI);

		return fileExtension == null ? uri : uri.appendFileExtension(fileExtension);
	}

	protected Resource loadInputResource(final String modelName, final String fileExtension) {
		final URI modelUri = createURI("inputs/instances/" + modelName, fileExtension);
		return createResourceSet().getResource(modelUri, true);
	}

	protected URI createAadlURI(final String modelName) {
		return createURI(modelName, WorkspacePlugin.MODEL_FILE_EXT);
	}

	abstract protected Resource executeAadl2AadlTransformation(int testNumber, Result res, final String inputModelName)
			throws Exception;

}