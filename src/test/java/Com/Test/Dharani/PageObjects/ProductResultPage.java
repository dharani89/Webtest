package Com.Test.Dharani.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.Test.Dharani.utils.DriverHelper;

public class ProductResultPage {
	
	public By addToCartBtn = By.xpath("//a[@title=\"Add to cart\"]");
	
	public By productBy = By.xpath("//a[@class=\"product_img_link\"]");
			
	public void clickOn_AddToCart(DriverHelper driver) {
		
		WebElement btn_AddToCart = driver.findElement(addToCartBtn);
		btn_AddToCart.click();
	}
	
	public void select_Product(DriverHelper driver) {
		WebElement product = driver.findElement(productBy);
		
		Actions actions = new Actions(driver.getDriver());
		actions.moveToElement(product).perform();
	}
	
}