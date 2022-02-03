package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public void TestBase() {
		try
		{
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
		   config.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		if(config.getProperty("browser").equalsIgnoreCase("firefox"))
		{
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
		driver = new FirefoxDriver();
		}	
		else if(config.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
		}	
	driver.get(config.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitime")),TimeUnit.SECONDS);
	}
	public void closeBrowser()
	{
		driver.close();
	}

}
