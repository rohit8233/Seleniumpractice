package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Examples {
	WebDriver driver;
	@Test
	
	public void pagination7() throws InterruptedException  {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	      driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
	  driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3']")).click();
	  driver.findElement(By.xpath("(//div[@class=\"p13n-sc-truncate-desktop-type2  p13n-sc-truncated\"])[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("add-to-cart-button")).click();
	  driver.findElement(By.xpath("//a[@class=\"a-button-text\"]")).click();
	  String text=driver.findElement(By.xpath("//span[text()='Lifelong Yoga mat for Women & Men EVA Material 4mm Black Anti Slip f…']")).getText();
	 System.out.println(text);

	}

}
