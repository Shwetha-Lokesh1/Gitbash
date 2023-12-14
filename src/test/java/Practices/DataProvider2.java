package Practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utility.Excel_Utility;

public class DataProvider2 {
	
@Test(dataProvider="getData")
	
	public void booktickets(String src, String dest)
	
	{
		System.out.println("Book ticket from "+src+" to "+dest+"");
				
	}
@DataProvider

public Object[][] getData() throws Throwable
{
	Excel_Utility elib=new Excel_Utility();
	Object[][] value=elib.readMultipleData("Sheet1");
	return value;
	
	
}

}
