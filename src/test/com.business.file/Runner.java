import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty", "html:target/cucumber"},
        tags = ("@RunTest"),
        features = "src\\test\\com.business.validations\\Scenarios.feature")
public class Runner {

}
