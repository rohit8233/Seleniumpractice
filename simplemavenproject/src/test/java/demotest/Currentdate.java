package demotest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.testng.annotations.Test;

public class Currentdate {

	 @Test
	 
	 public void SelectCurrentDate1() {


		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		  }
    @Test
	 
	 public void SelectCurrentDate2() {
 
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd");  
    Date date = new Date(); 
    System.out.println(formatter.format(date));  
}  
	 
	
}
	

