package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "./src/main/resources/featureFiles/userRegistration.feature", glue="stepDefinitions", monochrome = true)
public class RunnerClass {

}
