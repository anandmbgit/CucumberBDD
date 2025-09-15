package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;


public class loginSteps {

	
	WebDriver driver = DriverFactory.getDriver();
	loginPage loginPage;

	@Given("User launched the web browser")
	public void user_launched_the_web_browser() {

		System.out.println("User is on browser");
		loginPage = new loginPage(DriverFactory.getDriver());
	}

	@When("User enters username")
	public void user_enters_username() throws Throwable {
		//Thread.sleep(5000);
		loginPage.enterusername("Admin");
		

	}

	@When("User enters password")
	public void user_enters_password() throws Throwable {
		System.out.println("User about to enter password");
		//Thread.sleep(5000);
		loginPage.enterpassword("admin123");
		
	}

	@Then("User clicks on Login button")
	public void user_clicks_on_login_button() throws Throwable {
		System.out.println("User provided the pwd");
		//Thread.sleep(5000);
		loginPage.loginButton();
		//Thread.sleep(5000);
		
	}

	
}
