package contact;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.File_Utility;
import Generic_Utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class CreateContactwithOrganization extends BaseClass {
	
	public void CreateContactwithOrganization() throws Throwable {
	
	//public static void main(String[] args) throws Throwable {
		//driver related statement
		
//		File_Utility flib=new File_Utility();
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
		//driver related statement
//				WebDriverManager.chromedriver().setup();
//				
//				//opening the cromedriver
//				WebDriver driver=new ChromeDriver();
//				
//				//maximize the browser
//				
//				driver.manage().window().maximize();
		
//				WebDriverManager.chromedriver().setup();
//				
//				//opening the cromedriver
//				WebDriver driver=new ChromeDriver();
//				
//				//maximize the browser
//				
//				driver.manage().window().maximize();
				
		 File_Utility flib=new File_Utility();	
Webdriver_Utility wlib=new Webdriver_Utility();
				
				wlib.maximizingWinodw(driver);
				wlib.implicit_wait(driver);
				
				 
				 String URL = flib.getKeyAndValue("url");
				 String USERNAME = flib.getKeyAndValue("username");
				 String PASSWORD = flib.getKeyAndValue("password");
				
//FileInputStream fis=new FileInputStream("./src/test/resources/AdvseleniumCommonData.properties.txt");
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
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				
				driver.findElement(By.linkText("Organizations")).click();
				
				
				
				driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
				
				FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
				Workbook book=WorkbookFactory.create(fes);
				Sheet sheet=book.getSheet("Organization");
				
				//Step 3: get control on row
				Row row=sheet.getRow(0);
				
				//Step 3: get control on cell
				
				Cell cell=row.getCell(0);
				
				//String data = cell.getStringCellValue();
				
				DataFormatter format=new DataFormatter();
				String data = format.formatCellValue(cell);
				
				System.out.println(data);
				
				
				
				
				String Name="data";
				
				driver.findElement(By.name("accountname")).sendKeys(Name);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				
				
				Thread.sleep(2000);
				
				String OrgName=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
				
				
				if(OrgName.contains(Name))
					
				{
					
					System.out.println("organization created");
				}
				
				else
					
				{
					
					System.out.println("organization not created");
				}
				
				driver.findElement(By.linkText("Contacts")).click();
				
	}

}
