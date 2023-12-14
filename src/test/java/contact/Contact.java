package contact;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.File_Utility;
import Generic_Utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Contact extends BaseClass{
	
	
	
	public void Contact() throws Throwable {
	
	//public static void main(String[] args) throws Throwable {
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
				
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
	
				driver.findElement(By.linkText("Products")).click();
				
				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
				
			
				Random ran=new Random();
				int ranNum=ran.nextInt(1000);
				
				String Name="Royalenfield"+ranNum;
				String Name1="Royalenfield"+ranNum;
				
				driver.findElement(By.name("First Name")).sendKeys("Name");
				driver.findElement(By.name("Last Name")).sendKeys("Name1");
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();	
				
		
				

	
				
	}			

	
}
