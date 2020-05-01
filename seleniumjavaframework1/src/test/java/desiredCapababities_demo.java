import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapababities_demo {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		//System.out.println(projectpath);
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.setCapability("enableElementCacheCleanup", true);
		caps.setCapability("ignoreZoomSetting", true);
		System.setProperty("webdriver.ie.driver", projectpath+"/Drivers/internetexplorerdriver/IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver(caps);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();

	
	}

}
