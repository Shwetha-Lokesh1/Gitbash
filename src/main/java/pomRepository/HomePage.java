package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Webdriver_Utility;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	@FindBy(linkText="Campaigns")
	private WebElement CampaignsLink;
	
	
	//this method is used for click on organization
		
	//organization
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationsLink;
	
	//logout
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
			private WebElement AdministratorSign;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	

	public void setAdministratorSign(WebElement administratorSign) {
		AdministratorSign = administratorSign;
	}
	


	public WebElement getAdministratorSign() {
		return AdministratorSign;
	}


	public WebElement getOrganizationsLink() {
		return OrganizationsLink;
	}

	
	public WebElement getMoreLink() {
		return moreLink;
	}
	

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}
	
	public WebElement getAdminisatorSign() {
		return AdministratorSign;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	
	//this is used to click on more link
	
	public void clickOnMoreLink()
	{
	
		moreLink.click();;
}
	
	//this is used to click on campaign link
	
	public void  clickOnCampaignsLink()
	{
		CampaignsLink.click();
	}
	
	//this is used to click on orgnization link
	
	public void  clickOnOrganizationsLink()
	{
		OrganizationsLink.click();
	}
	
	
	
	
	
	/**
	 * click more link using Action class
	 * @param driver
	 */
	public void clickMoreLink(WebDriver driver)
	{
		Webdriver_Utility wlib=new Webdriver_Utility();
		wlib.ActionsMoveToElement(driver, moreLink);
	CampaignsLink.click();
	}
	
	public void Logout(WebDriver driver)
	{
		Webdriver_Utility wlib=new Webdriver_Utility();
		wlib.ActionsMoveToElement(driver, AdministratorSign);
		signOutLink.click();
		
	}
}
	
	
	
	
	
	
