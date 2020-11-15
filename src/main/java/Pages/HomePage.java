package Pages;

import com.paypal.selion.platform.html.Table;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;

public class HomePage {
	 Table tableHeading;
	 
	   public String getUserName(){
		   tableHeading =  new Table("xpath=//table//tr[@class='heading3']");
		   WebDriverWaitUtils.waitUntilElementIsPresent(tableHeading.getLocator());
	       return tableHeading.getText();

	    }

	 
}
