package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {
	
	public static void main(String[] args) throws Throwable {
		//driver related statement
				WebDriverManager.chromedriver().setup();
				
				//opening the cromedriver
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				
				driver.manage().window().maximize();
				
				//open the browser
				driver.get("http://localhost:8888/index.php");
				
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
	
				driver.findElement(By.linkText("Products")).click();
				
				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
				
			
				
				
				driver.findElement(By.name("First Name")).sendKeys("Shwetha");
				driver.findElement(By.name("Last Name")).sendKeys("Lokesh");
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();	
				
				Thread.sleep(2000);
				
	driver.findElement(By.linkText("//a[@href='index.php?action=ListView&module=Contacts&parenttab=Marketing']")).click();
	
	
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	
				
	}			

	
}
