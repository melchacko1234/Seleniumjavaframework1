package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit_demo {
	

	public static void main(String[] args) throws Exception  {
		
		Autoit();
	}
	
	public static void Autoit() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","F:/Selenium/Setups/WebDrivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.tinyupload.com");
		Thread.sleep(3000);
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("E:/Selenium/Fileuploadscript.exe");
		Thread.sleep(3000);
		driver.findElement(By.name("sessionid")).click();
		
		//driver.close();
		
	}

}
