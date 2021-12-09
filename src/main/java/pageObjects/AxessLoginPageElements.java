/**
 * 
 */
package pageObjects;

/**
 * @author krish
 *
 */
public interface AxessLoginPageElements {

	String loginText = "/html/body/div[2]/div/div[1]/div/div/div/div[1]/div[1]/div[1]";
	String emailId = "//*[@id='email']";
	String password = "//*[@id='password']";
	String signInButton = "/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/form/button";
	String homeSignInButton = "//*[@id='header']/div/nav/section/button[1]";
	String signOutButton ="//*[@id='header']/div/nav/section/div/div[2]/button"; 
}
