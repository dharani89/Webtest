package Com.Test.Dharani.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Test.Dharani.utils.DriverHelper;

public class OrderHistoryPage {

	public By orderRefListBy = By.xpath("//table[@id=\"order-list\"]//td[@class=\"history_link bold footable-first-column\"]");
	
	public boolean validateOrder(DriverHelper driver, String refNum) {
		List<WebElement> orderRefList = driver.getDriver().findElements(orderRefListBy);
		
		for(WebElement el: orderRefList) {
			if(el.getText().equals(refNum)) {
				return true;
			}
		}
		return false;
	}
}
