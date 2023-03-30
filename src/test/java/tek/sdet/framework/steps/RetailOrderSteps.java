package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();
	@And("User click on Orders section")
	public void userClickOnOrderSection() {
		click(factory.homePage().orderBTN);
		logger.info("user clicked on orders section");
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrder() {
		click(factory.orderPage().order);
		logger.info("user clicked on first order in the list");
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelOrder() {
		click(factory.orderPage().cancelBTN);
		logger.info("user clicked on cancel button");
	}
	@And("User select the cancelation reason {string}")
	public void userSelectCancelationReason(String reason) {
		click(factory.orderPage().reasonInput);
		selectByVisibleText(factory.orderPage().reasonInput, reason);
		logger.info("user select the cancelation reason 'Bought wrong item'");
	}
	@And("User click on Cancel Order button")
	public void userClickCancelOrderBTN() {
		click(factory.orderPage().orderSubmitBTN);
		logger.info("user clicked on cancel order button");
	}
	@Then("Cancelation message should be displayed {string}")
	public void cancelationMSGshouldBeDisplayed(String message) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//p[text()='" + message + "']"))));
		logger.info("cancel message displayed");
	}
	@And("User click on Return Item button")
	public void userClickOnReturnItemBTN() {
		click(factory.orderPage().returnBTN);
		logger.info("user clicked on return item button");
	}
	@And("User select the Return Reason {string}")
	public void userSelectReturnReason(String reason) {
		click(factory.orderPage().reasonInput);
		selectByVisibleText(factory.orderPage().reasonInput, reason);
		logger.info("User select return reason");
	}
	@And("User select the drop off service {string}")
	public void userSelectDropOffService(String service) {
		click(factory.orderPage().dropOffInput);
		selectByVisibleText(factory.orderPage().dropOffInput, service);
		logger.info("user select the drop off service 'FedEx'");
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrder() {
		click(factory.orderPage().orderSubmitBTN);
		logger.info("user clicked on return order button");
	}
	@And("User click on Review button")
	public void userClickOnReturnBTN() {
		click(factory.orderPage().reviewBTN);
		logger.info("User clicked on review button");
	}
	@And("User write review headline {string} and {string}")
	public void userWriteReview(String headline, String reviewText) {
		sendText(factory.orderPage().headlineInput, headline);
		sendText(factory.orderPage().descriptionInput, reviewText);
		logger.info("user write review");
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewBTN);
		logger.info("User click Add Your Review button");
	}
	@Then("A review message should be displayed {string}")
	public void reviewMessageSubmit(String message) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[text()='" + message + "']"))));
		logger.info("Review message should be displayed");
	}

}
