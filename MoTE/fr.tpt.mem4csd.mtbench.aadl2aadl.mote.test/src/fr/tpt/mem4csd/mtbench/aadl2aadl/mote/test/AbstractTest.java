package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.test;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.instance.InstancePackage;
import de.mdelab.mlcallactions.MlcallactionsPackage;
import de.mdelab.mlcore.MlcorePackage;
import de.mdelab.mlexpressions.MlexpressionsPackage;
import de.mdelab.mlsdm.MlsdmPackage;
import de.mdelab.mlstorypatterns.MlstorypatternsPackage;
import de.mdelab.mltgg.mote2.Mote2Package;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;
import de.mdelab.mltgg.mote2.sdm.SdmPackage;
import fr.tpt.mem4csd.utils.osate.standalone.OsateStandaloneSetup;
import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MotePackage;

public abstract class AbstractTest {

	protected static final URI BASE_URI = URI.createFileURI(new File(".").getAbsolutePath());

	private final String baseDir;

	protected AbstractTest(final String baseDir) {
		this.baseDir = baseDir;
		configureResourceSet();
	}

	protected void configureResourceSet() {

		MlcorePackage.eINSTANCE.eClass();
		MlexpressionsPackage.eINSTANCE.eClass();
		MlcallactionsPackage.eINSTANCE.eClass();
		MlstorypatternsPackage.eINSTANCE.eClass();
		MlsdmPackage.eINSTANCE.eClass();
		Mote2Package.eINSTANCE.eClass();
		SdmPackage.eINSTANCE.eClass();
		MotePackage.eINSTANCE.eClass();
		Aadl2Package.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();

	}

	protected URI createURI(final String modelName, final String fileExtension) {
		final URI uri = URI.createFileURI(baseDir + modelName).resolve(BASE_URI);
		return fileExtension == null ? uri : uri.appendFileExtension(fileExtension);
	}

	protected MoTE2Sdm createEngine() {
//		System.out.println("Creating TGG engine.");

		final MoTE2Sdm engine = new MoTE2Sdm();
		final URI opTggResUri = URI.createFileURI
		("../fr.tpt.mem4csd.mtbench.aadl2aadl.mote/model-gen/config.xmi")
				.resolve(BASE_URI);
		final Resource opTggRes = createResourceSet().getResource(opTggResUri, true);
		final SdmOperationalTGG operationalTgg = (SdmOperationalTGG) opTggRes.getContents().get(0);
		EcoreUtil.resolveAll(opTggRes);
		engine.initRules(operationalTgg);

		return engine;
	}

	protected ResourceSet createResourceSet() {
		return new OsateStandaloneSetup(BASE_URI).createResourceSet();
	}

	protected Resource loadInputResource(final String modelName, final String fileExtension) {
		final URI modelUri = createURI("inputs/instances/" + modelName, fileExtension);

		return createResourceSet().getResource(modelUri, true);
	}

	protected abstract Resource executeAadl2AadlTransformation(int testNumber, Result res, final String inputModelName,
			final TransformationDirectionEnum direction) throws Exception;

}