package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Result {

	String testName;
	int runtimes; // number of runs
	int testSize; // number of AADL models
	protected static long[] executionTimes; // medians of execution times 
	long[] modelSizes; // number of port connection at system level

	public Result(String testName, int testsize, int runtimes) {
		this.testName = testName;
		this.testSize = testsize;
		this.runtimes = runtimes;
		executionTimes = new long[testSize];
		modelSizes = new long[testSize];

	}

	public long getMedian(long[] runs) {
		Arrays.sort(runs);
		return runs[runtimes / 2];
	}

	/**
	 * Create an excel file from the executionTimes table
	 * 
	 * @param testtime
	 */
	@SuppressWarnings("resource")
	public void testExcel(long testtime) {
		// Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Data");

		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "Test", "Model Size", "Execution Time" });

		for (int i = 0; i < testSize; i++) {
			data.put(Integer.toString(i + 2), 
					new Object[] {Integer.toString(i + 1), 
					Long.toString(modelSizes[i]),
					Long.toString(executionTimes[i]) });
		}

		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}
		try {
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File(testName + "_" + testtime + ".xlsx"));
			workbook.write(out);
			out.close();
			System.out.println(testName + ".xlsx written successfully on disk in " + testtime + " ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public long[] getExecutionTimes() {
		return executionTimes;
	}

	public void setExecutionTimes(int i, long executionTime) {
		Result.executionTimes[i] = executionTime;
	}

	public long[] getModelSizes() {
		return modelSizes;
	}

	public void setModelSizes(long[] modelSizes) {
		this.modelSizes = modelSizes;
	}

}