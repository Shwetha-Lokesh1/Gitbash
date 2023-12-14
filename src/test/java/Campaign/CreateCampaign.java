package Campaign;


import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.File_Utility;
import Generic_Utility.Java_Utility;
import Generic_Utility.Webdriver_Utility;
import Practices.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.CampaignPlusSignPage;
import pomRepository.CreateCampaignPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.ValidationPage;
//@Listeners(Generic_Utility.ListenerImplementation.class)
@Listeners(Generic_Utility.ExtentImplemantaion.class)
public class CreateCampaign extends BaseClass{
	
	@Test(retryAnalyzer=Generic_Utility.RetryImplemantaion.class)
	public void CreateCampaign() throws Throwable {
	
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
//		//driver related statement
//				WebDriverManager.chromedriver().setup();
//				
//				//opening the cromedriver
//				WebDriver driver=new ChromeDriver();
//				
//				//maximize the browser
//				
//				driver.manage().window().maximize();
//		File_Utility flib=new File_Utility();		
//	Webdriver_Utility wlib=new Webdriver_Utility();
//				
//				wlib.maximizingWinodw(driver);
//				wlib.implicit_wait(driver);
//				
//				 
//				 String URL = flib.getKeyAndValue("url");
//				 String USERNAME = flib.getKeyAndValue("username");
//				 String PASSWORD = flib.getKeyAndValue("password");
				
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
//				driver.get(URL);
				
				
//				driver.findElement(By.name("user_name")).sendKeys("admin");
//				driver.findElement(By.name("user_password")).sendKeys("admin");
//				driver.findElement(By.id("submitButton")).click();
				
				
				//getter methods
//				LoginPage login=new LoginPage(driver);
//				login.getUserTextField().sendKeys(USERNAME);
//				login.getPasswordTextField().sendKeys(PASSWORD);
//				login.getLoginButton().click();
				
				//businesslogics
//				LoginPage login=new LoginPage(driver);
//	
//			login.loginToApplication(USERNAME, PASSWORD);
//				
//				driver.get("http://localhost:8888/index.php");
//				
//				
//				driver.findElement(By.name("user_name")).sendKeys("admin");
//				driver.findElement(By.name("user_password")).sendKeys("admin");
//				driver.findElement(By.id("submitButton")).click();
				
				
//				WebElement moreLinks=driver.findElement(By.linkText("More"));
//				Actions  act=new Actions(driver);
//				act.moveToElement(moreLinks).perform();
//				driver.findElement(By.linkText("Campaigns")).click();
			
			HomePage home=new HomePage(driver);
			home.clickOnMoreLink();
			home.clickOnCampaignsLink();
				
//				driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
			
			
			CampaignPlusSignPage plus=new CampaignPlusSignPage(driver);
			plus.clickCampaignPlus();
				
				Java_Utility jlib=new Java_Utility();
				int ranNum=jlib.getRandomNum();
				
//				Random ran=new Random();
//				int ranNum=ran.nextInt(1000);
//				
//				
//				FileInputStream fes=new FileInputStream("./src/test/resources/TestData.xlsx");
//				Workbook book=WorkbookFactory.create(fes);
//				Sheet sheet=book.getSheet("Organization");
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
				String CampaignName=elib.getExcelData("Campaigns", 0, 0)+ranNum;
				
//				//Random Approach To avoid Duplicates
//				Random ran = new Random();
//				int ranNum = ran.nextInt(1000);
//				String campName = "Marketing"+ranNum;"
				
				CreateCampaignPage campaign=new CreateCampaignPage(driver);
				campaign.campaignName(CampaignName);
				campaign.clickOnSaveButton();
//				Assert.assertEquals(false, true);
				
//				driver.findElement(By.name("campaignname")).sendKeys(CampaignName);
//				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				ValidationPage validate=new ValidationPage(driver);
				
				String ActData=validate.CampValidate();
				//Assert.assertEquals(ActData, CampaignName);
				SoftAssert soft=new SoftAssert();
				soft.assertEquals(ActData, CampaignName);
				soft.assetAll();
				
//		String Actdata = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
//			
//				
//				if(Actdata.contains(CampaignName))
//			{
//				System.out.println("pass");
//			}
//			else
//				{
//					System.out.println("fail");
//				}
				
//				ValidationPage campValidate=new ValidationPage(driver)	;
//				
//				//validation by getter method
//				
//				String Actdata1=campValidate.getValidateCampaign().getText();
			
				
				//String Actdata = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
//				
//					
//					if(Actdata.contains(CampaignName))
//				{
//					System.out.println("pass");
//				}
//				else
//					{
//						System.out.println("fail");
//					}
				
				
				
//			   driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//			
//				driver.findElement(By.linkText("Sign Out")).click();
				
//				   Actions a=new Actions(driver);
//					a.moveToElement(null).click().perform();
					//home.Logout(driver);
			}

				
	}

