package sep11;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
	Properties config;
	WebDriver driver;
	@BeforeTest
	public void setUp()throws Throwable
	{
		config = new Properties();
		//load file
		config.load(new FileInputStream("Login.properties"));
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperty("ObjUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void startTest()
	{
		driver.findElement(By.xpath(config.getProperty("ObjReset"))).click();
		driver.findElement(By.xpath(config.getProperty("ObjUser"))).sendKeys(config.getProperty("Enteruser"));
		driver.findElement(By.xpath(config.getProperty("Objpass"))).sendKeys(config.getProperty("Enterpass"));
		driver.findElement(By.xpath(config.getProperty("Objlogin"))).click();
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
