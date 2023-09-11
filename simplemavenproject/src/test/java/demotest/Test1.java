package demotest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;
	
	@Test(enabled=false)
	
	public void demo1() {
		
		System.setProperty("WebDriver.gecko.driver", "C://Users//RohitChoudhary//Downloads//geckodriver-v0.31.0-win64//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://programmers.io/");
		driver.findElement(By.id("mega-menu-item-100427")).click();
		driver.findElement(By.xpath("//a[text()=\"Automation Testing\"]")).click();
		List<WebElement> a=driver.findElements(By.xpath("//div[@class=\"serv_content\"]//h3"));
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(a));
		
		for(WebElement b:a) {
			String text=b.getText();
			System.out.println(text);
		}		
	}
	
	@Test(enabled=false)
	
	public void dmo2() {
		
		System.setProperty("WebDriver.geckodriver", "C://Users//RohitChoudhary//Downloads//geckodriver-v0.31.0-win64//geckodriver.exe");
		driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		WebDriverWait wait=new WebDriverWait(driver, 30);
			
		
	}
	
	@Test
	public void Demo3() {
		String a= "this is my class";
		String b=a.split(" ")[1].trim();
		System.out.println(b);
	}
	
}
