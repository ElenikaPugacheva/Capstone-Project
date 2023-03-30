package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	//@FindBy(locatorType = "Value of Locator")
	// public WebElement elementName;
	// LOGIN //
	@FindBy(id = "email")
	public WebElement signInEmail;
	@FindBy(id = "password")
	public WebElement signInPassword;
	@FindBy(xpath = "//button[@id='loginBtn']")
	public WebElement loginBtn;

	
	// CREATE NEW ACCOUNT //
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	@FindBy (id = "passwordInput")
	public WebElement passwordInput;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	@FindBy(id = "signupBtn")
	public WebElement signupButton;
	@FindBy(xpath = "//a[@id='newAccountBtn']")
	public WebElement createAccountBtn;
}

