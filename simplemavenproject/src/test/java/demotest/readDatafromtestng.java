package demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class readDatafromtestng {

	public WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	
	public void readData(String browser) {
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}
	}
	
	@Test
	
	public void run() {
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
	}
}
