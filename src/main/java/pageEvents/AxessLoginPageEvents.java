/**
 * 
 */
package pageEvents;

import java.io.IOException;

import com.aventstack.extentreports.Status;

import pageObjects.AxessLoginPageElements;
import utilities.ElementFetch;
import utilities.ElementMethods;

/**
 * @author krish
 *
 */
public class AxessLoginPageEvents extends ElementMethods{
	ElementFetch elementFetch = new ElementFetch();
	
	
	public void verifyLoginPage() throws IOException{
			
		click(elementFetch.getWebElement("XPATH", AxessLoginPageElements.homeSignInButton));
		
		//logger.log(Status.PASS, logger.addScreenCaptureFromPath(takeScreenshotPage()));
		//logger.pass("test passes",MediaEntityBuilder(takeScreenshotPage()).build());
		//logger.pass(LogStatus.PASS, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshotPage()).build());	
		
	logger.log(Status.PASS, "Sign In Pop Up Present", addImageToExtentReport());
	
	}
	
	public void loginToAxess() throws InterruptedException, IOException{
		
		enterText(elementFetch.getWebElement("XPATH", AxessLoginPageElements.emailId),readProperty("UserName"));
		logger.log(Status.PASS, "User Name Entered", addImageToExtentReport());
		
		enterText(elementFetch.getWebElement("XPATH", AxessLoginPageElements.password),readProperty("Password"));
		logger.log(Status.PASS, "Password Entered", addImageToExtentReport());
		
		clickWithAction(elementFetch.getWebElement("XPATH", AxessLoginPageElements.signInButton));
		logger.log(Status.PASS,"Login Button Clicked", addImageToExtentReport());
		
	}
	
public void verifyAxessLoggedInPage() throws IOException{
	
	verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessLoginPageElements.signOutButton));
	logger.log(Status.PASS,"User Logged In Successfully",addImageToExtentReport());
}


}

