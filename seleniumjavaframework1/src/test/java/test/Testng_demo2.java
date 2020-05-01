package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testng_demo2 {
	public static WebDriver driver =null;
	@BeforeTest
	public void setuptest()
	{


		//System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
		driver= new ChromeDriver();
		
	}
@Test
		public void google_search2() throws InterruptedException
		{
			driver.get("https://www.google.com/");


			driver.findElement(By.name("q")).sendKeys("Automation step by step");
			Thread.sleep(3000);
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		}

public void google_search3() throws InterruptedException
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
		}



	}




