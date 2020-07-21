package fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.tests;

import java.util.Date;

import org.eclipse.emf.ecore.resource.Resource;

public class Aadl2AadlTest {

	private final static String BASE_RESOURCES_DIR = "resources/";
	static Date date = new Date();

	public Aadl2AadlTest() {
	}

	public static void main(String[] args) throws Exception {
		
		long t0 = System.currentTimeMillis();

		batchtest();
		addtest();
		updatetest();
		deletetest();
		long t1 = System.currentTimeMillis();
		System.out.println("Viatra time for All tests " + (t1 - t0) + " ms");
	}


	public static void batchtest() throws Exception {
		// test parameters
		Result res = new Result("BatchViatra", 14, 1);
		BatchTest test = new BatchTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1, 1, 1, 3 };
		res.setModelSizes(sizes);
		// port connections at system level
		System.out.println("Start Batch Viatra");
		long t0 = System.currentTimeMillis();

		final Resource aadl2aadl1 = test.executeAadl2AadlTransformation(1, res, "test1");
		final Resource aadl2aadl2 = test.executeAadl2AadlTransformation(2, res, "test2");
		final Resource aadl2aadl3 = test.executeAadl2AadlTransformation(3, res, "test3");
		final Resource aadl2aadl4 = test.executeAadl2AadlTransformation(4, res, "test4");
		final Resource aadl2aadl5 = test.executeAadl2AadlTransformation(5, res, "test5");
		final Resource aadl2aadl6 = test.executeAadl2AadlTransformation(6, res, "test6");
		final Resource aadl2aadl7 = test.executeAadl2AadlTransformation(7, res, "test7");
		final Resource aadl2aadl8 = test.executeAadl2AadlTransformation(8, res, "test8");
		final Resource aadl2aadl9 = test.executeAadl2AadlTransformation(9, res, "test9");
		final Resource aadl2aadl10 = test.executeAadl2AadlTransformation(10, res, "test10");

		final Resource aadl2aadl11 = test.executeAadl2AadlTransformation(11, res, "hierarchy1");
		final Resource aadl2aadl12 = test.executeAadl2AadlTransformation(12, res, "hierarchy2");
		final Resource aadl2aadl13 = test.executeAadl2AadlTransformation(13, res, "hierarchy3");
		final Resource aadl2aadl14 = test.executeAadl2AadlTransformation(14, res, "topology");

		long t1 = System.currentTimeMillis();
		res.testExcel(t1 - t0);
	}

	public static void addtest() throws Exception {
		// test parameters
		Result res = new Result("AddingViatra", 14, 1);

		AddingTest test = new AddingTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1, 1, 1, 3 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.nanoTime();

		final Resource aadl2aadl1 = test.executeAadl2AadlTransformation(1,res, "test1");
		final Resource aadl2aadl2 = test.executeAadl2AadlTransformation(2, res, "test2");
		final Resource aadl2aadl3 = test.executeAadl2AadlTransformation(3, res, "test3");
		final Resource aadl2aadl4 = test.executeAadl2AadlTransformation(4,  res, "test4");
		final Resource aadl2aadl5 = test.executeAadl2AadlTransformation(5, res, "test5");
		final Resource aadl2aadl6 = test.executeAadl2AadlTransformation(6, res, "test6");
		final Resource aadl2aadl7 = test.executeAadl2AadlTransformation(7, res, "test7");
		final Resource aadl2aadl8 = test.executeAadl2AadlTransformation(8, res, "test8");
		final Resource aadl2aadl9 = test.executeAadl2AadlTransformation(9, res, "test9");
		final Resource aadl2aadl10 = test.executeAadl2AadlTransformation(10, res, "test10");

		final Resource aadl2aadl11 = test.executeAadl2AadlTransformation(11, res, "hierarchy1");
		final Resource aadl2aadl12 = test.executeAadl2AadlTransformation(12, res, "hierarchy2");
		final Resource aadl2aadl13 = test.executeAadl2AadlTransformation(13, res, "hierarchy3");

		final Resource aadl2aadl14 = test.executeAadl2AadlTransformation(14, res, "test15");
		long t1 = System.nanoTime();
		res.testExcel(t1 - t0);
	}

	public static void updatetest() throws Exception {
		// test parameters
		Result res = new Result("UpdateViatra", 14, 1);
		UpdateTest test = new UpdateTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1, 1, 1, 3 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.currentTimeMillis();

		final Resource aadl2aadl1 = test.executeAadl2AadlTransformation(1,res, "test1");
		final Resource aadl2aadl2 = test.executeAadl2AadlTransformation(2, res, "test2");
		final Resource aadl2aadl3 = test.executeAadl2AadlTransformation(3, res, "test3");
		final Resource aadl2aadl4 = test.executeAadl2AadlTransformation(4,  res, "test4");
		final Resource aadl2aadl5 = test.executeAadl2AadlTransformation(5, res, "test5");
		final Resource aadl2aadl6 = test.executeAadl2AadlTransformation(6, res, "test6");
		final Resource aadl2aadl7 = test.executeAadl2AadlTransformation(7, res, "test7");
		final Resource aadl2aadl8 = test.executeAadl2AadlTransformation(8, res, "test8");
		final Resource aadl2aadl9 = test.executeAadl2AadlTransformation(9, res, "test9");
		final Resource aadl2aadl10 = test.executeAadl2AadlTransformation(10, res, "test10");

		final Resource aadl2aadl12 = test.executeAadl2AadlTransformation(11, res, "hierarchy1");
		final Resource aadl2aadl13 = test.executeAadl2AadlTransformation(12, res, "hierarchy2");
		final Resource aadl2aadl14 = test.executeAadl2AadlTransformation(13, res, "hierarchy3");
		final Resource aadl2aadl15 = test.executeAadl2AadlTransformation(14, res, "test15");

		long t1 = System.currentTimeMillis();
		res.testExcel(t1 - t0);
	}

	public static void deletetest() throws Exception {
		// test parameters
		Result res = new Result("DeleteViatra", 14, 1);
		DeleteTest test = new DeleteTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1, 1, 1, 3 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.currentTimeMillis();

		final Resource aadl2aadl1 = test.executeAadl2AadlTransformation(1,res, "test1");
		final Resource aadl2aadl2 = test.executeAadl2AadlTransformation(2, res, "test2");
		final Resource aadl2aadl3 = test.executeAadl2AadlTransformation(3, res, "test3");
		final Resource aadl2aadl4 = test.executeAadl2AadlTransformation(4,  res, "test4");
		final Resource aadl2aadl5 = test.executeAadl2AadlTransformation(5, res, "test5");
		final Resource aadl2aadl6 = test.executeAadl2AadlTransformation(6, res, "test6");
		final Resource aadl2aadl7 = test.executeAadl2AadlTransformation(7, res, "test7");
		final Resource aadl2aadl8 = test.executeAadl2AadlTransformation(8, res, "test8");
		final Resource aadl2aadl9 = test.executeAadl2AadlTransformation(9, res, "test9");
		final Resource aadl2aadl10 = test.executeAadl2AadlTransformation(10, res, "test10");

		final Resource aadl2aadl11 = test.executeAadl2AadlTransformation(11, res, "hierarchy1");
		final Resource aadl2aadl12 = test.executeAadl2AadlTransformation(12, res, "hierarchy2");
		final Resource aadl2aadl13 = test.executeAadl2AadlTransformation(13, res, "hierarchy3");
		final Resource aadl2aadl14 = test.executeAadl2AadlTransformation(14, res, "test15");

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}
}