package demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderconcept {

    @Test(dataProvider="create")
	public void test(String scenario, String username, String password) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name(("login"))).click();
		Thread.sleep(5000);
		
		if(scenario.equalsIgnoreCase("both wrong")) {
			String a=driver.findElement(By.xpath("//a[text()=\"Find your account and log in.\"]")).getText();
			Assert.assertEquals(a, "Find your account and log in.");
			System.out.println(a);
		}
		else
		{
			System.out.println("hiiiiiiiii");
		}
		driver.close();

	}
 
     @DataProvider(name="create")
     
     public Object[][] dataset(){
    	 
    	 return new Object[][]
    			 {
    		 {"both wrong", "rohit@123456", "12341234"},
    		 {"one corrrect", "aman@12345", "34566"}
    			 };
     }
    
     @Test(dataProvider="testdata")
     
     public void loginTest(String Scenario, String user, String pass) throws InterruptedException {
   	  WebDriver driver = new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   		driver.findElement(By.name("username")).sendKeys(user);
   		driver.findElement(By.name("password")).sendKeys(pass);
   		driver.findElement(By.xpath(("//button[@type=\"submit\"]"))).click();
   		
   		Thread.sleep(3000);
   		//Assert.assertEquals(a, "Dashboard");
   		if(Scenario.equalsIgnoreCase("both wrong")) {
   			String ab=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
   			System.out.println(ab);
   		}
   		else {
   			String a=driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]")).getText();
   		Assert.assertEquals(a, "Dashboard");
   		}
   		
     }

     @DataProvider(name="testdata")
     @Test
     public Object[] [] loginTestData() {
   	  
   	return new Object[] []
   			{
   		{"both wrong", "a", "b"},
   		{"both right", "Admin", "admin123"}
   			};
   			  
     }
     
}
	
	



