package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {

	WebDriver driver;
	@Test
	
	public void pagination8() {
		
	/*	ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
	*/	
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	    WebElement ele=driver.findElement(By.xpath("//a[text()='MEN']"));	
	    Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[text()='Shirts' and @href=\"/men-shirts/c/830216013\"]")).click();
	    driver.findElement(By.xpath("//label[@for=\"Men\"]")).click();
	    driver.findElement(By.xpath("//span[text()='price']")).click();
	    driver.findElement(By.xpath("//label[@for=\"Below Rs.500\"]")).click();
	    driver.findElement(By.id("minPrice")).sendKeys("1000");
	    driver.findElement(By.name("maxPrice")).sendKeys("2000");
	    driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"rilrtl-button ic-toparw\"]")).click();
	    
	   
	}
	
}
