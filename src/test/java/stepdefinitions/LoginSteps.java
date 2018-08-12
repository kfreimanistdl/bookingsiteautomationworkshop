package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class LoginSteps {

    private TestContext test;

    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I enter existing Email address$")
    public void iEnterExistingEmailAddress() {
        test.getLoginPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter existing Password$")
    public void iEnterExistingPassword() {
        test.getLoginPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() {
        test.getLoginPage().selectLoginButton();
    }

}
