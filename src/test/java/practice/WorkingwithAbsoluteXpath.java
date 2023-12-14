package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithAbsoluteXpath {

	public static void main(String[] args) {
		

		
		//opening the cromedriver
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Hp/Documents/abc/Locators%20demo.html");
		
		driver.findElement(By.xpath("/html/body/div[2]/form/input[1]")).sendKeys("Shwetha");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("Lokesh");
		
		driver.findElement(By.xpath("/html/body/div[2]/form/input[4]")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/form/input[6]")).sendKeys("ShweLokesh08");
		//driver.findElement(By.xpath("/html/body/div[2]/form/input[7]")).sendKeys("Pass@123_xyz");
		
		//driver.findElement(By.xpath("/html/body/div[2]/form/button[1]")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/form/button[2]")).click();)
		
	

	}

}
