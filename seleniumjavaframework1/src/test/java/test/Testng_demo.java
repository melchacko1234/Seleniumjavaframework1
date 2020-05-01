package test;

import org.testng.annotations.Test;

import config.PropertiesFile;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testng_demo {
	public static WebDriver driver =null;
	public static String browsername=null;

	@BeforeTest
	public void setuptest()
	{
		String projectpath=System.getProperty("user.dir");
		PropertiesFile.getproperties();
		if(browsername.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/FireFoxdriver/geckodriver.exe");
			driver= new FirefoxDriver();			
		}



	}
	@Test
	public void google_search() throws InterruptedException
	{
		driver.get("https://www.google.com/");


		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void Teardown()
	{
		driver.close();
		driver.quit();
		System.out.print("Test completed Sucessfully");
		PropertiesFile.setproperties();
	}



}




