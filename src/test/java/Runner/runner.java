package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		glue = {"stepDefinitions","hooks"},
		features = "src/test/resources/features/",
		plugin = { "pretty","html:target/cucumber-html-report.html"}
		//tags="@login"
		

)

public class runner {

}
