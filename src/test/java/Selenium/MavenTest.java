/**
 * 
 */
package Selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author revan
 *
 */
public class MavenTest 
{
	Logger logger;
	@Test
	public void maven()
	{
		PropertyConfigurator.configure("D:\\maven\\MavenProject\\log4j.properties");
		logger = Logger.getLogger("MevenTest with Log4j");
		System.setProperty("webdriver.gecko.driver", "D:\\Driver Browsers\\geckodriver0.14.exe");
		System.out.println("Maven test getting google");
		WebDriver driver = new FirefoxDriver();
		logger.info("Browser Intialized");
		driver.get("http://www.google.com");
		logger.info("Google home page Opened");
		System.out.println("Hello it is maven Sample test");
		logger.info("Browser about to close");
		driver.close();
		logger.info("Browser closed");
		
		
	}

}
