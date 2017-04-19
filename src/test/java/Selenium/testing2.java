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
public class testing2 
{
	@Test
	public void testig()
	{
		System.out.println("test Page 3 ");
		System.setProperty("webdriver.gecko.driver", "D:\\Driver Browsers\\geckodriver0.14.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ucmo.edu");
		System.out.println(driver.getCurrentUrl());
	}

}
