package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.nio.file.attribute.FileAttribute;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "StepDefinitions",dryRun = false,plugin = {"pretty"},tags = "@testcase1")
public class testRunner {
}
