package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() {
        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getAccountPage().getAccountName()).isEqualTo(test.getUser().getFirstName());
        assertThat(test.getAccountPage().getAccountLastname()).isEqualTo(test.getUser().getLastName());
    }

}
