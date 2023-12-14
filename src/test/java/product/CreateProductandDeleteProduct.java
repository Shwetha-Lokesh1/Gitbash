package product;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class CreateProductandDeleteProduct extends BaseClass{
	public void CreateProductandDeleteProduct() throws Throwable {
	
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
//		
//				WebDriverManager.chromedriver().setup();
//				
//				//opening the cromedriver
//				WebDriver driver=new ChromeDriver();
//				
//				//maximize the browser
//				
//				driver.manage().window().maximize();
				
				
		Webdriver_Utility wlib=new Webdriver_Utility();
		
		wlib.maximizingWinodw(driver);
		wlib.implicit_wait(driver);
		
		File_Utility flib=new File_Utility();
		 String URL = flib.getKeyAndValue("url");
		 String USERNAME = flib.getKeyAndValue("username");
		 String PASSWORD = flib.getKeyAndValue("password");
		
//		 FileInputStream fis=new FileInputStream("./src/test/resources/AdvseleniumCommonData.properties.txt");
//			
//			//loading file to properties file
//			
//			Properties pro=new Properties();
//			pro.load(fis);
//			
//			String URL=pro.getProperty("url");
//			String USERNAME=pro.getProperty("username");
//			String PASSWORD=pro.getProperty("password");
//			
			
			//open the browser
			driver.get(URL);
				
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
				
				driver.findElement(By.linkText("Products")).click();
				driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
				
				
//				Java_Utility jlib=new Java_Utility();
//				int ranNum=jlib.getRandomNum();
			
				//Random Approach To avoid Duplicates
			Random ran = new Random();
			int ranNum = ran.nextInt(1000);
			
			
			Excel_Utility elib=new Excel_Utility();
			String ProdName=elib.getExcelData("Product", 0, 0)+ranNum;
			
			
			//String Name="data"+ranNum;
			
//			FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
//			Workbook book=WorkbookFactory.create(fes);
//			Sheet sheet=book.getSheet("Campaign");
//			
//			//Step 3: get control on row
//			Row row=sheet.getRow(0);
//			
//			//Step 3: get control on cell
//			
//			Cell cell=row.getCell(0);
//			
//			//String data = cell.getStringCellValue();
//			
//			DataFormatter format=new DataFormatter();
//			String data = format.formatCellValue(cell);
//			
//			System.out.println(data);
				
//			String NAme = "Phone"+ranNum;
				driver.findElement(By.name("productname")).sendKeys(ProdName);
				System.out.println(ProdName);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				String prdName = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
				
				if(prdName.contains(ProdName))
				{
					System.out.println("Product Created");
				}
				else
				{
					System.out.println("Product not created");
				}
				

//		driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();
//
//		driver.findElement(By.xpath("//a[text()='"+ProdName+"']/../preceding-sibling::td/input")).click();
//
//		driver.findElement(By.xpath("//input[@value='Delete']")).click();
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
		
		Webdriver_Utility wlib1=new Webdriver_Utility();		
		wlib1.widowSwitching(driver, "Products&action");
		
		
		
		

	
		//validation
		List<WebElement> prdList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));

		boolean flag=false;

		for (WebElement prd : prdList)
		{
		String actData = prd.getText();//phone456
			if(actData.contains(ProdName))//phone360
		{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("product deleted");
		}
		else
		{
			System.out.println("Product not deleted");
		}
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		}
}
