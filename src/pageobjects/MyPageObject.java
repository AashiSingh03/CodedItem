package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Salesforce_UIConnection"
     )             
public class MyPageObject {

	@TextType()
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username;
	@TextType()
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	@ButtonType()
	@FindBy(xpath = "//input[@id='Login']")
	public WebElement logIn;
			
}
