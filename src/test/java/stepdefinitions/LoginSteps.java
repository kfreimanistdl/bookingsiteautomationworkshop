package stepdefinitions;

import cucumber.api.java.en.And;
import general.Account;
import pages.login.LoginPageObject;

public class LoginSteps {

    private Account account = new Account();
    private LoginPageObject login = new LoginPageObject();

    @And("^I enter existing Email address$")
    public void iEnterExistingEmailAddress() throws Throwable {
        login.enterEmail(account.getEmail());
    }

    @And("^I enter existing Password$")
    public void iEnterExistingPassword() throws Throwable {
        login.enterPassword(account.getPassword());
    }

    @And("^I select Login button in Login form$")
    public void iSelectLoginButton() throws Throwable {
        login.selectLoginButton();
    }

}
