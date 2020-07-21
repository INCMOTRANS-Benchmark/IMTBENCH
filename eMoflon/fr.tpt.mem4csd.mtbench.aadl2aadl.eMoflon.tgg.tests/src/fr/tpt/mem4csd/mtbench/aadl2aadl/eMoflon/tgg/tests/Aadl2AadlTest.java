package fr.tpt.mem4csd.mtbench.aadl2aadl.eMoflon.tgg.tests;

import org.eclipse.emf.ecore.resource.Resource;

public class Aadl2AadlTest {
	private static final String BASE_RESOURCES_DIR = "fr.tpt.mem4csd.mtbench.aadl2aadl.eMoflon.tgg.tests/resources/";

	public Aadl2AadlTest() throws Exception {
	}

	public static void main(String[] args) throws Exception {

		batchTest();
		addTest();
		updateTest();
		deleteTest();
	}

	public static void batchTest() throws Exception {
		// test parameters
		Result res = new Result("BatcheMoflon", 15, 1);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		System.out.println("Start Batch eMoflon");

		long t0 = System.currentTimeMillis();

		BatchTest test1 = new BatchTest("1_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl1 = test1.executeAadl2AadlTransformation(1, res);

		BatchTest test2 = new BatchTest("2_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl2 = test2.executeAadl2AadlTransformation(2, res);
//
		BatchTest test3 = new BatchTest("4_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl3 = test3.executeAadl2AadlTransformation(3, res);

		BatchTest test4 = new BatchTest("8_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl4 = test4.executeAadl2AadlTransformation(4, res);

		BatchTest test5 = new BatchTest("16_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl5 = test5.executeAadl2AadlTransformation(5, res);

		BatchTest test6 = new BatchTest("32_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl6 = test6.executeAadl2AadlTransformation(6, res);

		BatchTest test7 = new BatchTest("64_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl7 = test7.executeAadl2AadlTransformation(7, res);
//
		BatchTest test8 = new BatchTest("128_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl8 = test8.executeAadl2AadlTransformation(8, res);
//
		BatchTest test9 = new BatchTest("256_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl9 = test9.executeAadl2AadlTransformation(9, res);

		BatchTest test10 = new BatchTest("512_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl10 = test10.executeAadl2AadlTransformation(10, res);

		BatchTest test11 = new BatchTest("topology_test_i_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadltopo = test11.executeAadl2AadlTransformation(11, res);
//
		BatchTest test12 = new BatchTest("hierarchy1_PC_Complete_level1_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel0 = test12.executeAadl2AadlTransformation(12, res);
//

		BatchTest test13 = new BatchTest("hierarchy2_Top_level2_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel1 = test13.executeAadl2AadlTransformation(13, res);
//
		BatchTest test14 = new BatchTest("hierarchy3_TopTop_level3_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel2 = test14.executeAadl2AadlTransformation(14, res);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}

	public static void deleteTest() throws Exception {
		// test parameters
		Result res = new Result("DeleteMoflon", 15, 1);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level

		long t0 = System.currentTimeMillis();
		System.out.println("Start Delete eMoflon");

		DeleteTest test1 = new DeleteTest("1_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl1 = test1.executeAadl2AadlTransformation(1, res);

		DeleteTest test2 = new DeleteTest("2_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl2 = test2.executeAadl2AadlTransformation(2, res);

		DeleteTest test3 = new DeleteTest("4_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl3 = test3.executeAadl2AadlTransformation(3, res);

		DeleteTest test4 = new DeleteTest("8_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl4 = test4.executeAadl2AadlTransformation(4, res);

		DeleteTest test5 = new DeleteTest("16_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl5 = test5.executeAadl2AadlTransformation(5, res);

		DeleteTest test6 = new DeleteTest("32_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl6 = test6.executeAadl2AadlTransformation(6, res);

		DeleteTest test7 = new DeleteTest("64_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl7 = test7.executeAadl2AadlTransformation(7, res);

		DeleteTest test8 = new DeleteTest("128_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl8 = test8.executeAadl2AadlTransformation(8, res);

		DeleteTest test9 = new DeleteTest("256_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl9 = test9.executeAadl2AadlTransformation(9, res);

		DeleteTest test10 = new DeleteTest("512_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl10 = test10.executeAadl2AadlTransformation(10, res);

		DeleteTest test11 = new DeleteTest("topology_test_i_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadltopo = test11.executeAadl2AadlTransformation(11, res);

		DeleteTest test12 = new DeleteTest("hierarchy1_PC_Complete_level1_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel0 = test12.executeAadl2AadlTransformation(12, res);

		DeleteTest test13 = new DeleteTest("hierarchy2_Top_level2_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel1 = test13.executeAadl2AadlTransformation(13, res);

		DeleteTest test14 = new DeleteTest("hierarchy3_TopTop_level3_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel2 = test14.executeAadl2AadlTransformation(14, res);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}

	public static void addTest() throws Exception {
		// test parameters
		Result res = new Result("AddingeMoflon", 14, 1);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		System.out.println("Start Adding eMoflon");

		long t0 = System.currentTimeMillis();

		AddingTest test1 = new AddingTest("1_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl1 = test1.executeAadl2AadlTransformation(1, res);

		AddingTest test2 = new AddingTest("2_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl2 = test2.executeAadl2AadlTransformation(2, res);

		AddingTest test3 = new AddingTest("4_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl3 = test3.executeAadl2AadlTransformation(3, res);

		AddingTest test4 = new AddingTest("8_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl4 = test4.executeAadl2AadlTransformation(4, res);

		AddingTest test5 = new AddingTest("16_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl5 = test5.executeAadl2AadlTransformation(5, res);

		AddingTest test6 = new AddingTest("32_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl6 = test6.executeAadl2AadlTransformation(6, res);

		AddingTest test7 = new AddingTest("64_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl7 = test7.executeAadl2AadlTransformation(7, res);

		AddingTest test8 = new AddingTest("128_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl8 = test8.executeAadl2AadlTransformation(8, res);

		AddingTest test9 = new AddingTest("256_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl9 = test9.executeAadl2AadlTransformation(9, res);
//
		AddingTest test10 = new AddingTest("512_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl10 = test10.executeAadl2AadlTransformation(10, res);

		AddingTest test11 = new AddingTest("topology_test_i_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadltopo = test11.executeAadl2AadlTransformation(11, res);

		AddingTest test12 = new AddingTest("hierarchy1_PC_Complete_level1_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel0 = test12.executeAadl2AadlTransformation(12, res);

		AddingTest test13 = new AddingTest("hierarchy2_Top_level2_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel1 = test13.executeAadl2AadlTransformation(13, res);

		AddingTest test14 = new AddingTest("hierarchy3_TopTop_level3_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel2 = test14.executeAadl2AadlTransformation(14, res);

		long t1 = System.currentTimeMillis();
		res.testExcel(t1 - t0);
	}

	public static void updateTest() throws Exception {
		// test parameters
		Result res = new Result("UpdateMoflon", 15, 1);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		System.out.println("Start Update eMoflon");
		long t0 = System.currentTimeMillis();

		UpdateTest test1 = new UpdateTest("1_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl1 = test1.executeAadl2AadlTransformation(1, res);

		UpdateTest test2 = new UpdateTest("2_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl2 = test2.executeAadl2AadlTransformation(2, res);
//
		UpdateTest test3 = new UpdateTest("4_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl3 = test3.executeAadl2AadlTransformation(3, res);

		UpdateTest test4 = new UpdateTest("8_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl4 = test4.executeAadl2AadlTransformation(4, res);

		UpdateTest test5 = new UpdateTest("16_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl5 = test5.executeAadl2AadlTransformation(5, res);

		UpdateTest test6 = new UpdateTest("32_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl6 = test6.executeAadl2AadlTransformation(6, res);

		UpdateTest test7 = new UpdateTest("64_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl7 = test7.executeAadl2AadlTransformation(7, res);

		UpdateTest test8 = new UpdateTest("128_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl8 = test8.executeAadl2AadlTransformation(8, res);

		UpdateTest test9 = new UpdateTest("256_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl9 = test9.executeAadl2AadlTransformation(9, res);

		UpdateTest test10 = new UpdateTest("512_PC_Simple_Native_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadl10 = test10.executeAadl2AadlTransformation(10, res);

		UpdateTest test11 = new UpdateTest("topology_test_i_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadltopo = test11.executeAadl2AadlTransformation(11, res);
//
		UpdateTest test12 = new UpdateTest("hierarchy1_PC_Complete_level1_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel0 = test12.executeAadl2AadlTransformation(12, res);
//
		UpdateTest test13 = new UpdateTest("hierarchy2_Top_level2_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel1 = test13.executeAadl2AadlTransformation(13, res);

		UpdateTest test14 = new UpdateTest("hierarchy3_TopTop_level3_Instance.aaxl2", BASE_RESOURCES_DIR);
		final Resource aadl2aadllevel2 = test14.executeAadl2AadlTransformation(14, res);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}

}