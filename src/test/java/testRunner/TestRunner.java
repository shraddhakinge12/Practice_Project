package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/nitesh/Selenium/SeleniumMavenProject/Features/Login.feature",
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true)

public class TestRunner {
}
