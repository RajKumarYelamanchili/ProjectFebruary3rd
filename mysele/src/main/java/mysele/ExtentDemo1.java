package mysele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentDemo1 {

	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass()
	{
		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Reports");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.setSystemInfo("Organization", "Quality Aspire");
		extent.setSystemInfo("Browser","Chrome");
		extent.attachReporter(htmlReporter);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
		extent.flush();
	}
	
	@Test
	public void testSuccessful()
	{
		driver.get("http://www.google.com");
		extentTest = extent.createTest("Successful Test");
		extentTest.log(Status.PASS, "Test Method Successful");
	}
	
	@Test
	public void testFailed()
	{
		extentTest = extent.createTest("Failed Test");
		extentTest.log(Status.FAIL, "Test Method Failed");
		Assert.fail("Executing Fail Test Method");
	}
	
	@Test
	public void testSkipped()
	{
		
		extentTest = extent.createTest("Skipped Test");
		extentTest.log(Status.SKIP, "Test Method Skipped");
		throw new SkipException("Executing Skipped Test Method");
	}
	
}
