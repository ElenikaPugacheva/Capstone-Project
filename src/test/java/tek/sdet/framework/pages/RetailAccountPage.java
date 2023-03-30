package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	// MAIN UI ELEMENTS

	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;

	@FindBy(id = "search")
	public WebElement departmentDropDown;

	@FindBy(id = "searchInput")
	public WebElement searchBarInput;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;

	@FindBy(id = "accountLink")
	public WebElement accountLink;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutButton;

	@FindBy(id = "orderLink")
	public WebElement orderButton;

	@FindBy(id = "cartBtn")
	public WebElement cartButton;

	//ACCOUNT MAIN OBJECTS
	
@FindBy(xpath = "//img[@alt='profile pic']")
public WebElement accountProfilePicture;
	
	@FindBy(xpath = "//h1[contains(text(),'Elena Pc')]")
	public WebElement userName;
	
	@FindBy(id = "profileImage")
	public WebElement profileIMG;

	@FindBy(xpath = "//h1[contains(text(),'elenapugacheva@tekschool.com')]")
	public WebElement email;

	@FindBy(id = "nameInput")
	public WebElement nameInputA;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInputA;

	@FindBy(id = "emailInput")
	public WebElement emailInput;

	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement personalUpdateBtn;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement updatedInfoMSG;

	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordInput;

	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;

	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordBtn;

	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement updatedPasswordMSG;

	// WALLET
	@FindBy(xpath = "//img[@alt='add payment method']")
	public WebElement addPaymentMethod;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement cardInfo;

	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumberInput;

	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthDropDown;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearDropDown;

	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement securityCodeInput;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement addedCardMessage;

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement updatedCardMessagePopuP;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editCardOption;

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeCardOption;

	@FindBy(xpath = "//p[contains(text(),'Debit Card')]")
	public WebElement debitCard;

	
	// ADDRESS
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]")
	public WebElement addAddressOption;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryDropDown;

	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement fullNameInput;

	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberInput;

	@FindBy(id = "streetInput")
	public WebElement streetInput;

	@FindBy(id = "apartmentInput")
	public WebElement aptInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/select[1]")
	public WebElement state;

	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInput;

	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addAddressBTN;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addedAddressMessage;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editAddress;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateYourAddress;

	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement removeAddress;

	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement updatedAddressMessage;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/*[1]")
	public WebElement addedAddress;

}
