package stepdefinitions;

import cucumber.api.java.en.Given;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^Landing page is opened$")
    public void iHaveOpenedHomepage() {
        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getNavigationPage().isLogoVisible()).isTrue();
        assertThat(test.getNavigationPage().isMyAccountButtonVisible()).isTrue();
    }

}
