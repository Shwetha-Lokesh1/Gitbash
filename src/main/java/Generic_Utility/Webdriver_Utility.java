package Generic_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Webdriver_Utility {
	
	//this method is used for maximaize
	
	public void maximizingWinodw(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	//this methos is used for minimaize
	
	public void minimizingWinodw(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	//this method for implicit wait
	public void implicit_wait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
	{
		FluentWait wait=new FluentWait(driver);
	    wait.pollingEvery(Duration.ofSeconds(20));	
	    wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
 
	public  void widowSwitching(WebDriver driver, String partialvisibleText)
	{
	Set<String> allWin = driver.getWindowHandles();
	
	Iterator<String> win = allWin.iterator();
	
	while(win.hasNext())
		
	{
		String winText = win.next();
		driver.switchTo().window(winText);
		
		String title = driver.getTitle();
		
	if(title.contains("partialvisibleText"))
		
	{
		break;
	}
	}
	}
	
	
	public void javaScriptExecutor(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0],scrollIntoView()", element);
	}

public void alertAceept(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.accept();
}


public void alertDismiss(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
}


public void ActionsMoveToElement(WebDriver driver, WebElement ele)

{
	Actions a=new Actions(driver);
	
	a.moveToElement(ele).perform();
}

public static String takeScreenshot(WebDriver driver, String screenShotName) throws Throwable
{
	TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
	File src = takeScreenshot.getScreenshotAs(OutputType.FILE);
	File dst=new File("./Screenshots/" +screenShotName+".png");
	FileUtils.copyFile(src, dst);
	return dst.getAbsolutePath() ;
	
	
	
}
}

	
