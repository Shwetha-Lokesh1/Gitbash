package Practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@Test(dataProvider="dataprovider_BookticketTest")
	
	public void booktickets(String src, String dest)
	
	{
		System.out.println("Book ticket from "+src+" to "+dest+"");
				
	}
	@DataProvider
	
	public Object[][] dataprovider_BookticketTest()
	{
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="Banglore";
		obj[0][1]="goa";
		
		
		obj[1][0]="Banglore";
		obj[1][1]="Mumbai";
		return obj;
		
		
		
	
	}

}
