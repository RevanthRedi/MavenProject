/**
 * 
 */
package Selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

/**
 * @author revan
 *
 */
public class gmail_Automation 
{
	private static final String dependsOn = null;

	Logger logger = Logger.getLogger("MevenTest with Log4j");
	
	WebDriver driver= null;
	String subject ="Test email using Selenium";
	
//	PropertyConfigurator.configure('D:\\maven\\MavenProject\\log4j.properties');
	
	@BeforeTest
	public  void OpenBrowser()
	{
		PropertyConfigurator.configure("D:\\maven\\MavenProject\\log4j.properties");
//		logger = Logger.getLogger("MevenTest with Log4j");
		System.setProperty("webdriver.gecko.driver", "D:\\Driver Browsers\\geckodriver0.14.exe");
		driver =new FirefoxDriver();
		logger.info("FirefoxBrowser is opening");
		
	}
	@Test(priority =0)
	public  void login() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		logger.info("gmail home page opened");
		String title = driver.getTitle();
		logger.info("Title of the page is :" +title);
//		driver.switchTo().frame("youtube");
		////*[contains(text(),'Next')]
		driver.findElement(By.id("identifierId")).sendKeys("gccrrr@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		Thread.sleep(5000);
		logger.info("Password Page");
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("9160501501");
//		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		logger.info("Signed in Successfully");
	}
	@Test(priority = 1)
	public void SendEmail() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(), 'COMPOSE')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td//img[2]")).click();
		driver.findElement(By.className("vO")).sendKeys("revanthkng@gmail.com");
		driver.findElement(By.className("aoT")).sendKeys(subject);
		Thread.sleep(5000);
		WebElement msgbody = driver.findElement(By.xpath(".//div[@id=':ot']"));
		msgbody.click();
		msgbody.sendKeys("Hello There, this is a test email sent using Selenium to automate Gmail");
		Thread.sleep(5000);
//		driver.findElement(By.id(""))
//		 = driver.findElement(By.cssSelector(".Am Al editable LW-avf>br"));
//		msgbody.click();
		Thread.sleep(5000);
////		msgbody.sendKeys("This is an auto-generated mail");
//		driver.findElement(By.cssSelector(".Am Al editable LW-avf")).sendKeys("This is an auto-generated mail");
//		logger.info("Entered msg body");
		driver.findElement(By.xpath(".//div[contains(text(),'Send')]")).click();
		logger.info("Email Sent");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[contains(text(),'Sent Mail')]")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//div[@class='y6']//span[text()='"+subject+"']")) != null)
		{
		System.out.println("Wowww.. Email sent sucessfully!!!");
		logger.info("Email Sent Successfully | Verified");
		}
		else
		{
		System.out.println("Failed to send email !!!");
		}
		
		
	}
	@AfterTest
	public  void closeBrowser()
	{
		logger.info("Reached close browser tab");
		driver.quit();
		logger.info("closed");
	}

}
