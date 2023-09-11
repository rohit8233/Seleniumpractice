package demotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {

	WebDriver driver;
	@Test(enabled=false)
	
	public void demo1() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("566445");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert a =driver.switchTo().alert();
		System.out.println(a);
		Assert.assertNotNull(a);
		System.out.println(a.getText());
		Assert.assertEquals(a.getText(), "Do you really want to delete this Customer?");	
		a.accept();
		driver.quit();
		
		
	}
	
	@Test(enabled=false)
	
	public void logoisDisplayed() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement a=driver.findElement(By.xpath("//img[@alt=\"Guru99 Demo Sites\"]"));
		Assert.assertEquals(true, a.isDisplayed());
		System.out.println(a.isDisplayed());
		driver.quit();
		
		
	}
	
	@Test(enabled=false)
	
	public void draganddrop() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		WebElement a=driver.findElement(By.cssSelector("#loanamountslider > span"));
		Actions b=new Actions(driver);
		System.out.println(a.getLocation());
		b.dragAndDropBy(a, 80, 0).build().perform();
		System.out.println(a.getLocation());	
	}
	
	
@Test(enabled=false)

public void pagination() {
	driver=new ChromeDriver();
	driver.get("https://datatables.net/examples/advanced_init/html5-data-options.html");
	driver.manage().window().maximize();
	int a=driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
	System.out.println(a);
	
	for(int i=1; i<=a; i++) {
	List<WebElement> ele=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
	for(WebElement name:ele) {
		System.out.println(name.getText());
	}
	String n="i+1";
	int number=Integer.parseInt(n);
	driver.findElement(By.cssSelector("#example_paginate>span>a:nth-child(1)"));
	
	}
	driver.quit();
}

@Test(enabled=false)

public void date() {
	
	DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime no=LocalDateTime.now();
	System.out.println(date.format(no));
	
	  }
     
  
     @Test(enabled=false)
     
     public void excelData() throws EncryptedDocumentException, IOException {
    	 
    	 
    	 FileInputStream file=new FileInputStream("C:\\Users\\RohitChoudhary\\eclipse-workspace\\simplemavenproject\\exceldata.xlsx");
    	 Workbook w=WorkbookFactory.create(file);
    	 String username=w.getSheet("sheet1").getRow(1).getCell(0).toString();
    	 String password=w.getSheet("Sheet1").getRow(1).getCell(1).toString();
         System.out.println(username);
         driver=new ChromeDriver();
         driver.manage().window().maximize();
     	 driver.get("https://www.facebook.com/login/");
     	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	 driver.findElement(By.id("email")).sendKeys(username);
     	 driver.findElement(By.id("pass")).sendKeys(password);
     	// driver.close();
    	 
     }
     
     @Test(enabled=false)
     
     public void getWindowHandles() {
    	 
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("https://demoqa.com/browser-windows");
    	 String parent=driver.getWindowHandle();
    	 driver.findElement(By.id("windowButton")).click();	 
    	 Set<String> child=driver.getWindowHandles();	 
    	 for(String a: child) {                                            
    		 
    		 if(!a.equals(parent)) {
    			 
    			 String title=driver.switchTo().window(a).getCurrentUrl();
    			 System.out.println(title);
    			 driver.close();
    		 }
    	 }
    	 
    	 driver.switchTo().window(parent);
    	 driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed(); 	 
     }
     
     
     
     public static HashMap <String, String> credentials(){
    	 
    	 
    	 HashMap<String, String> value=new HashMap<String, String>();
    	 value.put("customer", "roh123:123");
    	 value.put("seller", "aman@123:345");
    	 value.put("delivery", "deepak@123:987");
    	 
    	 return value;	 
     }
     
     @Test
     public void fetch() {
     String user=credentials().get("customer");
     String pass=credentials().get("seller");
     
     System.out.println(user);
     System.out.println(pass);

     
     
}
}

