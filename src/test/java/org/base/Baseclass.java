package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {

	public static WebDriver driver;
	
	
	public void filltext(WebElement ref,String text) {
	ref.sendKeys(text);
	}
	
	public void click(WebElement ref) {
	ref.click();
	}
	
	public void launchurl(String url) {
	driver.get(url);
	}


}
