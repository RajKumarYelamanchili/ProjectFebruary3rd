package mysele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void verifyHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\Chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://www.google.com");
	    Assert.assertEquals("Google", driver.getTitle());
	    System.out.println(driver.getTitle());
	    
	}

}
