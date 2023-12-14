package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganization {
	
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
				
				driver.findElement(By.linkText("Organizations")).click();
				
				
				
				driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
				
				String Name="qpisers5";
				
				driver.findElement(By.name("accountname")).sendKeys("Name");
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
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//img[src='themes/softed/images/user.PNG']"));
				
				driver.findElement(By.xpath("//a[.='Sign Out']")).click();
				
				
			
	

}

}