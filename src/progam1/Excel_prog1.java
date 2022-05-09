package progam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_prog1 
{
   public static void main(String[] args) throws IOException 
   {
	
	    String excelPath = "C:\\Users\\Kevin\\Desktop\\My sheets\\Book1.xlsx";
		
		//excel file read
		FileInputStream file = new FileInputStream(excelPath);
		
		//workbook read -->apachepoi
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//sheet read
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//row read
		XSSFRow row = sheet.getRow(0);
		
		//cell read
		XSSFCell cell = row.getCell(0);
		
		//value read--string value --word data
		String data = cell.getStringCellValue();
		System.out.println(data);
	   
	   
	   
   }
}
