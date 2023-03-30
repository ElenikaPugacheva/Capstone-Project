package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage signinPage;
	private RetailAccountPage accountPage;
	private SignUpPage signupPage;
	private RetailOrderPage orderPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signinPage = new RetailSignInPage();
		this.signupPage = new SignUpPage();
		this.accountPage = new RetailAccountPage();
		this.orderPage = new RetailOrderPage();
	}
	public RetailHomePage homePage() {
		return this.homePage;
	}
	public RetailSignInPage signinPage() {
		return this.signinPage;
	}
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	public SignUpPage signupPage() {
		return this.signupPage;
	}
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
}
