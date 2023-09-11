package demotest;

import java.io.ObjectInputFilter.Config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {

	
	public static void main(String[] args) {
		
		ExtentSparkReporter reporter= new ExtentSparkReporter("extent.html");
		reporter.config().setDocumentTitle("Full Report");
		reporter.config().setReportName("Aman");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports exten=new ExtentReports();
		exten.attachReporter(reporter);
		
		
		
	} 
}
