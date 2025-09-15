package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class AddEmp extends Base {
	
	private WebDriver driver;
	private By pim=By.xpath("//span[text()='PIM']");
	private By addemployee=By.xpath("//a[normalize-space()='Add Employee']");
	private By fnameInput = By.name("firstName");
	private By mnameInput = By.name("middleName");
	private By lnameInput = By.name("lastName");
	private By idInput = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    private By save=By.xpath("//button[@type='submit']");
	
    
	public AddEmp(WebDriver driver) {
		super(driver);
	}
	
	public void clickonPIM() {
		
	click(pim);	
	}
	
	public void clickonAddEmployee() {
		
		//driver.findElement(addemployee).click();
		
		click(addemployee);
	}
	
	
	
	public void enterFname(String fname) {
		
	//driver.findElement(fnameInput).sendKeys(fname);	
	
		enterfieldvalue(fnameInput,fname);
	}
	
	public void enterMname(String mname) {
		
		//driver.findElement(mnameInput).sendKeys(mname);	
		
		enterfieldvalue(mnameInput,mname);
		}
	
	public void enterLname(String lname) {
		
		enterfieldvalue(lnameInput,lname);	
		}
	public void enterId(String id) {
		
		enterfieldvalue(idInput,id);	
		}
	
    public void clickSave() {
		
		//driver.findElement(save).click();	
    	
    	click(save);
		}

}
