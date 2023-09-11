package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class Test5 {

	
	
	private WiniumDriver app=null;
	private DesktopOptions options;
	private String note_path="C:\\Windows\\System32\\notepad.exe";
	private String winium_path="http://localhost:9999";
	
	
	@Test
	
	public void demo() throws MalformedURLException {
	
		 options=new DesktopOptions();
		options.setApplicationPath(note_path);
		app=new WiniumDriver(new URL(winium_path), options);
		app.findElementByClassName("Edit").sendKeys("hello");
		options.setLaunchDelay(5000);

		app.findElement(By.name("File")).click();
		app.findElement(By.id("Close")).click();
		
	}
}
