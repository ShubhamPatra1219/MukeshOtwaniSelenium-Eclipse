package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main(String[] args) throws Exception {
		
		File sc = new File("D:\\Selenium Practices\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(sc);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sht = wb.getSheet("Test Data");
		int rowCount = sht.getLastRowNum()+1;
		System.out.println("Total Number of Rows are "+rowCount);
		
		for(int i=0;i<=rowCount-1;i++)
		{
			String data0 = sht.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test Data from Row "+i+" is: "+data0);
		}
		
		wb.close();
	}

}
