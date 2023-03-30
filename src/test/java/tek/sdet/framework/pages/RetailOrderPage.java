package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "cancelBtn")
	public WebElement cancelBTN;

	@FindBy(id = "reasonInput")
	public WebElement reasonInput;

	@FindBy(id = "orderSubmitBtn")
	public WebElement orderSubmitBTN;

	@FindBy(id = "returnBtn")
	public WebElement returnBTN;

	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;

	@FindBy(id = "buyAgainBtn")
	public WebElement buyAgainBTN;

	@FindBy(id = "reviewBtn")
	public WebElement reviewBTN;

	@FindBy(id = "headlineInput")
	public WebElement headlineInput;

	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;

	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewBTN;

	@FindBy(css = "div.main-container div:nth-child(1) div.bg-gray-100 div.orders div.orders__container > div.order:nth-child(4)")
	public WebElement order;

}
