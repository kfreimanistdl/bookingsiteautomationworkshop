package stepdefinitions;

import cucumber.api.java.en.And;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {

    private User user = new User();
    private LoginPageObject login = new LoginPageObject();

    @And("^I enter existing Email address$")
    public void iEnterExistingEmailAddress() throws Throwable {
        login.enterEmail(user.getEmailAddress());
    }

    @And("^I enter existing Password$")
    public void iEnterExistingPassword() throws Throwable {
        login.enterPassword(user.getPassword());
    }

    @And("^I select Login button in Login form$")
    public void iSelectLoginButton() throws Throwable {
        login.selectLoginButton();
    }

}
