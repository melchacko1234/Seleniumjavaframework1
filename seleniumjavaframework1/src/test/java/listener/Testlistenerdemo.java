package listener;

import org.testng.annotations.Test;

import junit.framework.Assert;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
public class Testlistenerdemo {

	WebDriver driver;
	public void test1()
	{
		System.out.println("I am inside test1");
	}

	public void test2() throws InterruptedException
	{
		System.out.println("I am inside test2");
		System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(4000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

		driver.close();
		driver.quit();
	}

	public void test3()
	{
		System.out.println("I am inside test3");
		throw new SkipException("This test3 is Skipped");
	}

}
