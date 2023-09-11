package demotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excelfileconcept {

	 @Test
	 
	 public void exceldatas() throws EncryptedDocumentException, IOException {
		 
         WebDriver driver=new ChromeDriver();
        // File src=new File("C:\\Users\\RohitChoudhary\\Documents\\exceldata.xlsx");
         FileInputStream f=new FileInputStream("C:\\Users\\RohitChoudhary\\eclipse-workspace\\simplemavenproject\\exceldata.xlsx");
         Workbook w=WorkbookFactory.create(f);
         String user=w.getSheet("sheet1").getRow(1).getCell(0).toString();
         String pass=w.getSheet("sheet1").getRow(1).getCell(1).toString();
         System.out.println(user);
         
         driver.manage().window().maximize();
     	 driver.get("https://www.facebook.com/login/");
     	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	 driver.findElement(By.id("email")).sendKeys(user);
     	 driver.findElement(By.id("pass")).sendKeys(pass);
     	 driver.close();
         
         
	 }
}
