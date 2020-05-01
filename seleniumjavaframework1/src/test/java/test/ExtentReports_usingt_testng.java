package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports_usingt_testng {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;



	@BeforeSuite
	public void setup()
	{
		htmlReporter= new ExtentHtmlReporter("extentreports.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@BeforeTest
	public void setuptest()
	{
		System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
		driver= new ChromeDriver();
	}
	@Test
	public void test1() throws IOException

	{

		ExtentTest test1 = extent.createTest(" MyFirstTest", "Sample description");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to  google.com");
		test1.log(Status.INFO, "This step shows usage of log(status, details)");
		test1.info("This step shows usage of info(details)");
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");


	}

	@AfterTest
	public void TeardownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed sucessfully");

	}

	@AfterSuite
	public void Teardown()
	{

		extent.flush();

	}
}

