package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private NavigationPageObject navigation = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("OPEN HOMEPAGE");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        navigation.selectMyAccountButton();
    }

    @And("^I select Sign up button in Landing page$")
    public void iSelectSignUpButton() throws Throwable {
        navigation.selectSignUpButton();
    }

    @And("^I select Login button in Landing page$")
    public void iSelectLoginButton() throws Throwable {
        navigation.selectLoginButton();
    }

    @And("^I am in Signup form$")
    public void iAmInSignupForm() throws Throwable {
        iHaveOpenedHomepage();
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

}
