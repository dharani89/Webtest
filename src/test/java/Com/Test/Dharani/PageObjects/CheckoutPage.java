package Com.Test.Dharani.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Test.Dharani.utils.DriverHelper;


public class CheckoutPage {

	public By summarProceedToChkout = By.xpath("//a[@title=\"Proceed to checkout\" and @class=\"button btn btn-default standard-checkout button-medium\"]");
	public By addressProceedToChkout = By.xpath("//button[@name=\"processAddress\"]");
	public By acceptTermsBy = By.xpath("//label[contains(text(),\"I agree\")]/..//input[@type=\"checkbox\"]");
	public By shippingProceedToChkout = By.xpath("//button[@name=\"processCarrier\" and @class=\"button btn btn-default standard-checkout button-medium\"]");
	public By payByCheck = By.xpath("//a[@title=\"Pay by check.\"]");
	
	public By confirmOrder = By.xpath("//span[text()=\"I confirm my order\"]/..");
	public By backToOrder = By.xpath("//a[@title=\"Back to orders\"]"); 
	public By refNumTextBy = By.xpath("//div[@class=\"box order-confirmation\"]");
	
	
	public void summaryProceedToCheckout(DriverHelper driver) {
		WebElement proceedToChkoutBtn = driver.findElement(summarProceedToChkout);
		driver.scrollTo(proceedToChkoutBtn);
		proceedToChkoutBtn.click();
	}
	
	public void addressProceedToCheckout(DriverHelper driver) {
		WebElement proceedToChkoutBtn = driver.findElement(addressProceedToChkout);
		driver.scrollTo(proceedToChkoutBtn);
		proceedToChkoutBtn.click();
	}
	
	public void acceptTerms(DriverHelper driver) {
		WebElement proceedToChkoutBtn = driver.findElement(acceptTermsBy);
		proceedToChkoutBtn.click();
	}
	
	public void shippingProceedToCheckout(DriverHelper driver) {
		WebElement proceedToChkoutBtn = driver.findElement(shippingProceedToChkout);
		driver.scrollTo(proceedToChkoutBtn);
		proceedToChkoutBtn.click();
	}
	
	public void selectPayment(DriverHelper driver) {
		WebElement payByCheckLink = driver.findElement(payByCheck);
		driver.scrollTo(payByCheckLink);
		payByCheckLink.click();
	}
	
	public void confirmOrder(DriverHelper driver) {
		WebElement confirmOrderBtn = driver.findElement(confirmOrder);
		driver.scrollTo(confirmOrderBtn);
		confirmOrderBtn.click();
	}
	public String getRefNum(DriverHelper driver){
		String refNumText = "";
		WebElement refNumElement = driver.findElement(refNumTextBy);
			
		String[] strLst = refNumElement.getText().split("Do not forget to include your order reference ");
			
		String[] strLst1 = strLst[1].split("\\.");
		refNumText = strLst1[0];
		System.out.println(refNumText);
		
		return refNumText;
		
	}
	public void backToOrders(DriverHelper driver) {
		WebElement backToOrderBtn = driver.findElement(backToOrder);
		driver.scrollTo(backToOrderBtn);
		backToOrderBtn.click();
	}
	
}
