package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "",
        dryRun = false)
public class Runner {
}