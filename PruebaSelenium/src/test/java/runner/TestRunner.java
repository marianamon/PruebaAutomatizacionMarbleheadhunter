package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		,format = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
		)
 

public class TestRunner {

}

