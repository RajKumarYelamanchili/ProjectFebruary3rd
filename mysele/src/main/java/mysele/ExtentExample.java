package mysele;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentExample {
	
	@Test
	public void loginTest()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/abcd.html");
				ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("LoginTest");
		logger.log(Status.INFO,"Login to amazon");
		System.out.println("Login to amazon");
	}
	}


