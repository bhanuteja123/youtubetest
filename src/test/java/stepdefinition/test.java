package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Created by bhanu_000 on 19-05-2017.
 */
public class test implements En {
    public test() {
        Given("^The testing \"([^\"]*)\"$", (String arg0) -> {
            System.out.println(arg0);
        });
        When("^The Bhanu \"([^\"]*)\"$", (String arg0) -> {
            System.out.println(arg0);
        });
        Given("^the test \"([^\"]*)\"$", (String arg0) -> {
            System.out.println(arg0);
        });
        When("^the sure \"([^\"]*)\"$", (String arg0) -> {
            System.out.println(arg0);
        });
        Then("^the <Sure>$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Given("^asfafasa$", () -> {
            System.out.println("sssssssssssss");
        });
        Then("^fafafafaf$", () -> {
            System.out.println("dddddddddd");
        });

    }
}
