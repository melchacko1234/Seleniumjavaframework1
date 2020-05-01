package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class TestngMultibrowser {

	WebDriver driver=null;
	String projectpath=System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setuptest(String browserName )


	{

		System.out.println("Browser Name is :"+browserName);

		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
			driver= new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/FireFoxdriver/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();			

		}
		else if (browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", projectpath+"/Drivers/internetexplorerdriver/IEDriverServer.exe");
			WebDriver driver= new InternetExplorerDriver();

		}
	}



	@Test
	public void Test1() throws Exception
	{

		Thread.sleep(4000);
		driver.get("https://www.google.com/");

	}

	@AfterTest
	public void Teardowntest()
	{

		driver.close();
		driver.quit();
		System.out.println("Test completed Sucessfully");
	}


}

