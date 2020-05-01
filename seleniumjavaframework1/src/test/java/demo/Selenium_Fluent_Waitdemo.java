package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;




public class Selenium_Fluent_Waitdemo {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		Selenium_Fluent();
	}

	
	
	public static void Selenium_Fluent()
	{
	//String projectpath=System.getProperty("User.dir");
	System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("abcd");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	//driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
	
	
	// Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	   @SuppressWarnings("deprecation")
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(30, TimeUnit.SECONDS)
	      .pollingEvery(2, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);

	   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	    	 WebElement linkelement= driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
			if (linkelement.isEnabled()){
				
				System.out.println("Element found");
				
			}
			return linkelement;
	     }
	   });
	element.click();
	driver.close();
	driver.quit(); 
	
	
	}
	
}
