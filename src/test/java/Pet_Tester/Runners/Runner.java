package Pet_Tester.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources",
        glue = "Pet_Tester/StepDefinitions",
        dryRun = false,
        tags = "@regression"


)
public class Runner {
}
