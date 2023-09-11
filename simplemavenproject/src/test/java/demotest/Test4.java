package demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

	WebDriver driver;
	
	@Test
	
	@Parameters("Firefox")
	
	public void demo(String browser) {
		
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("WebDriver.gecko.driver", "C://Users//RohitChoudhary//Downloads//geckodriver-v0.31.0-win64//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
			
			
		}
	}
	
	@AfterMethod
	public void demo2() {
		Test4 a=new Test4();
	
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	}
	
	
	
	
}
