package testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	private WiniumDriverService service;
	private WiniumDriver driver;

	@BeforeMethod
	public void before() throws IOException {
		String apppath="C:\\Windows\\System32\\calc.exe";
		String Driverpath="C:\\Users\\RohitChoudhary\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe";
		DesktopOptions option=new DesktopOptions();
		option.setApplicationPath(apppath);
		File driverpath=new File(Driverpath);
		service=new WiniumDriverService.Builder().usingDriverExecutable(driverpath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
		driver=new WiniumDriver(service, option);
	}
	
	@Test
	
	public void demo() throws InterruptedException, IOException {
		

		Thread.sleep(2000);
		WebElement calfrm=driver.findElement(By.name("Calculator"));
		WebElement menu=driver.findElement(By.id("NavView"));
		WebElement menubutton=menu.findElement(By.name("Open Navigation"));
		menubutton.click();
		Thread.sleep(2000);
	       // WebElement menu=calfrm.findElement(By.id("SystemMenuBar"));
			//WebElement bar=calfrm.findElement(By.className("ApplicationFrameTitleBarWindow"));
			//WebElement systembar=bar.findElement(By.id("TitleBar"));
		//WiniumDriver driver=new WiniumDriver(@"C:\\Users\\RohitChoudhary\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe", option);
		//driver.findElement(By.id("Maximize")).click();
	//	WebElement a=driver.findElement(By.id("num7Button"));
	//	a.click();
		//driver.findElement(By.id("plusButton")).click();
		//driver.findElement(By.id("num4Button")).click();
		//driver.findElement(By.id("equalButton")).click();
	}
	
	
	
	
}
