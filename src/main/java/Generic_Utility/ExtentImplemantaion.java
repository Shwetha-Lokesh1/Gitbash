package Generic_Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentImplemantaion implements ITestListener{
	
	ExtentReports report;
	ExtentTest test;



	public void onTestStart(ITestResult result) {
		
		test=report.createTest(result.getName());
	}
	
	


	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		
	}
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		System.out.println("<......i am Listeing.......>");
		
		String screenShot=null;
		
		try
		{
			screenShot=Webdriver_Utility.takeScreenshot(BaseClass.sdriver, result.getMethod().getMethodName());
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(screenShot);
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
		test.log(Status.PASS, result.getThrowable());
		
	}


	
	public void onStart(ITestContext context) {
		
		Java_Utility jlib=new Java_Utility();
		int ranNum=jlib.getRandomNum();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/Report.html") ;
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Testing");
		spark.config().setReportName("Shobha");
		
		//system configuration
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("platform", "windows10");
		report.setSystemInfo("executedby", "shobha");
		report.setSystemInfo("review by", "rathan");
		
	}

	
	public void onFinish(ITestContext context) {
		
		report.flush();
	
	}


	



	

}
