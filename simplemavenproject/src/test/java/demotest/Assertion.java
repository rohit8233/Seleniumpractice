package demotest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	  WebDriver driver;
	  
	  
	@Test (enabled=false)
	
	public void demo() {
		
		System.out.println("open browser");
		Assert.assertEquals(true, true);
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("click on login");
		
		System.out.println("validate homepage");

        Assert.assertEquals(true, false);
        
		System.out.println("logout");


		
	}
	
	
	@Test  (enabled=false)
	
	public void demo2() {
		
		SoftAssert sa=new SoftAssert();                 //SoftAssert 
		
		System.out.println("open browser");
        sa.assertEquals(false, false);	
        
		System.out.println("username");
		System.out.println("password");
		System.out.println("click on login");
		
		System.out.println("validate homepage");

        sa.assertEquals(false, true, "not validating homepage");  
        
		System.out.println("logout");
		
		sa.assertAll();  //always use this method at the end of method and only used in softassert
		
		
	}
	
	@Test (enabled=false)
	
	public void homepagevalidation() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("matching both");
	}
	
	@Test (enabled=false)
	
	public void alertvalidation() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("566445");
		driver.findElement(By.name("submit")).click();
		Alert a=driver.switchTo().alert();
		Assert.assertNotNull(a);               //Hard Assert
		
		System.out.println(a);
		System.out.println("alert is displayed");
		
		String text=a.getText();
		System.out.println(text);
		Assert.assertEquals("Do you really want to delete this Customer?", text);
		a.accept();
		driver.quit();	
		
	}
	
	@Test(enabled=false)
	
	public void logodisplayed() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@src=\"/logo.png\"]"));
		Assert.assertEquals(true, logo.isDisplayed());
		System.out.println(logo.isDisplayed());
		driver.quit();
		
		
	}
@Test (enabled=false)
	
	public void printtitles() {
		
		driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//img[@alt=\"LambdaTest Client - Directi\"]"));
	 
		 System.out.println(ele.getAttribute("alt"));
	 
		driver.quit();
	
	
}

@Test (enabled=false)

public void draganddrop() {
	
	driver=new ChromeDriver();
	driver.get("https://emicalculator.net/");
	driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.xpath("(//span[@tabindex=\"0\"])[1]"));
    Actions a=new Actions(driver);
    System.out.println(ele.getLocation());
    a.dragAndDropBy(ele, 80, 0).build().perform();
    System.out.println(ele.getLocation());
	driver.quit();
}

@Test (enabled=false)

public void pagination() {
	
	driver=new ChromeDriver();
	driver.get("https://datatables.net/examples/advanced_init/html5-data-options.html");
	driver.manage().window().maximize();
    int a= driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
    System.out.println(a);
    for(int i=1; i<=a; i++) {
    	driver.findElement(By.cssSelector("#example_paginate>span>a:nth-child("+i+")"));
    List<WebElement> ele=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
    for(WebElement b:ele) {
    	System.out.println(b.getText());
    }
	System.out.println();
    }
    String ele2=driver.findElement(By.xpath("//a[text()='Ad by EthicalAds']")).getText().split(" ")[1];
    System.out.println(ele2);
    driver.quit();
}
@Test (enabled=false)

public void pagination2() {
	
	driver=new ChromeDriver();
	driver.get("https://programmers.io/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Hire An Expert']")).click();
    driver.findElement(By.xpath("//a[text()='Automation Testing']")).click();
    List<WebElement> c=driver.findElements(By.cssSelector("#post-8633 > div.testing_tools_blk > div > div > div.row-col.testing_tools_col > div > div > ul > li>img"));
    for(WebElement d:c) {
    	System.out.println(d.getAttribute("alt"));
    }
    driver.quit();
}

@Test 

public void pagination4() {
	
	driver=new ChromeDriver();
	driver.get("https://datatables.net/examples/advanced_init/html5-data-options.html");
	driver.manage().window().maximize();
    int a= driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
    System.out.println(a);
    for(int i=1; i<=a; i++) {
    	driver.findElement(By.cssSelector("#example_paginate>span>a:nth-child("+i+")"));
    List<WebElement> ele=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
    for(WebElement b:ele) {
    	System.out.println(b.getText());
    }
	System.out.println();
    }
    String ele2=driver.findElement(By.xpath("//a[text()='Ad by EthicalAds']")).getText().split(" ")[1];
    System.out.println(ele2);
    driver.quit();
}

@Test (enabled=false)

public void pagination5() {
	
	driver=new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/atozautomationtraining/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	//String a=driver.findElement(By.xpath("(//h3)[1]")).getText();
	//System.out.println(a);
	System.out.println(title);


}

@Test (enabled=false)

public void pagination6() throws InterruptedException {
	
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
  driver.findElement(By.xpath("//a[@href='/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3']")).click();
  List<WebElement> ele3=driver.findElements(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li"));
  for(WebElement a2:ele3) {
	  System.out.println(a2.getText());
  }
  
  
 /*
 // String price=driver.findElement(By.xpath("(//td[text()='Deal of the Day:']//ancestor::div[@id=\"centerCol\"]//descendant::span[text()=\"₹649.00\"])[2]")).getText();
  //System.out.println(price);
    //WebElement ele=driver.findElement(By.id("quantity"));  
    
   // Select s=new Select(ele);
   // s.selectByIndex(2);
    WebElement addcart=driver.findElement(By.name("submit.add-to-cart"));

    WebDriverWait wait=new WebDriverWait(driver, 300);
    wait.until(ExpectedConditions.elementToBeClickable(addcart));
    
    driver.findElement(By.xpath("//a[@class=\"a-button-text\"]")).click();
    Thread.sleep(3000);
    WebElement ele2=driver.findElement(By.xpath("//span[text()='Lifelong Yoga mat for Women & Men EVA Material 4mm Black Anti Slip f…']"));
    String prdctname=ele2.getText();
    
   Assert.assertEquals(prdctname, "Lifelong Yoga mat for Women & Men EVA Material 4mm Black Anti Slip f…");
    
    */
   
    driver.close();
    
    
}

@Test (enabled=false)

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
  String text=driver.findElement(By.xpath("//span[text()='Dorca Black Dust Cover for PS5, Soft Neat Lining Dust Guard for PS5 Co…']")).getText();
 System.out.println(text);

}


@Test (enabled=false)

public void pagination8() throws InterruptedException  {
	
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[text()='Mobiles' and @data-csa-c-slot-id=\"nav_cs_1\"]")).click();
    List<WebElement> ele=driver.findElements(By.cssSelector("#contentGrid_298275>div>div>div>div>div>a>img:nth-child(1)"));
    for(WebElement a:ele) {
    	System.out.println(a.getAttribute("alt"));
    }
    
    String b=driver.findElement(By.xpath("//img[@alt=\"Note 10 pro\"]")).getAttribute("alt");
    System.out.println(b);
    driver.close();
        
}

}
