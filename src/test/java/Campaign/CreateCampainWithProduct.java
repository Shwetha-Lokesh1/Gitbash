package Campaign;

import java.io.FileInputStream;

import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import Practices.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.ValidationPage;
@Test

public class CreateCampainWithProduct extends BaseClass{
	
	
	
	public void CreateCampainWithProduct() throws Throwable {
	
	//public static void main(String[] args) throws Throwable {
		//driver related statement
		
//		 File_Utility flib=new File_Utility();
//		 WebDriver driver;
//		 String BROWSER = flib.getKeyAndValue("browser");
//		 
//		if(BROWSER.equalsIgnoreCase("chrome"))
//		 {
//			 WebDriverManager.chromedriver().setup();
//				 driver=new ChromeDriver();
//		 }
//		 
//		 else  if(BROWSER.equalsIgnoreCase("edge"))
//		 
//		 {
//			 WebDriverManager.edgedriver().setup();
//			  driver=new EdgeDriver();
//			 
//		 }
//		 
//		 else
//			 
//		 {
//			 driver=new ChromeDriver();
//		 }
////				WebDriverManager.chromedriver().setup();
//				
//				//opening the cromedriver
//				WebDriver driver=new ChromeDriver();
//				
//				//maximize the browser
//				
////				driver.manage().window().maximize();
				
				Webdriver_Utility wlib=new Webdriver_Utility();
				File_Utility flib=new File_Utility();
				wlib.maximizingWinodw(driver);
				wlib.implicit_wait(driver);
				
				 
				 String URL = flib.getKeyAndValue("url");
				 String USERNAME = flib.getKeyAndValue("username");
				 String PASSWORD = flib.getKeyAndValue("password");
				
//				 FileInputStream fis=new FileInputStream("./src/test/resources/AdvseleniumCommonData.properties.txt");
//					
//					//loading file to properties file
//					
//					Properties pro=new Properties();
//					pro.load(fis);
//					
//					String URL=pro.getProperty("url");
//					String USERNAME=pro.getProperty("username");
//					String PASSWORD=pro.getProperty("password");
//					
					
					//open the browser
					driver.get(URL);
				
				
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
				
				
				driver.findElement(By.linkText("Products")).click();
				
				driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
				
				//random approach
				
				Java_Utility jlib=new Java_Utility();
				int ranNum=jlib.getRandomNum();
				
//				Random ran=new Random();
//				int ranNum=ran.nextInt(1000);
//				

				
				Excel_Utility elib=new Excel_Utility();
				String CampName=elib.getExcelData("Campaign", 0, 0)+ranNum;
				
				
				//String Name="data"+ranNum;
				
//				FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
//				Workbook book=WorkbookFactory.create(fes);
//				Sheet sheet=book.getSheet("Campaign");
//				
//				//Step 3: get control on row
//				Row row=sheet.getRow(0);
//				
//				//Step 3: get control on cell
//				
//				Cell cell=row.getCell(0);
//				
//				//String data = cell.getStringCellValue();
//				
//				DataFormatter format=new DataFormatter();
//				String data = format.formatCellValue(cell);
//				
//				System.out.println(data);
				
			
				
				driver.findElement(By.name("productname")).sendKeys(CampName);
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();	
				
ValidationPage validate=new ValidationPage(driver);
				
				String ActData=validate.productValidate();
				//Assert.assertEquals(ActData, CampName);
				SoftAssert soft=new SoftAssert();
			
				soft.assertEquals(ActData, CampName);
				soft.assetAll();
//				
//				
//				Thread.sleep(2000);
//				
//				String Camp=driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
//				
//				
//				if(Camp.contains(CampName))
//					
//				{
//					
//					System.out.println("product created");
//				}
//				
//				else
//					
//				{
//					
//					System.out.println("product not created");
//				
//				
//				}
				driver.findElement(By.linkText("More")).click();
				
				driver.findElement(By.linkText("Campaigns")).click();
				
				driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
				
				driver.findElement(By.xpath("//img[@alt='Select']")).click();
				
				Webdriver_Utility wlib1=new Webdriver_Utility();
				
				wlib1.widowSwitching(driver, "Products&action");
				
//				Set<String> allWin = driver.getWindowHandles();
//				
//				Iterator<String> win = allWin.iterator();
//				
//				while(win.hasNext())
//					
//				{
//					String winText = win.next();
//					driver.switchTo().window(winText);
//					
//					String title = driver.getTitle();
//					
//				if(title.contains("Products&action"))
//					
//				{
//					break;
//				}
//				}
				
			
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(CampName);
				
				driver.findElement(By.xpath("//input[@name='search']")).click();
				
				//dynamic path
				
				
				driver.findElement(By.xpath("//a[text()='"+CampName+"']")).click();
				
				
				

				Set<String> allWin1 = driver.getWindowHandles();
				
				Iterator<String> win1 = allWin1.iterator();
				
				while(win1.hasNext())
					
				{
					String winText1 = win1.next();
					driver.switchTo().window(winText1);
					
					String title = driver.getTitle();
					
				if(title.contains("Campaigns&action"))
					
				{
					break;
				}
				}
				
				
				String campName = "Marketing"+ranNum;
				
				driver.findElement(By.xpath("campaignname")).sendKeys(campName);
				
				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
				driver.findElement(By.linkText("Sign Out")).click();
				
				
			
		
	
	}

}
