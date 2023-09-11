package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalenderHandling {
	
	static WebDriver driver;
	public static String[] getmonthyear(String a) {
		
		return a.split(" ");
	}
	
	public static void call() throws InterruptedException {
		calender("21", "December", "2022");

	}

	
	@Test
	
	public static void calender(String day, String month, String year) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id(("datepicker"))).click();
		String a=driver.findElement(By.xpath(("//div[@class=\"ui-datepicker-title\"]"))).getText();
		System.out.println(a);
		//String month=a.split(" ")[0].trim();
		//String year=a.split(" ")[1].trim();
		
		
		while(!(getmonthyear(a)[0].equals(month) && getmonthyear(a)[1].equals(year)))
		{
			
			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			String ab=driver.findElement(By.xpath(("//div[@class=\"ui-datepicker-title\"]"))).getText();
			System.out.println(ab);
	          // month=a.split(" ")[0].trim();
			   //year=a.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[text()=\"day\"]")).click();
		
		
	}
	
	
}
