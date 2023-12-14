package Generic_Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver; 
	public File_Utility flib=new File_Utility();
	
	
	@BeforeSuite(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	
	public void beforeSuite()
	{
		System.out.println("Data Base Connection");
	}
	@BeforeTest(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void beforeTest()
	{
		System.out.println("parallel Execution Start");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void beforeClass() throws Throwable
	
	{
		
//		File_Utility flib=new File_Utility();
//		 WebDriver driver;
		String BROWSER = flib.getKeyAndValue("browser");
	
		if(BROWSER.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
		 }
		 
		 else  if(BROWSER.equalsIgnoreCase("edge"))
		 
		 {
			 WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			 
		 }
		 
		 else
			 
		 {
			 driver=new ChromeDriver();
		 }
		
		System.out.println("Lauch Browser");
		sdriver=driver;
	}
	
	@BeforeMethod(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void beforeMethod () throws Throwable
	{
		File_Utility flib=new File_Utility();			
					String URL = flib.getKeyAndValue("url");
					 String USERNAME = flib.getKeyAndValue("username");
					 String PASSWORD = flib.getKeyAndValue("password");
					 
						driver.get(URL);
						LoginPage login=new LoginPage(driver);
					
							login.loginToApplication(USERNAME, PASSWORD);
		System.out.println("Login to Application");
	}
	
	
	@AfterMethod(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void afterMethod()
	{
		HomePage home=new HomePage(driver);
		home.Logout(driver);
		System.out.println("logout  Application");
	}
	
	@AfterClass(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void afterclass()
	
	{
		driver.quit();
		System.out.println("close  browser");
	}
	
	
	@AfterTest(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void aftertest()
	{
		System.out.println("close  browser");
	}
	
	@AfterSuite(groups={"SmokeTest", "RegressionTest", "SanityTest"})
	public void afterSuite()
	{
		System.out.println("close  browser");
	}
	
	
	
	

}
