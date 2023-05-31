package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Login.feature",glue = "StepDefinitions",plugin = {"pretty"},dryRun = false,tags = "@scenarioOutline")
public class testRunner {
}
