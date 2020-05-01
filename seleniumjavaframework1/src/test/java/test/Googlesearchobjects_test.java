package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearchpageobjects;


public class Googlesearchobjects_test {
	
	private static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		google_search_test();
		}
		
		public static void google_search_test() throws InterruptedException
		{
			String projectpath = System.getProperty("user.dir");
			System.out.println(projectpath);
			
			System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","C:/Users/Agnal/workspace/Seleniumjavaframework/Drivers/ChromeDriver/chromedriver.exe");
			 driver= new ChromeDriver();
			 
			 Googlesearchpageobjects srchpageobj= new Googlesearchpageobjects(driver);
					 
			 driver.get("https://www.google.com/");
			 
			 srchpageobj.google_search_textbox("Automation step by step");
			 Thread.sleep(3000);
			 srchpageobj.google_button_click();
			 
			 driver.close();
			 
			 driver.quit();

		}
		
		
	}


