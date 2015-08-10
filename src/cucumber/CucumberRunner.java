package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "json:Results/json/cucumber.json"},
				  features={"src/cucumber.feature"})

public class CucumberRunner {

}
