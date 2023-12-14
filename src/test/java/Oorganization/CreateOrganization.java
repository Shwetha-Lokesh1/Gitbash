package Oorganization;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import Practices.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.CreateCampaignPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.ValidationPage;
@Listeners(Generic_Utility.ListenerImplementation.class)
@Test(groups="SmokeTest")
public class CreateOrganization extends BaseClass{
	@Test(retryAnalyzer=Generic_Utility.RetryImplemantaion.class)
	
	public void CreateOrganization() throws Throwable {
	
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
			 
			 
//				WebDriverManager.chromedriver().setup();
//				
//				//opening the cromedriver
//				WebDriver driver=new ChromeDriver();
//				
				//maximize the browser
				
//				driver.manage().window().maximize();
		 File_Utility flib=new File_Utility();				
Webdriver_Utility wlib=new Webdriver_Utility();
				
				wlib.maximizingWinodw(driver);
				wlib.implicit_wait(driver);
//				 File_Utility flib=new File_Utility();
				 
				 String URL = flib.getKeyAndValue("url");
				 String USERNAME = flib.getKeyAndValue("username");
				 String PASSWORD = flib.getKeyAndValue("password");
				
//FileInputStream fis=new FileInputStream("./src/test/resources/ContactwithOrganization.properties.txt");
//				
//				//loading file to properties file
//				
//				Properties pro=new Properties();
//				pro.load(fis);
//				
//				String URL=pro.getProperty("url");
//				String USERNAME=pro.getProperty("username");
//				String PASSWORD=pro.getProperty("password");
//				
				
				//open the browser
				driver.get(URL);
				
				
//				driver.findElement(By.name("user_name")).sendKeys("admin");
//				driver.findElement(By.name("user_password")).sendKeys("admin");
//				driver.findElement(By.id("submitButton")).click();
				
				
				//getter methods
//				LoginPage login=new LoginPage(driver);
//				login.getUserTextField().sendKeys(USERNAME);
//				login.getPasswordTextField().sendKeys(PASSWORD);
//				login.getLoginButton().click();
				
				//businesslogics
				LoginPage login=new LoginPage(driver);
	
			login.loginToApplication(USERNAME, PASSWORD);
//				
//				driver.get("http://localhost:8888/index.php");
//				
//				
//				driver.findElement(By.name("user_name")).sendKeys("admin");
//				driver.findElement(By.name("user_password")).sendKeys("admin");
//				driver.findElement(By.id("submitButton")).click();
				
				
//	
				
				HomePage home=new HomePage(driver);
				home.clickOnOrganizationsLink();
				
//				
//				driver.findElement(By.linkText("Organizations")).click();
//				
//				
//				
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				
				Java_Utility jlib=new Java_Utility();
				int ranNum=jlib.getRandomNum();
				
				
//				Random ran=new Random();
//				int ranNum = ran.nextInt(1000);
				
				
				Excel_Utility elib=new Excel_Utility();
				String OrgName=elib.getExcelData("Organization", 0, 0)+ranNum;
				

				
				
//				FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
//				Workbook book=WorkbookFactory.create(fes);
//				Sheet sheet=book.getSheet("Organization");
//				
//				//Step 3: get control on row
//				Row row=sheet.getRow(0);
//				
//				//Step 3: get control on cell
//				
//				Cell cell=row.getCell(0);
//				
//				String data = cell.getStringCellValue();
//				
//				DataFormatter format=new DataFormatter();
//				String data = format.formatCellValue(cell)+ranNum;
			
//			System.out.println(data);
				
				//String OrgName = "TestYantra"+ranNum;
//				driver.findElement(By.name("accountname")).sendKeys(OrgName);
//
//				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//				Thread.sleep(1000);
				
ValidationPage validate=new ValidationPage(driver);
				
				String ActData=validate.OrgValidate();
				//Assert.assertEquals(ActData, OrgName);
				SoftAssert soft=new SoftAssert();
				soft.assertEquals(ActData, OrgName);
				soft.assetAll();
//				String PrdName = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
//				if(PrdName.contains(OrgName))
//				{
//					System.out.println("Organization Created");
//				}
//				else
//				{
//					System.out.println("Organization not created");
//				}

				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
				driver.findElement(By.linkText("Sign Out")).click();
					}

				

			
			
}

