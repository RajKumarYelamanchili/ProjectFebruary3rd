package com.fbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.TestBase;

public class FacebookHomePage extends TestBase {
	
	By emailtext = By.id("email");
	By passwordtext = By.id("pass");
	By SignInButon = By.xpath("//button[@type='submit']");
	By errormessage = By.xpath("//div[@class='_9ay7']");
	By forgotPasswordlink = By.linkText("Forgotten password?");
	
	public void enteremail(String emailphone)
	{
		driver.findElement(emailtext).sendKeys(emailphone);
	}
	public void enterPassword(String password)
	{
		driver.findElement(passwordtext).sendKeys(password);
	}
	public void clickSignIn()
	{
		driver.findElement(SignInButon).click();
	}
	public String getErrrorMessage()
	{
		String message = driver.findElement(errormessage).getText();
		System.out.println(message);
		return message;
	}
	
	public void clickForgotPassword()
	{
		driver.findElement(forgotPasswordlink).click();
	}
}