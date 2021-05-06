package Com.Test.Dharani.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Test.Dharani.utils.DriverHelper;

public class AccountDetailsPage {

	public By myAccount = By.xpath("//a[@title=\"View my customer account\"]");
	public By myPersonalInfo = By.xpath("//div[@class=\"row addresses-lists\"]//span[text()=\"My personal information\"]/..");
	
	public By firstNameBy = By.xpath("//input[@id=\"firstname\"]");
	public By saveBtnBy = By.xpath("//button[@name=\"submitIdentity\"]");
	public By oldPwdBy = By.xpath("//input[@id=\"old_passwd\"]");
	
	public void clickOnMyAccount(DriverHelper driver) {
		WebElement myAccountLink = driver.findElement(myAccount);
		myAccountLink.click();
	}
	public void clickOnPersonalInfo(DriverHelper driver) {
		WebElement myPersonalInfoLink = driver.findElement(myPersonalInfo);
		driver.scrollTo(myPersonalInfoLink);
		myPersonalInfoLink.click();
	}
	
	public void updateFirstName(DriverHelper driver, String pwd,String newName) {
		WebElement firstNameText = driver.findElement(firstNameBy);
		driver.scrollTo(firstNameText);
		firstNameText.clear();
		firstNameText.sendKeys(newName);
		
		WebElement oldPwdText = driver.findElement(oldPwdBy);
		driver.scrollTo(oldPwdText);
		oldPwdText.sendKeys(pwd);
		
		WebElement saveBtn = driver.findElement(saveBtnBy);
		driver.scrollTo(saveBtn);
		saveBtn.click();
		
	}
	
}
