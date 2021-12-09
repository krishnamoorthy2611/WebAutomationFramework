/**
 * 
 */
package localTesting;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author krish
 *
 */
public class SeleniumTest {

	/**
	 * @param args
	 */
	
	public String readProperty(String key) throws IOException{
		FileReader file = new FileReader(System.getProperty("user.dir"+File.separator+"Config.properties"));
		System.out.println(file);
		Properties properties = new Properties();
		properties.load(file);
		return properties.getProperty(key);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");*/
		SeleniumTest st = new SeleniumTest();
		System.out.println(st.readProperty("UserName"));
		

	}

}
