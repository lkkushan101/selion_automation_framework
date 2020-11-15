package Pages;

import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.html.Button;


public class LoginPage {

    
    TextField user99GuruName, password99Guru;
    Button loginButton;
   


    //Set user name in textbox

    public void setUserName(String userName){
    	user99GuruName =  new TextField("name=uid");

    	user99GuruName.type(userName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword){
    	password99Guru = new TextField("name=password");
    	
    	password99Guru.type(strPassword);

    }

    //Click on login button

    public void clickLogin(){
    	//loginButton = new TextField("name=btnLogin");
        loginButton = new Button ("name=btnLogin");
    	loginButton.click();	

    }
    
  
}