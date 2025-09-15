package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;

	@Before
	public void setup() {

		WebDriver driver = DriverFactory.getDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@After

	public void teardown() {
		DriverFactory.quitDriver();

	}
}
