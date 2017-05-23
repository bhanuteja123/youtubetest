package Runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;


@CucumberOptions(features = "src\\test\\java\\feature", glue = "stepdefinition",tags = {"@History"},plugin = {"html:target/cucumber-htmlreport",
        "json:target/cucumber-report.json", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class Extent_runner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void start() {
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
