package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Generic_Utility.Excel_Utility;

public class DataProviderforOrganization {
	@Test(dataProvider="getData")
	
	public void m1(String OrgName, String Phonenum, String emailId) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/index.php");
			
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(OrgName);
		driver.findElement(By.name("phone")).sendKeys(Phonenum);
		driver.findElement(By.name("email1")).sendKeys(emailId);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(1000);
		driver.quit();
	}
	
	@DataProvider
	
	public Object[][] getData() throws Throwable
	{
		Excel_Utility elib=new Excel_Utility();
		Object[][] obj=elib.readMultipleData("Sheet2");
		return obj;
		
//		Random ran=new Random();
//		int ranNum=ran.nextInt(1000);
//		
//		Object[][] obj=new Object[3][3];
//		obj[0][0]="AAA"+ranNum;
//		obj[0][1]="5676546456";
//		obj[0][2]="shwetha@123.com";
//		
//		obj[1][0]="BBb"+ranNum;
//		obj[1][1]="6767667667";
//		obj[1][2]="shwetha56@123.com";
//		
//		obj[2][0]="CCC"+ranNum;
//		obj[2][1]="8979797989";
//		obj[2][2]="shwetha78@123.com";
//		return obj;
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	


