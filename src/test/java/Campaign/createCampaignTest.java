package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.CampaignPlusSignPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class createCampaignTest extends BaseClass{
	
	public void createCampaignTest() throws Throwable {
	
		HomePage home=new HomePage(driver);
		home.clickOnMoreLink();
		home.clickOnCampaignsLink();
		
		CampaignPlusSignPage plus=new CampaignPlusSignPage(driver);
		plus.clickCampaignPlus();

		
		
		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRandomNum();
		
		Excel_Utility elib=new Excel_Utility();
		String CampaginName = elib.getExcelData("Campaigns", 0, 0)+ranNum;
		
		
		driver.findElement(By.name("campaignname")).sendKeys(CampaginName);
	    
		
	    driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])")).click();
		 Thread.sleep(2000);
		 String Actdata = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
		if(Actdata.contains(CampaginName))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		 Thread.sleep(2000);
		
		  driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		  driver.findElement(By.linkText("Sign Out")).click();
	}

	
}



