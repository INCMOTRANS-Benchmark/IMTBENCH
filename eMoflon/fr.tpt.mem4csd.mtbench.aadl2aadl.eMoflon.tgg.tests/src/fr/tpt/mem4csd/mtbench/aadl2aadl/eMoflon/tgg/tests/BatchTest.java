package fr.tpt.mem4csd.mtbench.aadl2aadl.eMoflon.tgg.tests;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;

public class BatchTest extends AbstractAadl2AadlTest {

	protected BatchTest(final String baseDir, final String predefinedAadlResDir) throws IOException {
		super(baseDir, predefinedAadlResDir);
	}

	@SuppressWarnings("unchecked")
	protected Resource executeAadl2AadlTransformation(int testNumber, Result res) throws Exception {
		long[] runsOfBatch = new long[res.runtimes];
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.OFF);
		long t0, t1;
		BatchTest init_fwd = new BatchTest(filename, BASE_RESOURCES_DIR);
		System.out.println("Test " + testNumber + " Performing transformation:");

		for (int i = 0; i < res.runtimes; i++) {

			t0 = System.nanoTime();
			init_fwd.forward();
			t1 = System.nanoTime();
			runsOfBatch[i] = t1 - t0;

		}
		res.setExecutionTimes((testNumber - 1), res.getMedian(runsOfBatch));

		System.out.println("Test " + testNumber + " in " + res.getMedian(runsOfBatch) + " ns");

		init_fwd.saveModels();
		init_fwd.terminate();
		System.out.println("Transformation finished.");

		return init_fwd.getResourceHandler().getTargetResource();
	}

}