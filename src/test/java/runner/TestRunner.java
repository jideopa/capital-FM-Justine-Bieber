package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/",
        glue = "steps",
        tags = "@smoke",
        plugin = { "pretty"},
        monochrome = true)
public class TestRunner {
}
