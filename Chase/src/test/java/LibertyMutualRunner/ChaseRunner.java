package LibertyMutualRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/chasefeatures"},
        glue = "LibertyMutualstepDefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/index.html","pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json", "junit:target/cucumber-reports/cucumber-results.xml"},
        strict = true,
        monochrome = true,
        publish = true,
        dryRun = false,//false to run test and true to give the failures
        tags = "( @Regression) and (not @pending)"

)
public class ChaseRunner {
}