package tek.sdet.framework.steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().hamburgerButton);
		logger.info("User click on All section");
	}

	@Then("Below options are present in Shop by Department sidebar")
	public void belowOptionsArePresent(DataTable table) {
		waitTillPresence(factory.homePage().electronics);
		String[] expectedOptions = { "Electronics", "Computers", "Smart Home", "Sports", "Automative" };
		for (int i = 0; i < expectedOptions.length; i++) {
			WebElement option = getDriver().findElement(By.xpath("//span[text()='" + expectedOptions[i] + "']"));
			assert option.isDisplayed();
		}
		logger.info("Expected options are displayed");
	}

	@And("User click on {string}")
	public void userClickOnDepartment(String department) {
		click(getDriver().findElement(By.xpath("//span[text()='" + department + "']")));
		logger.info("User clicked on departments");
	}

	@Then("Below options are present in department")
	public void optionsArePresentInDepartment(String optionOne, String optionTwo) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + optionOne + "']"))));
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + optionTwo + "']"))));
		logger.info("Options are present in Department");
	}

	@And("User change category to {string}")
	public void userChageCategory(String category) {
		click(factory.homePage().departmentDropDown);
		selectByVisibleText(factory.homePage().departmentDropDown, category);
		logger.info("User changed category");
	}

	@And("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		sendText(factory.homePage().searchBarInput, item);
		logger.info("User search for an item");
	}

	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBTN);
		logger.info("User clicked on search icon");
	}

	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().product);
		logger.info("User clicked on item");
	}

	@And("User select quantity {string}")
	public void userSelectQuantity(String qty) {
		click(factory.homePage().qty);
		selectByVisibleText(factory.homePage().qty, qty);
		logger.info("User select quantity of item");
	}

	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBTN);
		logger.info("User click add to cart button");
	}

	@Then("The Cart icon quantity should be change to {string}")
	public void cartIconQuantityShouldBeChange(String qty) {
		Assert.assertTrue(isElementDisplayed(
				getDriver().findElement(By.xpath("//span[@id = 'cartQuantity' and text()='" + qty + "']"))));
		logger.info("Cart icon quantity changed");
	}

	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartBTN);
		logger.info("User click on Cart option");
	}

	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckOut() {
		click(factory.homePage().proceedToCheckout);
		logger.info("User click on Proceed to Checkout button");
	}

	@And("User click Add a new address link for shipping address")
	public void userClickAddNewAddressLink() {
		click(factory.homePage().addAddressBTN);
		logger.info("User click Add a new address link for shipping address");
	}

	@And("User click Add a credit card or Debit card for Payment method")
	public void userClickAddPaymentMethod() {
		click(factory.homePage().addPaymentBTN);
		logger.info("User click Add a credit card or Debit card for Payment method");
	}

	@And("User click on Place Your Order")
	public void userClickPlaceYourOrder() {
		click(factory.homePage().placeOrderBTN);
		logger.info("User click on Place Your Order");
	}

	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String message) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//p[text()='" + message + "']"))));
		logger.info("A message should be displayed 'Order Placed, Thanks'");
	}

}
