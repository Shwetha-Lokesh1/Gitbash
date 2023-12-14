package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithDynamicXpath {
	
public static void main(String[] args) {
		

		
		//opening the cromedriver
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Jewelry")).click();
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		
		Select s=new Select(dropdown);
				
			for(int i=0; i<6;i++)
				
			{
				s.selectByIndex(i);
				String name=driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]//a")).getText();
				System.out.println(name);
				
				dropdown=driver.findElement(By.id("products-orderby"));
				s=new Select(dropdown);
				
			}
				driver.close();				}
		


}
