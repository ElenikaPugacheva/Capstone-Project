package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	private POMFactory factory = new POMFactory();
	
	// UPDATE NAME AND PHONE NUMBER
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountLink);
		logger.info("User click on Account option");
	}
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhoneNumber(String name, String phoneNumber) {
		clearTextUsingSendKeys(factory.accountPage().nameInputA);
		sendText(factory.accountPage().nameInputA, name);
		clearTextUsingSendKeys(factory.accountPage().phoneInputA);
		sendText(factory.accountPage().phoneInputA, phoneNumber);
		logger.info("User updated Name and Phone");
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateBtn);
		logger.info("User clicked on update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatedInfoMSG));
		logger.info("User profile information is updated");
	}
	
		// PASSWORD UPDATE
		
	@And("User enter bellow information")
	public void userEnterNewPassword(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, data.get(0).get("previousPasswordInput"));
		sendText(factory.accountPage().newPasswordInput, data.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, data.get(0).get("confirmPassword"));
		logger.info("User enter information in data table");
	}
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("User click on Change Password button");
	}
	@Then("A message should be displayed 'Password Update Successfully'")
	public void successMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().updatedPasswordMSG);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatedPasswordMSG));
		logger.info("Message confirmed user successfully updated password should be displayed");
	}
	
	// ADDING PAYMENT METHOD
	
	@And("User click on add a payment method")
	public void userClickOnAddPaymentMethod() {
		click(factory.accountPage().addPaymentMethod);
		logger.info("User click on Add Payment Method button");
	}
	@And("User fill Debit or credit card information")
	public void userFillCardInformation(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		sendText(factory.accountPage().nameOnCardInput, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthDropDown, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearDropDown, data.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput, data.get(0).get("securityCodeInput"));
		logger.info("User fill debit or credit card information");
	}
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User clicked on add your card button");
	}
	@Then("Message should be displayed 'Payment Method Added Successfully'")
	public void confirmMsgShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().addedCardMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addedCardMessage));
		logger.info("Message should be displayed");
	}
	
	// CHANGE PAYMENT METHOD
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cardInfo);
		click(factory.accountPage().editCardOption);
		logger.info("User clicked on Edit option of card section");
	}
	@And("User edit information with below data")
	public void userEditInfoWithData(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthDropDown, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearDropDown, data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, data.get(0).get("securityCode"));
		logger.info("user changed card information");
	}
	@And("User click on update your card button")
	public void userClickOnUpdateCardBtn() {
		click(factory.accountPage().addYourCardButton);
		logger.info("user clicked on update your card button");
	}
	@Then("Message should be displayed {string}")
	public void confMSGshouldBeDisplayed() {
		waitTillPresence(factory.accountPage().updatedCardMessagePopuP);
		String  message = "Payment Method updated Successfully";
		String result = getElementText(factory.accountPage().updatedCardMessagePopuP);
		Assert.assertEquals(message, result);
		logger.info("Payment Method updated Successfully");
	}
	
	// REMOVE
	
	@And("User click on remove option from Card section")
	public void userClickOnRemoveOption() {
		click(factory.accountPage().cardInfo);
		click(factory.accountPage().removeCardOption);
		logger.info("user clicked on remove option of card section");
	}
	@Then("Payment detail should be removed")
	public void paymentDetailsShoudBeRemove() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().debitCard));
		logger.info("card was removed");
	}
	
	// ADDING ADDRESS
	
	@And("User click on Add Address option")
	public void userClickOnAddAddress() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on added Address option");
	}
	@And("User fill new address form withbellow information")
	public void userFillAddressForm(DataTable dateTable) {
		List<Map<String, String>> address = dateTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropDown, address.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, address.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, address.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, address.get(0).get("streetInput"));
		clearTextUsingSendKeys(factory.accountPage().aptInput);
		sendText(factory.accountPage().aptInput, address.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, address.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, address.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, address.get(0).get("zipCode"));
		logger.info("user filled new address form");
	}
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		waitTillClickable(factory.accountPage().addAddressBTN);
		click(factory.accountPage().addAddressBTN);
		logger.info("User click Add Your Address button");
	}
	
	// CHANGE ADDRESS
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddress);
		logger.info("User click on Edit Address option");
	}
	@And("User click Update Your Address button")
	public void userClickOnUpdateAddressButton() {
		click(factory.accountPage().addAddressBTN);
		logger.info("User click on Update Your Address button");
	}
	@And("User click on remove option of Address section")
	public void userClickOnRemoveAddressOption() {
		click(factory.accountPage().removeAddress);
		logger.info("User click on remove option of Address section");
	}
	@Then("Address details should be removed")
	public void removeAddress() throws InterruptedException {
		wait(300);
		Assert.assertFalse(isElementDisplayed(factory.accountPage().addedAddress));
		logger.info("Remove added Address");
	}
}