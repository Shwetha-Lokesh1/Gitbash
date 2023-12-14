package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		//opening the cromedriver
		WebDriver driver=new ChromeDriver();
		
		//path setup
	
		FileInputStream fis=new FileInputStream("./src/test/resources/PropertiesFile.properties.txt");
		
		//loading file to properties file
		
		Properties pro=new Properties();
		pro.load(fis);
		
		//fetching key from properties class
		
		String URL=pro.getProperty("url");
		String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
	
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys("USERNAME");
		driver.findElement(By.id("password")).sendKeys("PASSWORD");
		driver.findElement(By.id("login-button")).click();
				
	
	}

}
