package stepdefinitions;

import cucumber.api.java.en.Given;
import general.TestContext;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() {
        System.out.println("OPEN HOMEPAGE");
    }

}
