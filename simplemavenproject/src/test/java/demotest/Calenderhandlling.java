package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderhandlling {
	
	static WebDriver driver;
	public static String[] getmonthyear(String a) {
		
		return a.split(" ");
	}
	
public static void calender(String day, String month, String year) throws InterruptedException {
	
	if(month.equals("February") && Integer.parseInt(day)>29) {
		 
		System.out.println("wrong date:"+month+":"+day);
		return;
	}
		
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
			 a=driver.findElement(By.xpath(("//div[@class=\"ui-datepicker-title\"]"))).getText();
			System.out.println(a);
	          // month=a.split(" ")[0].trim();
			   //year=a.split(" ")[1].trim();
		}
		try {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		}
		catch(Exception e){
			System.out.println("wrong date:"+month+":"+day);

		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		calender("30", "April", "2023");	 
	}
}
