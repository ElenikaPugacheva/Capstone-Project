package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");
		
		//SIGN UP
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signinBTN);
		logger.info("User clicked on Sign in option");
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String signInEmail, String signInPassword) {
	sendText(factory.signinPage().signInEmail, signInEmail);
	sendText(factory.signinPage().signInPassword, signInPassword);
	logger.info("User enter email and password");
}
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signinPage().loginBtn);
		logger.info("User click on log in button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedIntoAccount() {
		waitTillPresence(factory.homePage().accountLink);
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutBTN));
		logger.info("User should be logged in into Account");
		
		//CREATE NEW ACCOUNT
	}
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signinPage().createAccountBtn);
		logger.info("User click on Create New Account button");
	}
	@And("User fill the sign up information with below data")
	public void userFillTheSignUpForm(DataTable datatable) {
		List<Map<String, String>> map = datatable.asMaps(String.class, String.class);
		sendText(factory.signupPage().nameInput, map.get(0).get("name"));
		sendText(factory.signupPage().emailInput, map.get(0).get("email"));
		sendText(factory.signupPage().passwordInput, map.get(0).get("password"));
		sendText(factory.signupPage().confirmPasswordInput, map.get(0).get("confirmPassword"));
		logger.info("User fill the sign up information form with data table");		
	}
	@And("User click in Sign Up button")
	public void userClickInSignUpButton() {
		click(factory.signupPage().signupButton);
		logger.info("User clicked in Sign Up button");
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillClickable(factory.accountPage().profileIMG);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileIMG));
		logger.info("User should be logged into account page");
	}

}
//'elenapugacheva@tekschool.com'
//'N7441904#n'