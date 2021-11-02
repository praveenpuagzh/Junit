package org.pages;

import org.base.Baseclass;
import org.demo.Trial;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class loginpage extends Trial{

	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email") public WebElement uname;
	@FindBy(id="pass")  public WebElement pass;
	@FindBy(name="login") public WebElement loginbt;
}
