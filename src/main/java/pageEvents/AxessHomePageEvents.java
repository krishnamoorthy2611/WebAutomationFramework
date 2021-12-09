/**
 * 
 */
package pageEvents;

import java.io.IOException;

import com.aventstack.extentreports.Status;

import pageObjects.AxessHomePageElements;
import utilities.ElementFetch;
import utilities.ElementMethods;

/**
 * @author krish
 *
 */
public class AxessHomePageEvents extends ElementMethods{
	ElementFetch elementFetch = new ElementFetch();
	
	
	public void axessHomePageVerificaion() throws IOException{
		
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH",AxessHomePageElements.openBankingText));
		logger.log(Status.PASS, "Home Page Loaded Successfuly", addImageToExtentReport());
				
	}
	
}
