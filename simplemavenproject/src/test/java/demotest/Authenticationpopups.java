package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//adding username and password in the url itself to handle authendication popup
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.cssSelector("p")).getText();		
		
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
		

	}

}
