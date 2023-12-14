package practice;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class InsertSingleDataToExcel {
	
	public static void main(String[] args) throws Throwable {
		
		//FileInputStream fes=new FileInputStream("./src/test/resources/MyExcelData.xlsx");
		
		FileInputStream fes=new FileInputStream("C:\\Users\\Hp\\Desktop\\MyExcelData.xlsx");
		
		Workbook book=WorkbookFactory.create(fes);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		Row row=sheet.createRow(2);
		
		Cell cell=row.createCell(3);
		
		cell.setCellValue("Qspiders");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Hp\\Desktop\\MyExcelData.xlsx");
		book.write(fos);
		book.close();
		
		
		
		
	}

}
