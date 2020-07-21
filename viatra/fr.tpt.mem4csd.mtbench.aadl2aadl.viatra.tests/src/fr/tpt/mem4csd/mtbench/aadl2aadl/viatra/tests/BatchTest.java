package fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.tests;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage;
import fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.Aadl2aadlTransformation;

public class BatchTest extends AbstractAadl2AadlTest {

	protected BatchTest(final String baseDir) {
		super(baseDir);
	}

	ViatraQueryEngine engine;
	Aadl2aadlTransformation transformation;

	protected Resource executeAadl2AadlTransformation(int testNumber, Result res, final String inputModelName) {
		long[] runsOfBatch = new long[res.runtimes];

		final URI modelUri = createURI("inputs/instances/" + inputModelName, Aadl2aadlPackage.eNAME);
		final ResourceSet resSet = createResourceSet();
		final Resource aadlTraceResource = resSet.getResource(modelUri, true);
		Aadl2AadlTraceSpec aadlTraceModel = (Aadl2AadlTraceSpec) aadlTraceResource.getContents().get(0);
		System.out.println("Test " + testNumber + " Performing transformation:");
		clear(aadlTraceModel);

		engine = ViatraQueryEngine.on(new EMFScope(aadlTraceModel.eResource().getResourceSet()));
		transformation = new Aadl2aadlTransformation();
		long t0, t1;

		t0 = System.currentTimeMillis();
		transformation.initialize(aadlTraceModel, engine, inputModelName);
		t1 = System.currentTimeMillis();

		for (int i = 0; i < res.runtimes; i++) {
			t0 = System.nanoTime();
			transformation.execute();
			t1 = System.nanoTime();
			runsOfBatch[i] = t1 - t0;
		}
		transformation.dispose();
		res.setExecutionTimes((testNumber - 1), res.getMedian(runsOfBatch));
		System.out.println("Test " + testNumber + " in " + res.getMedian(runsOfBatch) + " ns");

		try {
			aadlTraceResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // save traces
		try {
			aadlTraceModel.getRightSystem().eResource().save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // save refined model

		System.out.println("Transformation finished.");
		return aadlTraceResource;
	}
}