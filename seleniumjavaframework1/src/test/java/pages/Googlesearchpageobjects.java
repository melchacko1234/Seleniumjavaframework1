package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Googlesearchpageobjects {
	
	WebDriver driver;

	By textbox_search=By.xpath("//input[@name='q']");
			
	By button_search  =By.name("btnK");
	
 public Googlesearchpageobjects(WebDriver driver)
 {
	this.driver=driver;
	
 }


public void google_search_textbox(String text)
{
	
	driver.findElement(textbox_search).sendKeys(text);
	
	
}

public void google_button_click()

{
	driver.findElement(button_search).sendKeys(Keys.RETURN);
}
}
