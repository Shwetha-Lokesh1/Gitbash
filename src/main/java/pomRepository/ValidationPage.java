package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {
	
	public ValidationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='dtlview_Campaign Name']")
	private WebElement validateCampaign;
	
	@FindBy(xpath="//span[@id='dtlview_Organization Name']")
	private WebElement validateOrganization;
	
	@FindBy(xpath="//span[@id='dtlview_Product Name']")
	private WebElement validateproduct;
	
	
	
	
	//getter method

	public WebElement getValidateCampaign() {
		return validateCampaign;
	}
	
	
//business logics
	
	public WebElement getValidateOrganization() {
		return validateOrganization;
	}
	
	


	public WebElement getValidateproduct() {
		return validateproduct;
	}


	public String CampValidate()
	{
		return validateCampaign.getText();
	}
	
	public String OrgValidate()
	{
		return validateOrganization.getText();
	}
	public String productValidate()
	{
		return validateproduct.getText();
	}
	
	
}
	
	

