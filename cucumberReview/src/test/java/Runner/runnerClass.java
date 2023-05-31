package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mbeya\\OneDrive\\Desktop\\demo\\cucumberReview\\src\\test\\resources\\Features" ,
        glue = "Steps",
        dryRun = false,
        tags = "@testcase6")
public class runnerClass {
}
