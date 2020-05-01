package browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsertest {

		public static void main(String[] args) throws InterruptedException {
			
			
			String projectpath = System.getProperty("user.dir");
			System.out.println(projectpath);
			
			//System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/Chromedriver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:/Users/Agnal/workspace/seleniumjavaframework1/Drivers/Chromedriver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/FireFoxdriver/geckodriver.exe");
			//WebDriver driver2= new FirefoxDriver();			
			System.setProperty("webdriver.ie.driver", projectpath+"/Drivers/internetexplorerdriver/IEDriverServer.exe");
			WebDriver driver1= new InternetExplorerDriver();
		
            //Thread.sleep(3000);
			driver.get("https://www.makemytrip.com/");
			
			//driver1.get("https://www.makemytrip.com/");
			
			driver.close();
			//driver.close();
		}


	
}

