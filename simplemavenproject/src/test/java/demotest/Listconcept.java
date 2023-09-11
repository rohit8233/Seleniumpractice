package demotest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Listconcept {
	
	
	@Test 
	
	public void listelements() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.f0acebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> li=driver.findElements(By.tagName("div"));
		
		for(WebElement e:li) {
			
			String text=e.getText();
			System.out.println(text);
		}
		
	}

}
