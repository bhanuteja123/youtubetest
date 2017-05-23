package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by bhanu_000 on 18-05-2017.
 */
@CucumberOptions(features = "src\\test\\java\\feature", glue = "stepdefinition", tags = {"@History"}, dryRun = false, format = {"html:target/cucumber-htmlreport", "json:target/cucumber-report.json"})
public class runner extends AbstractTestNGCucumberTests {
}
