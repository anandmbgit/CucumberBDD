package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;


public class loginPage extends Base{

    private WebDriver driver;
	
	private By EnterUserName=By.name("username");
    private By EnterPassword=By.name("password");
    private By loginButton=By.xpath("//button[normalize-space()='Login']");
    private By useronHomePage=By.xpath("//p[@class='oxd-userdropdown-name']");
    private By logout=By.xpath("//a[normalize-space()='Logout']");
    
    
    public loginPage(WebDriver driver) {
		
    	super(driver);
	}
    
    public void enterusername(String username) {
    	//new WebDriverWait(driver,Duration.ofSeconds(20)).
    	//until(ExpectedConditions.visibilityOfElementLocated(EnterUserName));
    	
    	enterfieldvalue(EnterUserName,username);
    }
    
    public void enterpassword(String password) {
    	
    	enterfieldvalue(EnterPassword,password);
    
    }
    
    public void loginButton() {
    
    	click(loginButton);
    }
    
    public void logout() {
    	
    	driver.findElement(useronHomePage).click();
    	driver.findElement(logout).click();
    }
    
    
}
