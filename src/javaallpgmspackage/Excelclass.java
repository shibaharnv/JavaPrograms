/*package javaallpgmspackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  
		  
		  FileInputStream fs = new FileInputStream("C://Users//nshibaha//Desktop//WORK//7.2 Release//Seleniumtest.xlsx");
		  
		  Workbook wb = new XSSFWorkbook(fs);
		  
		  Sheet firstSheet = wb.getSheetAt(0);
		  
		  Cell value = firstSheet.getRow(0).getCell(0);
		  
		 System.out.println(value);
	
		
	}

}
*/