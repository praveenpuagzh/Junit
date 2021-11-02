package org.demo;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.base.Baseclass;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Trial extends Baseclass{

	@Test
	public void test() {
		launchurl("https://www.facebook.com/");
		loginpage p = new loginpage();
		String cu = driver.getCurrentUrl();
		boolean b = cu.contains("facebook");
		Assert.assertTrue("url enterd is correct", b);
		filltext(p.uname, "praveenpugazh84@gmail.com");
		String user = p.uname.getAttribute("value");
		Assert.assertEquals("praveenpugazh84@gmail.com", user);
		filltext(p.pass, "Praveen@123");
		String password = p.pass.getAttribute("value");
		Assert.assertEquals("Praveen@123", password);
		click(p.loginbt);
	}
	
	
	
	@Before
	public void befmethod() {
		Date d = new Date();
		System.out.println("start time:"+d);

	}
	
	@After
	public void Aftmethod() {
		Date d = new Date();
		System.out.println("end time:"+d);

	}
	
	@BeforeClass
	public static void first() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterClass
	public static void last() {
		//driver.close();

	}

}
