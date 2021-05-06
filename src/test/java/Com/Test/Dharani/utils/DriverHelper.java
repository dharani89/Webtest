package Com.Test.Dharani.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverHelper {
	
	
	private WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void goToApplication(String url) {
		driver.get(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("Closed the browser");
	}
	
	public WebElement findElement(By elementBy) {
		// Wait Logic to be added
		return driver.findElement(elementBy);
	}
	
	public void scrollTo(WebElement el) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", el);
	}
}