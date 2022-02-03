package mysele.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.fbpages.FacebookHomePage;

public class TestFacebookPage {
	
	@Test
	public void testfacebookhomepage()
	{
		FacebookHomePage obj = new FacebookHomePage();
		obj.TestBase();
		
		obj.enteremail("UserName12345");
		obj.enterPassword("Password12345");
		obj.clickSignIn();
		
	String loginerrormessage =	obj.getErrrorMessage();
	String expectedmessage = "The password that you've entered is incorrect. Forgotten password?";
	
	Assert.assertEquals(loginerrormessage, expectedmessage,"Error message is not matching");
	obj.closeBrowser();
	
	}

}
