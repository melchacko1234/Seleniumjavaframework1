package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumwaits_demo {
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		Seleniumwaits_implicit();
	}

	

	public static void Seleniumwaits_implicit()

	{

		//String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("abcd")).sendKeys("Automation step by step");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		@SuppressWarnings("unused")
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));
		driver.close();
		driver.quit();


	}
}
