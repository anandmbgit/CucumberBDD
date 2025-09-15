package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	protected WebDriver driver;
	
	
	public Base(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void enterfieldvalue(By locator, String value) {
		
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
	}

	public void click(By locator) {
		
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(locator));
		
		driver.findElement(locator).click();
		
	}
}
