package demotest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*import com.MedRev.asserts.dahsboard.DahsboardAsserts;
import com.packages.common.WebElementUtils;

public class Test2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 
		
		public void verifyoverviewAppearanc(String verificationText) {

	        wait.until(ExpectedConditions.visibilityOfAllElements(List_Overview_Appearance));
	        String [] overviewOptions =  verificationText.split(",");

	        int i = 0; 
	        for (WebElement webElement : List_Overview_Appearance) {

	                DahsboardAsserts.assertTextEquals(webElement.getText(), overviewOptions[i]);
	                i++;
	                }
	        }
		

		public void verifyOverviewFunctionality_allRespondent_defLoca(String verificationText) {
			String [] txt_2=verificationText.split(";");
			String a=txt_2[0];
		
	        wait.until(ExpectedConditions.visibilityOf(btn_Locations));
	        System.out.println("Default Location Selected  "+btn_Locations.getText());
	       
			WebElementUtils.selectRespondentFunctionality(select_RespondentTypeDashboard, driver, a );
			verifyoverviewAppearanc(txt_2[1]);
			
	    }
	}

}
*/


