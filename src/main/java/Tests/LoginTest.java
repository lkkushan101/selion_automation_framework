package Tests;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import Pages.LoginPage;
import Pages.HomePage;
import Utility.*;
public class LoginTest {
	 @Test
	  @WebTest
	  public void DemoTest1() throws InterruptedException, FileNotFoundException, IOException, ParseException {
	    //Launch the google URL in the browser
		JSONReader jsRead = new JSONReader();
	    Grid.driver().get(jsRead.ReadJSONFile("URL", "./Data/data.json"));
	    
	    LoginPage lgPage = new LoginPage();
	    lgPage.setUserName(jsRead.ReadJSONFile("username", "./Data/data.json"));
	    lgPage.setPassword(jsRead.ReadJSONFile("password", "./Data/data.json"));
	    lgPage.clickLogin();
	    HomePage hmPage = new HomePage();
	    Assert.assertEquals(hmPage.getUserName(),"Manger Id : mgr123");
	    
	    
	 }

}
