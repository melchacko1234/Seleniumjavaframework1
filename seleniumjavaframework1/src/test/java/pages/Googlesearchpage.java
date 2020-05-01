package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Googlesearchpage {
	
	static WebElement  element=null;

	public static WebElement google_textboxsearch(WebDriver driver)
	{
		
      element= driver.findElement(By.name("q")); 
		return element;
	}
	
	public  static WebElement google_textboxbutton(WebDriver driver)
	{
	element=driver.findElement(By.name("btnK"));
		return element;
		
	}
}

