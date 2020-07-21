package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.test;

import java.util.Date;

import org.eclipse.emf.ecore.resource.Resource;

import de.mdelab.mltgg.mote2.TransformationDirectionEnum;

public class Aadl2AadlTest {

	private final static String BASE_RESOURCES_DIR = "resources/";
	static Date date = new Date();

	public Aadl2AadlTest() {
	}

	public static void main(String[] args) throws Exception {
		batchTest();
		addTest();
		updateTest();
		deleteTest();
	}

	public static void batchTest() throws Exception {
		// test parameters
		Result res = new Result(date + "_BatchMote", 14, 3);
		BatchTest batchtest = new BatchTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.currentTimeMillis();
		System.out.println("Start Batch Mote");
		final Resource aadl2aadl1 = batchtest.executeAadl2AadlTransformation(1, res, "1_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl2 = batchtest.executeAadl2AadlTransformation(2, res, "2_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl3 = batchtest.executeAadl2AadlTransformation(3, res, "4_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl4 = batchtest.executeAadl2AadlTransformation(4, res, "8_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl5 = batchtest.executeAadl2AadlTransformation(5, res, "16_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl6 = batchtest.executeAadl2AadlTransformation(6, res, "32_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl7 = batchtest.executeAadl2AadlTransformation(7, res, "64_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl8 = batchtest.executeAadl2AadlTransformation(8, res, "128_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl9 = batchtest.executeAadl2AadlTransformation(9, res, "256_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl10 = batchtest.executeAadl2AadlTransformation(10, res, "512_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadltopo = batchtest.executeAadl2AadlTransformation(11, res, "topology_test_i_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel0 = batchtest.executeAadl2AadlTransformation(12, res,
				"hierarchy1_PC_Complete_level1_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel1 = batchtest.executeAadl2AadlTransformation(13, res,
				"hierarchy2_Top_level2_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel2 = batchtest.executeAadl2AadlTransformation(14, res,
				"hierarchy3_TopTop_level3_Instance", TransformationDirectionEnum.FORWARD);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}

	public static void addTest() throws Exception {
		// test parameters
		Result res = new Result(date + "_AddingMote", 14, 1);
		AddingTest uptest = new AddingTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.currentTimeMillis();
		System.out.println("Start Add Mote");
		final Resource aadl2aadl1 = uptest.executeAadl2AadlTransformation(1, res, "1_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl2 = uptest.executeAadl2AadlTransformation(2, res, "2_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl3 = uptest.executeAadl2AadlTransformation(3, res, "4_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl4 = uptest.executeAadl2AadlTransformation(4, res, "8_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl5 = uptest.executeAadl2AadlTransformation(5, res, "16_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl6 = uptest.executeAadl2AadlTransformation(6, res, "32_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl7 = uptest.executeAadl2AadlTransformation(7, res, "64_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl8 = uptest.executeAadl2AadlTransformation(8, res, "128_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl9 = uptest.executeAadl2AadlTransformation(9, res, "256_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl10 = uptest.executeAadl2AadlTransformation(10, res, "512_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadltopo = uptest.executeAadl2AadlTransformation(11, res, "topology_test_i_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel0 = uptest.executeAadl2AadlTransformation(12, res,
				"hierarchy1_PC_Complete_level1_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel1 = uptest.executeAadl2AadlTransformation(13, res,
				"hierarchy2_Top_level2_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel2 = uptest.executeAadl2AadlTransformation(14, res,
				"hierarchy3_TopTop_level3_Instance", TransformationDirectionEnum.FORWARD);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}

	public static void updateTest() throws Exception {
		// test parameters
		Result res = new Result(date + "_UpdateMote", 14, 1);
		UpdateTest uptest = new UpdateTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.currentTimeMillis();
		System.out.println("Start Update Mote");
		final Resource aadl2aadl1 = uptest.executeAadl2AadlTransformation(1, res, "1_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl2 = uptest.executeAadl2AadlTransformation(2, res, "2_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl3 = uptest.executeAadl2AadlTransformation(3, res, "4_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl4 = uptest.executeAadl2AadlTransformation(4, res, "8_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl5 = uptest.executeAadl2AadlTransformation(5, res, "16_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl6 = uptest.executeAadl2AadlTransformation(6, res, "32_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl7 = uptest.executeAadl2AadlTransformation(7, res, "64_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl8 = uptest.executeAadl2AadlTransformation(8, res, "128_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl9 = uptest.executeAadl2AadlTransformation(9, res, "256_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl10 = uptest.executeAadl2AadlTransformation(10, res, "512_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadltopo = uptest.executeAadl2AadlTransformation(11, res, "topology_test_i_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel0 = uptest.executeAadl2AadlTransformation(12, res,
				"hierarchy1_PC_Complete_level1_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel1 = uptest.executeAadl2AadlTransformation(13, res,
				"hierarchy2_Top_level2_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel2 = uptest.executeAadl2AadlTransformation(14, res,
				"hierarchy3_TopTop_level3_Instance", TransformationDirectionEnum.FORWARD);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}

	public static void deleteTest() throws Exception {
		// test parameters
		Result res = new Result(date + "_DeleteMote", 14, 1);
		DeleteTest uptest = new DeleteTest(BASE_RESOURCES_DIR);
		long[] sizes = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 3, 1, 1, 1 };
		res.setModelSizes(sizes);
		// port connections at system level
		long t0 = System.currentTimeMillis();
		System.out.println("Start Delete Mote");
		final Resource aadl2aadl1 = uptest.executeAadl2AadlTransformation(1, res, "1_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl2 = uptest.executeAadl2AadlTransformation(2, res, "2_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl3 = uptest.executeAadl2AadlTransformation(3, res, "4_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl4 = uptest.executeAadl2AadlTransformation(4, res, "8_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl5 = uptest.executeAadl2AadlTransformation(5, res, "16_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl6 = uptest.executeAadl2AadlTransformation(6, res, "32_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl7 = uptest.executeAadl2AadlTransformation(7, res, "64_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl8 = uptest.executeAadl2AadlTransformation(8, res, "128_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl9 = uptest.executeAadl2AadlTransformation(9, res, "256_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadl10 = uptest.executeAadl2AadlTransformation(10, res, "512_PC_Simple_Native_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadltopo = uptest.executeAadl2AadlTransformation(11, res, "topology_test_i_Instance",
				TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel0 = uptest.executeAadl2AadlTransformation(12, res,
				"hierarchy1_PC_Complete_level1_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel1 = uptest.executeAadl2AadlTransformation(13, res,
				"hierarchy2_Top_level2_Instance", TransformationDirectionEnum.FORWARD);

		final Resource aadl2aadllevel2 = uptest.executeAadl2AadlTransformation(14, res,
				"hierarchy3_TopTop_level3_Instance", TransformationDirectionEnum.FORWARD);

		long t1 = System.currentTimeMillis();

		res.testExcel(t1 - t0);
	}
}