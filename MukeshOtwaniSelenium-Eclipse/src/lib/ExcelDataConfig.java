package lib;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelPath) throws Exception
	{
		File src = new File(excelPath);
		FileInputStream fsc = new FileInputStream(src);
		wb = new XSSFWorkbook(fsc);
	}

	public String getData(int sheetNumber,int row, int col)
	{
		sheet1 = wb.getSheetAt(sheetNumber-1);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();
		return data ;
	}
}
