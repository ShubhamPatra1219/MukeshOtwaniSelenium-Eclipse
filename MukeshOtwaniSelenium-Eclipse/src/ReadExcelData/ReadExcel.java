package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Selenium Practices\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		ZipSecureFile.setMinInflateRatio(0);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet1 = wb.getSheet("Credentials");
	    String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	    System.out.println("Data From New Excel is: "+data0);
	    String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
	    System.out.println("Data From New Excel is: "+data1);
	    wb.close();
		
		File oldSrc = new File("D:\\Selenium Practices\\ExcelData\\OldSheet.xls");
		FileInputStream oldfis = new FileInputStream(oldSrc);
		ZipSecureFile.setMinInflateRatio(0);
		HSSFWorkbook oldwb = new HSSFWorkbook(oldfis);
		HSSFSheet sh1 = oldwb.getSheetAt(0);
		String info0 = sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data From Old Excel is: "+info0);
		String info1 = sh1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data From Old Excel is: "+info1);
		oldwb.close();

	}

}
