package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
        features = "src/test/resources/rename.feature",
        glue = {"StepDefinition1"},
       plugin = {"pretty","html:target/Cucumberreport/cucumber-reports.html"}
)
public class TestRunner {
}