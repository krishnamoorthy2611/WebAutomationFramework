/**
 * 
 */
package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.baseTest.BaseTest;

import pageEvents.AxessHomePageEvents;
import pageEvents.AxessLoginPageEvents;

/**
 * @author krish
 *
 */
public class AxessLogin extends BaseTest{

	AxessHomePageEvents homePageEvents = new AxessHomePageEvents();
	AxessLoginPageEvents loginPageEvents = new AxessLoginPageEvents();
	
	@Test
	public void loginToAxessMethod() throws InterruptedException, IOException{
		
		homePageEvents.axessHomePageVerificaion();
		loginPageEvents.verifyLoginPage();
		loginPageEvents.loginToAxess();
		loginPageEvents.verifyAxessLoggedInPage();
		
	}
	
}
