/**
 * 
 */
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author revan
 *
 */
public class MavenTest 
{
	@Test
	public void maven()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Driver Browsers\\geckodriver.exe");
		System.out.println("Maven test getting google");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Hello it is maven Sample test");
		driver.close();
		
		
		
	}

}
