package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class FetchDataFromExcel {
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fes=new FileInputStream("./src/test/resources/MyExcelData.xlsx");
		Workbook book=WorkbookFactory.create(fes);
		Sheet sheet=book.getSheet("Sheet1");
		
		//Step 3: get control on row
		Row row=sheet.getRow(0);
		
		//Step 3: get control on cell
		
		Cell cell=row.getCell(0);
		
		//String data = cell.getStringCellValue();
		
		DataFormatter format=new DataFormatter();
		String data = format.formatCellValue(cell);
		
		System.out.println(data);

}
}
