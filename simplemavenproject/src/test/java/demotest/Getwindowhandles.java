package demotest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Getwindowhandles {
	
	
	@Test
	
	public void windowhandles() {
   
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String parentwindow=driver.getWindowHandle();
	System.out.println(parentwindow);
	driver.findElement(By.xpath("(//div[@class=\"header-text\"])[3]")).click();
	driver.findElement(By.xpath("//span[text()=\"Browser Windows\"]")).click();
	driver.findElement(By.xpath("//button[text()=\"New Window\"]")).click();
	Set<String> parents=driver.getWindowHandles();
	for(String child:parents) {
		
		System.out.println(child);
		if(!child.equals(parentwindow)) {
			
			String title=driver.switchTo().window(child).getCurrentUrl();
			System.out.println(title);
		 driver.close();
		}
	}
	driver.switchTo().window(parentwindow);
	WebElement img=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]"));
	Assert.assertEquals(true, img.isDisplayed());
	
	driver.quit();
	
	
	
	
}
}