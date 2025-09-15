package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AddEmp;
import pages.loginPage;

public class addEmployee {
	
	WebDriver driver = DriverFactory.getDriver();
	loginPage loginPage;
	AddEmp addemp;
	@Given("Login in to application")
	public void Login_in_to_application() {
			
	loginPage = new loginPage(DriverFactory.getDriver());
	loginPage.enterusername("Admin");
	loginPage.enterpassword("admin123");
	loginPage.loginButton();
   
	}
	@And("I am on home page")
	public void I_am_on_Home_page() throws Throwable {
		addemp = new AddEmp(DriverFactory.getDriver());
	    //Thread.sleep(5000);
		addemp.clickonPIM();
		//Thread.sleep(5000);
	}
	@Then("I want to add employee")
	public void i_want_to_add_employee(DataTable datatable) throws Throwable {
	
		 List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
		    
		                                //  = List.of(Map.of("fname","mname","lname""id"))
		
		String firstname=data.get(0).get("fname");
		String middlename=data.get(0).get("mname");
		String lastname=data.get(0).get("lname");
		String id=data.get(0).get("id");
		
		addemp.clickonAddEmployee();
		addemp.enterFname(firstname);
		addemp.enterMname(middlename);
		addemp.enterLname(lastname);
		Thread.sleep(3000);
		addemp.enterId(id);
		addemp.clickSave();
		
	}

}
