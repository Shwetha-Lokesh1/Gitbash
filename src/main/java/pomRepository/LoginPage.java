package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//declaration
	
	@FindBy(name="user_name")
	private WebElement UserTextField;
	
	//@FindBy(name="user_password")
	@FindBys({@FindBy(name="user_password"),@FindBy(xpath="//input[@type=\"password\"]")})
	private WebElement PasswordTextField;
	

	//@FindBy(name="submitButton")
	
	//@FindBy(id="submitButton")
		@FindAll({@FindBy(css="input[type=\"submit\"]"),@FindBy(id="submitButton")})
		private WebElement LoginButton;


	public WebElement getUserTextField() {
		return UserTextField;
	}


	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//business logics this method is used to login to application @param Username @param Password
	
	public void loginToApplication(String Username, String Password )
	
	{
		UserTextField.sendKeys(Username);
		PasswordTextField.sendKeys(Password);
		LoginButton.click();
		
	}
	
	

}
 