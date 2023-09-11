package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowserconcept {
	WebDriver driver;
	@Test
	
	@Parameters("browser")

	public void demo(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webDriver.gecko.driver", "C:\\Users\\RohitChoudhary\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		
		}
		
		else {
			
			driver=new ChromeDriver();
		}
	}
	
	@AfterMethod
	
	public void demo2() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		driver.close();
	}

}
