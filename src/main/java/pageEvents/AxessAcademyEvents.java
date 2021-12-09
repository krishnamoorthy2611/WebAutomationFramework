/**
 * 
 */
package pageEvents;

import java.io.IOException;

import com.aventstack.extentreports.Status;

import pageObjects.AxessAcademyElements;
import utilities.ElementFetch;
import utilities.ElementMethods;

/**
 * @author krishna
 *
 */
public class AxessAcademyEvents extends ElementMethods{

	ElementFetch elementFetch = new ElementFetch();

	
	public void verifyAxessAcademyPage() throws IOException, InterruptedException{
		
		click(elementFetch.getWebElement("XPATH", AxessAcademyElements.academyHeaderLink));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.academyHeading));
		logger.log(Status.PASS, "Academy Heading is Present", addImageToExtentReport());
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.academyImg));
		logger.log(Status.PASS, "Academy Image is Present", addImageToExtentReport());
		scrollTillFindElement(elementFetch.getWebElement("XPATH", AxessAcademyElements.blendedHandsOnExperience));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.blendedHandsOnExperience));
		logger.log(Status.PASS, "Blended Hands On Section is Present", addImageToExtentReport());
		scrollTillFindElement(elementFetch.getWebElement("XPATH", AxessAcademyElements.whatWeTeachHeading));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.whatWeTeachHeading));
		logger.log(Status.PASS, "What we Teach Heading is Present", addImageToExtentReport());
		scrollTillFindElement(elementFetch.getWebElement("XPATH", AxessAcademyElements.openBankingThumbNail));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.openBankingThumbNail));
		logger.log(Status.PASS, "Open Banking Thumbnail is Present",addImageToExtentReport());
		scrollTillFindElement(elementFetch.getWebElement("XPATH", AxessAcademyElements.enabelingEngCareersHeading));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.enabelingEngCareersHeading));
		logger.log(Status.PASS, "Enabling Engineering Careers Heading is Present", addImageToExtentReport());
		scrollTillFindElement(elementFetch.getWebElement("XPATH", AxessAcademyElements.freshGraduateSection));
		verifyIfElementDisplayed(elementFetch.getWebElement("XPATH", AxessAcademyElements.freshGraduateSection));
		logger.log(Status.PASS, "Fresh Graduate Sub  Heading is Present", addImageToExtentReport());
		scrollTillFindElement(elementFetch.getWebElement("XPATH", AxessAcademyElements.standardCharteredFooter));
				
	}
	
}
