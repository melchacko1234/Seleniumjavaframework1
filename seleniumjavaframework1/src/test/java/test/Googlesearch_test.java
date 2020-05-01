package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.Googlesearchpage;

public class Googlesearch_test {
	
	private static WebDriver driver =null;

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:/Users/Agnal/workspace/Seleniumjavaframework/Drivers/ChromeDriver/chromedriver.exe");
		 driver= new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/FirefoxDriver/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		
		
		//System.setProperty("webdriver.ie.driver", projectpath+"/Drivers/IEDriver/IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();
		 driver.get("https://www.google.com/");
		Googlesearchpage.google_textboxsearch(driver).sendKeys("Automation step by step");
        Googlesearchpage.google_textboxbutton(driver).sendKeys(Keys.RETURN);
		
		
				driver.close();
		
		

	}

}
