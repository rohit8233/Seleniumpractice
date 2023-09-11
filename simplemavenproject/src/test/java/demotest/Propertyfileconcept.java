package demotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertyfileconcept {

	@Test
	
	public void fetchdata() throws IOException {
		
		
		
	WebDriver driver=new ChromeDriver();
	FileInputStream file=new FileInputStream("C:\\Users\\RohitChoudhary\\eclipse-workspace\\simplemavenproject\\data.properties");
	Properties p=new Properties();
	p.load(file);
	String user=p.getProperty("username");
	String pass=p.getProperty("password");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys(user);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.close();
	
	
	
	
	
}
}
