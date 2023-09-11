package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class Test1 {

	
	@Test
	public void main()throws  InterruptedException, MalformedURLException {
 
		
		DesktopOptions option=new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
		
		WebElement calfrm=driver.findElement(By.className("ApplicationFrameWindow"));
       // WebElement menu=calfrm.findElement(By.id("SystemMenuBar"));
		//WebElement bar=calfrm.findElement(By.className("ApplicationFrameTitleBarWindow"));
		//WebElement systembar=bar.findElement(By.id("TitleBar"));
		//WebElement a=systembar.findElement(By.id("SystemMenuBar"));
       // WebElement maximise=a.findElement(By.name("Maximize Calculator"));
     // maximise.click();
       // WebElement navigation=calfrm.findElement(By.id("TogglePaneButton"));
       // navigation.click();
       // driver.close();
		//WebElement a=calfrm.findElement(By.name("Calculator"));
		WebElement b=driver.findElement(By.id("num7Button"));
		option.setLaunchDelay(2);
		b.click();
	
	//	WebElement c=b.findElement(By.name("Open Navigation"));
       //  c.click();
         
	}

}
