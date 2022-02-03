package mysele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsEx {
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver","E:\\Browsers\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println( driver.getTitle());
	}
/*
 * assertEqual(String actual,String expected) :- It takes two string arguments and checks whether both are equal, if not it will fail the test.

assertEqual(String actual,String expected, String message) :- It takes three string arguments and checks whether both are equal, if not it will fail the test and throws the message which we provide.

assertEquals(boolean actual,boolean expected) :- It takes two Boolean arguments and checks whether both are equal, if not it will fail the test.

assertEquals(java.util.Collection actual, java.util.Collection expected, java.lang.String message) :- Takes two collection objects and verifies both collections contain the same elements and with the same order. if not it will fail the test with the given message.

Assert.assertTrue(condition) :- It takes one boolean arguments and checks that a condition is true, If it isn't, an AssertionError is thrown.

Assert.assertTrue(condition, message) :- It takes one boolean argument and String message. It Asserts that a condition is true. If it isn't, an AssertionError, with the given message, is thrown.

Assert.assertFalse(condition) :- It takes one boolean arguments and checks that a condition is false, If it isn't, an AssertionError is thrown.

Assert.assertFalse(condition, message) :- It takes one boolean argument and String message. It Asserts that a condition is false. If it isn't, an AssertionError, with the given message, is thrown.
 */
}
