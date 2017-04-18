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
public class MavenSample 
{
	@Test
	public void test()
	{
		System.out.println("Maven sample getting googlehome page");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
