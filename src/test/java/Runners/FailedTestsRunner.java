package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target-html-reports"},
        features = "target/rerun.txt",
        glue = "step_definitions"
)
public class FailedTestsRunner {

}
