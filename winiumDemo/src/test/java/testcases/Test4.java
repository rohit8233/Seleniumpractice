package testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class Test4 {

	
	static WiniumDriverService service=null;
	static WiniumDriver driver=null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		String apppath="C:\\Windows\\System32\\notepad.exe";
		DesktopOptions option=new DesktopOptions();
		option.setApplicationPath(apppath);
		File driverpath=new File("C:\\Users\\RohitChoudhary\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
		service=new WiniumDriverService.Builder().usingDriverExecutable(driverpath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
		driver=new WiniumDriver(service, option);
		WebElement a=driver.findElement(By.name("Text Editor"));
		a.sendKeys("hello");
		WebElement b=driver.findElement(By.name("Application"));		
		WebElement c=b.findElement(By.name("File"));
		c.click();
		
		
           
    }	
		
	}

