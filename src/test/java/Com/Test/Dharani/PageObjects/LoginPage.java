package Com.Test.Dharani.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Test.Dharani.POJO.SignIn;
import Com.Test.Dharani.utils.DriverHelper;

public class LoginPage {

	public By email = By.name("email");
	public By pwd = By.id("passwd");
	
	public By signInBy = By.id("SubmitLogin");
	
	
	
	public void singIn(DriverHelper driver, SignIn signIn) {
		WebElement emailText = driver.findElement(email);
		WebElement pwdText = driver.findElement(pwd);
		WebElement signInBtn = driver.findElement(signInBy);
		
		emailText.sendKeys(signIn.getEmail());
		pwdText.sendKeys(signIn.getPassword());
		
		signInBtn.click();
	}
	
	
}
