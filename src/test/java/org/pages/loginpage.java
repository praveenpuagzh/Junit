package org.pages;


import org.demo.Testclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class loginpage extends Testclass{

	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email") public WebElement uname;
	@FindBy(id="pass")  public WebElement pass;
	@FindBy(name="login") public WebElement loginbt;
}
