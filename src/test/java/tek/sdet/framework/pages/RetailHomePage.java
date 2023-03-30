package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	// MAIN PAGE UI ELEMENTS
	
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;

	@FindBy(id = "search")
	public WebElement departmentDropDown;

	@FindBy(id = "searchInput")
	public WebElement searchBarInput;

	@FindBy(id = "searchBtn")
	public WebElement searchBTN;

	@FindBy(xpath = "//a[@id='signinLink']")
	public WebElement signinBTN;

	@FindBy(id = "cartBtn")
	public WebElement cartBTN;

	@FindBy(id = "accountLink")
	public WebElement accountLink;

	@FindBy(id = "logoutBtn")
	public WebElement logOutBTN;

	@FindBy(id = "orderLink")
	public WebElement orderBTN;

	// SIDEBAR ON HOMEPAGE WITHOUT DROPDOWN

	@FindBy(id = "hamburgerBtn")
	public WebElement hamburgerButton;

	@FindBy(linkText = "Test Selenium")
	public WebElement testSelenium;

	@FindBy(id = "heroImage")
	public WebElement homePageIMG;

	// SIDEBAR 

	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[1]")
	public WebElement sideBarHeader;

	@FindBy(id = "closeBtn")
	public WebElement closeBTN;

	@FindBy(id = "contentHeader")
	public WebElement contentHeader;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;

	@FindBy(id = "submenuBtn")
	public WebElement mainMenu;

	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement tvVideo;

	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGames;

	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;

	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement networking;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHome;

	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement homeLightning;

	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement plugsAndoutlets;

	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sports;

	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement athleticClothing;

	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement exerciseAndfitness;

	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automative;

	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement autoAccessories;

	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement powersports;

	@FindBy(className = "products__layout")
	public WebElement product;

	@FindBy(className = "product__select")
	public WebElement qty;

	// DIFFRENT ITEMS

	@FindBy(xpath = "//p[contains(text(),'LG OLED C1 Series 65 Smart TV')]")
	public WebElement LG_OLED_C1_65_SmartTV;

	@FindBy(xpath = "//p[contains(text(),'Xbox Series X')]")
	public WebElement Xbox_Series_X;

	@FindBy(xpath = "//img[@alt='USB Microphone']")
	public WebElement USB_Microphone;

	@FindBy(xpath = "//p[contains(text(),'Wireless USB WiFi Adapter')]")
	public WebElement WirelessUSB_Wifi_Adapter;

	@FindBy(xpath = "//p[contains(text(),'Ubiquiti UniFi 6 Pro Access Point')]")
	public WebElement UniFi_6_AccessPoint;

	@FindBy(xpath = "//p[contains(text(),'Smart Star Projector Galaxy Light')]")
	public WebElement galaxyProjector;

	@FindBy(xpath = "//img[@alt='Trading Card Binder for Pokemon']")
	public WebElement pokemonItem;

	// CART MANIPULATION

	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBTN;

	@FindBy(id = "cartQuantity")
	public WebElement cartQuantity;

	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckout;

	@FindBy(id = "addAddressBtn")
	public WebElement addAddressBTN;

	@FindBy(id = "addPaymentBtn")
	public WebElement addPaymentBTN;

	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBTN;

}
