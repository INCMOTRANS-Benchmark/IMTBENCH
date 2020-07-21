package fr.tpt.mem4csd.mtbench.aadl2aadl.eMoflon.tgg.tests;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;

public class UpdateTest extends AbstractAadl2AadlTest {

	protected UpdateTest(final String baseDir, final String predefinedAadlResDir) throws IOException {
		super(baseDir, predefinedAadlResDir);
	}

	@SuppressWarnings("unchecked")
	protected Resource executeAadl2AadlTransformation(int testNumber, Result res) throws Exception {

		ModelModif modif = new ModelModif();
		long[] runsOfUp = new long[res.runtimes];
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.OFF);
		UpdateTest init_fwd = new UpdateTest(filename, BASE_RESOURCES_DIR);

		System.out.println("Test " + testNumber + " Performing transformation:");

		// Batch
		init_fwd.forward();

		long t0, t1;
		for (int i = 0; i < res.runtimes; i++) {
			modif.updateConnectionInstance(init_fwd.getResourceHandler().getSourceResource());

			t0 = System.nanoTime();
			init_fwd.forward();
			t1 = System.nanoTime();
			runsOfUp[i] = t1 - t0;
		}

		res.setExecutionTimes((testNumber - 1), res.getMedian(runsOfUp));
		System.out.println("Test " + testNumber + " in " + res.getMedian(runsOfUp) + " ns");

		init_fwd.saveModels();
		init_fwd.terminate();
		System.out.println("Transformation finished.");
		return init_fwd.getResourceHandler().getTargetResource();
	}

}