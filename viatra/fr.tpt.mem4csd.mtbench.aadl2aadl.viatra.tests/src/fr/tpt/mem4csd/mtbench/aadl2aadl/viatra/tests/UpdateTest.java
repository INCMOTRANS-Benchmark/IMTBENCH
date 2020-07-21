package fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.tests;

import java.io.IOException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage;
import fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.Aadl2aadlTransformation;

public class UpdateTest extends AbstractAadl2AadlTest {

	protected UpdateTest(final String baseDir) {
		super(baseDir);
	}

	ViatraQueryEngine engine;

	Aadl2aadlTransformation transformation;

	@SuppressWarnings("unchecked")
	protected Resource executeAadl2AadlTransformation(int testNumber, Result res,
			final String inputModelName) throws Exception {

		ModelModif modif = new ModelModif();
		long[] runsOfUp = new long[res.runtimes];

		Resource aadlResource = loadInputResource(inputModelName, Aadl2aadlPackage.eNAME);

		Aadl2AadlTraceSpec aadlmodel = (Aadl2AadlTraceSpec) aadlResource.getContents().get(0);

		clearRightSystem(aadlmodel);

		engine = ViatraQueryEngine.on(new EMFScope(aadlmodel.eResource().getResourceSet()));
		transformation = new Aadl2aadlTransformation();
		transformation.initialize(aadlmodel, engine, inputModelName);

		System.out.println("Test " + testNumber + " Performing transformation:");

		transformation.execute();

		long t0, t1;
		for (int i = 0; i < res.runtimes; i++) {

			modif.updateConnectionInstance(aadlmodel);
			t0 = System.nanoTime();
			transformation.execute();
			t1 = System.nanoTime();
			runsOfUp[i] = t1 - t0;
		}

		res.setExecutionTimes((testNumber - 1), res.getMedian(runsOfUp));

		System.out.println("Test " + testNumber + " in " + res.getMedian(runsOfUp) + " ns");

		transformation.dispose();

		try { // save refined model
			aadlmodel.getRightSystem().eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {// save traces
			aadlmodel.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Transformation finished.");
		return aadlResource;
	}
}