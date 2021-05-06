package Com.Test.StepDefinitions;

import Com.Test.Dharani.POJO.SignIn;
import Com.Test.Dharani.PageObjects.AccountDetailsPage;
import Com.Test.Dharani.PageObjects.CartPage;
import Com.Test.Dharani.PageObjects.CheckoutPage;
import Com.Test.Dharani.PageObjects.HeaderComponent;
import Com.Test.Dharani.PageObjects.LoginPage;
import Com.Test.Dharani.PageObjects.OrderHistoryPage;
import Com.Test.Dharani.PageObjects.ProductResultPage;
import Com.Test.Dharani.utils.ConfigFileReader;
import Com.Test.Dharani.utils.DriverHelper;
import Com.Test.Dharani.utils.FileReaderManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	DriverHelper driverHelper;
	CheckoutPage checkoutPage ;
	AccountDetailsPage accountdetailsPage;
	
	ConfigFileReader configFileReader;
	FileReaderManager fileReadManager;
	
	String url;
	SignIn signIn;
	String orderRefNum;
	String newName;
	String userName;
	
	@Before
	public void dataSetUp() {
		configFileReader= FileReaderManager.getInstance().getConfigReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driverHelper = new DriverHelper();
		url = configFileReader.getApplicationUrl();
		newName = configFileReader.getNewName();
		userName = configFileReader.getUserName();
		signIn = FileReaderManager.getInstance().getJsonReader().getCustomerByName(userName);
		checkoutPage = new CheckoutPage();
		accountdetailsPage = new AccountDetailsPage();
	}
	
	@Given("^User Navigates to login page$")
	public void userNavigatesToLoginPage() {
		driverHelper.openBrowser();
		driverHelper.goToApplication(url);
	}
	
	@When("^User enter the credentials and login$")
	public void userLogin() {
		HeaderComponent.clickSignIn(driverHelper);
		
		LoginPage loginPage = new LoginPage();
		loginPage.singIn(driverHelper, signIn);
	}
	
	@Then("^User should be successfully logged in$")
	public void userLoginSuccessful() {
		// validation steps to be added
	}

	@Given("^User navigates to T-Shirt page$")
	public void userNavigatesToProductPage() {
		HeaderComponent.searchTshirts(driverHelper);
	}

	@And("^choose to buy the first item$")
	public void chooseToBuyFirstItem() {
		ProductResultPage productResult = new ProductResultPage();
		productResult.select_Product(driverHelper);
		productResult.clickOn_AddToCart(driverHelper);
	}

	@When("^User proceeds to checkout$")
	public void proceedToCheckout() throws InterruptedException {
		CartPage cartPage = new CartPage();
		cartPage.proceedToCheckout(driverHelper);
	}

	@And("^enter the requested checkout details$")
	public void enterCheckoutDetails(){
		
		checkoutPage.summaryProceedToCheckout(driverHelper);
		checkoutPage.addressProceedToCheckout(driverHelper);
		checkoutPage.acceptTerms(driverHelper);
		checkoutPage.shippingProceedToCheckout(driverHelper);
		checkoutPage.selectPayment(driverHelper);
	}

	@And("^proceed confirming order placement$")
	public void proceedOrderConfirmation() {
		checkoutPage.confirmOrder(driverHelper);
	}
	
	@Then("^Order should be placed successfully$")
	public void orderSuccessfullyPlaced() {
		// validation steps to be added
	}

	@When("^User navigates to order history page$")
	public void navigateToOrderHistoryPage() {
		orderRefNum = checkoutPage.getRefNum(driverHelper);
		checkoutPage.backToOrders(driverHelper);
	}

	@Then("^Order should be visible in order history page$")
	public void validateOrderHistoryPage() throws Throwable {
		OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
		if(orderHistoryPage.validateOrder(driverHelper,orderRefNum))
		{
			System.out.println("Order T-Shirt is Successful");
		}
	}
	
	@Given("^User Navtigates to Account information page$")
	public void navigateToAccountInformationPage()  {
	   accountdetailsPage.clickOnMyAccount(driverHelper);
	}

	@When("^User choose to Update personal details$")
	public void chooseToUpdatePersonalDetails() {
		accountdetailsPage.clickOnPersonalInfo(driverHelper);
	}
	
	@And("^updates First name$")
	public void updateFirstName() {
		accountdetailsPage.updateFirstName(driverHelper,signIn.getPassword(),newName);
	}

	@Then("^First name update should be successful$")
	public void firstNameUpdateValidation() {
		// validation steps to be added
	}
	
	@And("^revert the test changes$")
	public void revertChange() {
		
		accountdetailsPage.clickOnMyAccount(driverHelper);
		accountdetailsPage.clickOnPersonalInfo(driverHelper);
		accountdetailsPage.updateFirstName(driverHelper,signIn.getPassword(),userName);
	}
	
	@After
	public void cleanUp() {
		driverHelper.closeBrowser();
	}

}