package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class NavigationSteps {

    private TestContext test;

    public NavigationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select My Account button in Navigation bar")
    public void iSelectMyAccountButton() {
        test.getNavigationPage().selectMyAccountButton();
    }

    @And("^I select Sign Up button in Navigation bar")
    public void iSelectSignUpButton() {
        test.getNavigationPage().selectSignUpButton();
    }

    @And("^I select User Account button in Navigation bar")
    public void iSelectUserAccountButton() {
        test.getNavigationPage().selectUserAccountButton(test.getUser().getFirstName());
    }

    @And("^I select Logout button in Navigation bar")
    public void iSelectLogoutButton() {
        test.getNavigationPage().selectLogoutButton();
    }

    @And("^I select Login button in Navigation bar")
    public void iSelectLoginButton() {
        test.getNavigationPage().selectLoginButton();
    }

    @And("^I select Home button in Navigation bar")
    public void iSelectHomeButton() throws InterruptedException {
        test.getNavigationPage().selectHomeButton();
    }

}
