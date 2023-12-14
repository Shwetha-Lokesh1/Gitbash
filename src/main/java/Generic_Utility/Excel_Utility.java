package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	//this method is used to fetch data from excel sheet
	
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
	
		Workbook book=WorkbookFactory.create(fes);
		Sheet sheet=book.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cel=row.getCell(cellNum);
		
		String getExcelData=cel.getStringCellValue();
		return getExcelData;

	}
	
	public Object[][] readMultipleData(String sheetName) throws Throwable 
	{
		FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book=WorkbookFactory.create(fes);
		Sheet sheet=book.getSheet(sheetName);
		int lastRow=sheet.getLastRowNum()+1;
		short lastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++)
		{
			for(int j=1;j<lastCell; j++)
			{
		
		obj[i][j]=sheet.getRow(i).getCell(j).toString();
	}
}
		return obj;
	}
}
