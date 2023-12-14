package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingSingleDataFromExcel {
	
	
		
		public static void main(String[] args) throws Throwable {
			
			
		//step 1 set path
			
			FileInputStream fes=new FileInputStream("./src/test/resources/MyExcelData.xlsx");
			
			//step 2: Open Workbook in read mode
			
			Workbook book=WorkbookFactory.create(fes);
			
			//Step 3: get control on sheet
			
		Sheet sheet=book.getSheet("Sheet1");
			
			//Step 3: get control on row
			Row row=sheet.getRow(0);
			
			//Step 3: get control on cell
			
			Cell cell=row.getCell(1);
			
			String ExcelData=cell.getStringCellValue();
			System.out.println(ExcelData);
			
			
			
		}	
}
			
			


