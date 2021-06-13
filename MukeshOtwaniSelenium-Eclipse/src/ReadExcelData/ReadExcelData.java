package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		ExcelDataConfig excel = new ExcelDataConfig("D:\\Selenium Practices\\ExcelData\\TestData.xlsx");
		System.out.println("The Fetched Value is: " + excel.getData(1, 0, 0));
	}

}
