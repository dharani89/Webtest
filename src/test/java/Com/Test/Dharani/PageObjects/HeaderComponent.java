package Com.Test.Dharani.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Test.Dharani.utils.DriverHelper;

public class HeaderComponent {

	// Element Locator
	private static By signInHeader = By.partialLinkText("Sign in");
	private static By tshirtBy = By.xpath("//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']");
	
	public static void clickSignIn(DriverHelper driver) {
		// Element Identification
		WebElement signInLink = driver.findElement(signInHeader);
			
		// Element Operation
		signInLink.click();	
	}
	
	public static void searchTshirts(DriverHelper driver) {
		WebElement tshirtLink = driver.findElement(tshirtBy);
		
		tshirtLink.click();
	}
}
