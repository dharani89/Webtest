package Com.Test.Dharani.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Test.Dharani.utils.DriverHelper;

public class CartPage {

	public By proceedCartBy = By.xpath("//a[@title=\"Proceed to checkout\"]");
	
	public void proceedToCheckout(DriverHelper driver){
		
		WebElement proceedToCardBtn = driver.findElement(proceedCartBy);
		proceedToCardBtn.click();
		
	}
}
