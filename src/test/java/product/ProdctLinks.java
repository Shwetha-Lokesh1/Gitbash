package product;

import java.util.Random;

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
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.LoginPage;

public class ProdctLinks extends BaseClass{
	@Test
	public void ProdctLinks() throws Throwable {
	
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
		File_Utility flib=new File_Utility();
		Webdriver_Utility wlib=new Webdriver_Utility();
		
		wlib.maximizingWinodw(driver);
		wlib.implicit_wait(driver);
		
		 
		 String URL = flib.getKeyAndValue("url");
		 String USERNAME = flib.getKeyAndValue("username");
		 String PASSWORD = flib.getKeyAndValue("password");
		
//FileInputStream fis=new FileInputStream("./src/test/resources/AdvseleniumCommonData.properties.txt");
//		
//		//loading file to properties file
//		
//		Properties pro=new Properties();
//		pro.load(fis);
//		
//		String URL=pro.getProperty("url");
//		String USERNAME=pro.getProperty("username");
//		String PASSWORD=pro.getProperty("password");
//		
		
		//open the browser
		driver.get(URL);
		
		
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
		
		
		//getter methods
//		LoginPage login=new LoginPage(driver);
//		login.getUserTextField().sendKeys(USERNAME);
//		login.getPasswordTextField().sendKeys(PASSWORD);
//		login.getLoginButton().click();
		
		//businesslogics
		LoginPage login=new LoginPage(driver);
		login.loginToApplication(USERNAME, PASSWORD);
//		
//		driver.get("http://localhost:8888/index.php");
//		
//		
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
		

				
				driver.findElement(By.linkText("Products")).click();
				driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
			
				//Random Approach To avoid Duplicates
				Java_Utility jlib=new Java_Utility();
				int ranNum=jlib.getRandomNum();
				
//				Random ran=new Random();
//				int ranNum=ran.nextInt(1000);
				
				
				
//				FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
//				Workbook book=WorkbookFactory.create(fes);
//				Sheet sheet=book.getSheet("Product");
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
				
				
				Excel_Utility elib=new Excel_Utility();
				String ProductName=elib.getExcelData("Product", 0, 0)+ranNum;
				
//			String NAme = "Phone"+ranNum;
				driver.findElement(By.name("productname")).sendKeys(ProductName);
				System.out.println(ProductName);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
		String prdName = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
			
		if(prdName.contains(ProductName))
		{
			System.out.println("Product Created");
		}
		else
		{
			System.out.println("Product not created");
		}

		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
			}

		}
