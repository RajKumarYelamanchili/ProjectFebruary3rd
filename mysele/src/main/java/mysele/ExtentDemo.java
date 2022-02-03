package mysele;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentDemo {
	ExtentReports reports;
    ExtentHtmlReporter htmlReporter;
    ExtentTest test;
    WebDriver driver;
    @BeforeTest
    public void startTest() {
                reports = new ExtentReports();
                htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "//test-output//Extentreport.html");
                reports.attachReporter(htmlReporter);
                reports.setSystemInfo("Machine", "Ajeet-772G");
                reports.setSystemInfo("Env", "DevOps");
                reports.setSystemInfo("Build", "Integration");
                reports.setSystemInfo("Browser", "IE");
    }
    @BeforeMethod
    public void openApplication() {
    	System.setProperty("webdriver.chrome.driver","E:\\Browsers\\Chromedriver\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com");
    }
   
    @AfterMethod
    public void setTestResult(ITestResult result) throws IOException {
                //String screenShot = CaptureScreenShot.captureScreen(driver);
                if (result.getStatus() == ITestResult.FAILURE) {
                            test.log(Status.FAIL, result.getName());
                            test.log(Status.FAIL,result.getThrowable());
                //          test.fail("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
                } else if (result.getStatus() == ITestResult.SUCCESS) {
                            test.log(Status.PASS, result.getName());
                            //test.pass("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
                } else if (result.getStatus() == ITestResult.SKIP) {
                            test.skip("Test Case : " + result.getName() + " has been skipped");
                }
                reports.flush();
                driver.close();
    }
    @AfterTest
    public void endTest() {
               
                reports.flush();
    }
	
	
	}


