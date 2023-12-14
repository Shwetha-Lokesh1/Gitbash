package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithDynamicXpath2 {
	
public static void main(String[] args) throws InterruptedException {
		

		
		//opening the cromedriver
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		 List<WebElement> allAddToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		 
		 for(WebElement allToCart:allAddToCart)
		 {
			 allToCart.click();
			 Thread.sleep(2000);
		 }
		 
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			
			 List<WebElement> AllremoveCB=driver.findElements(By.xpath("//table[@class='cart']//input[@type='checkbox']"));
					 
					 for(WebElement removeCB:AllremoveCB)
					 {
						 
						 removeCB.click();
					 
}

 driver.findElement(By.name("updatecart")).click();

    
					 
					 
			
			
				
}	
		


}