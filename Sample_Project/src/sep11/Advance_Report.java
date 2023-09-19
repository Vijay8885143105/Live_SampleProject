package sep11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_Report {
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	@BeforeTest
	public void generateReort()
	{
		//define path of html
		report = new ExtentReports("./Reports/Demo.html");
		
	}
	@BeforeMethod
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	@Test
	public void passTest()
	{
	//test case starts here
		logger =report.startTest("My Pass Test");
	logger.assignAuthor("Vijay");
	logger.assignCategory("Functional");
	String Expected ="Google";
	String Actual = driver.getTitle();
	if(Expected.equalsIgnoreCase(Actual))
	{
		logger.log(LogStatus.PASS, "Title Is Matching::"+Expected+"      "+Actual);
	}
	else
	{
		logger.log(LogStatus.FAIL, "Title Is Not Matching::"+Expected+"      "+Actual);
	}
	}
	@Test
	public void failTest()
	{
	//test case starts here
		logger =report.startTest("My Fail Test");
	logger.assignAuthor("Vijay");
	logger.assignCategory("Functional");
	String Expected ="gmail";
	String Actual = driver.getTitle();
	if(Expected.equalsIgnoreCase(Actual))
	{
		logger.log(LogStatus.PASS, "Title Is Matching::"+Expected+"      "+Actual);
	}
	else
	{
		logger.log(LogStatus.FAIL, "Title Is Not Matching::"+Expected+"      "+Actual);
	}
	}
	@AfterMethod
	public void tearDown()
	{
		report.endTest(logger);
		report.flush();
		driver.quit();
	}

}
