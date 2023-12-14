package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProdctLinks {
	
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
				
				
				driver.findElement(By.linkText("Contacts")).click();
				
				driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
				
				driver.findElement(By.name("productname")).sendKeys("Cycle");
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();			
	}
	

}
