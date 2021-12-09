/**
 * 
 */
package com.testCases;

import org.testng.annotations.Test;

import com.baseTest.BaseTest;

import pageEvents.AxessAcademyEvents;
import pageEvents.AxessHomePageEvents;
import pageEvents.AxessLoginPageEvents;

/**
 * @author krish
 *
 */
public class AxessAcademy extends BaseTest{

	AxessHomePageEvents axessHomePageEvents = new AxessHomePageEvents();
	AxessLoginPageEvents axessLoginPageEvents = new AxessLoginPageEvents();
	AxessAcademyEvents axessAcademyPageEvents = new AxessAcademyEvents();
	
	
	@Test
	public void verifyAxessAcademyPage() throws Exception{
		axessHomePageEvents.axessHomePageVerificaion();
		axessLoginPageEvents.verifyLoginPage();
		axessLoginPageEvents.loginToAxess();
		axessLoginPageEvents.verifyAxessLoggedInPage();
		axessAcademyPageEvents.verifyAxessAcademyPage();
		
	}
}
