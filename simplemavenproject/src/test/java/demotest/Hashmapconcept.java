package demotest;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hashmapconcept {
     
	
	 @Test
	 
	 
	 
	 
	 public static HashMap<String, String> credentials() {
		 WebDriver driver=new ChromeDriver();
	HashMap<String, String> hashmap=new HashMap<String, String>();
	hashmap.put("customer", "rohit@123:1234");
	hashmap.put("seller", "rishabh@123:2345");
	hashmap.put("delivery", "aman@123:3456");
	hashmap.replace("seller", "ris@123:4321");
	
	return hashmap;
		

	
	 }
	 
	 @Test
	 
	 
	 public void fetch() {
		 
		 String pass=credentials().get("seller");
		 String username=credentials().get("customer");
		 System.out.println(credentials());
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys(username.split(":")[0]);
		 driver.findElement(By.id("pass")).sendKeys(pass.split(":")[1]);

	 }
	

	
}
