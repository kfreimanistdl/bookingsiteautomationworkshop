package stepdefinitions;

import cucumber.api.java.en.And;
import general.Account;
import pages.signup.SignUpPageObject;

public class SignupSteps {

    private SignUpPageObject signUp = new SignUpPageObject();
    private Account account = new Account();

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signUp.enterFirstName(account.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signUp.enterLastName(account.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signUp.enterMobileNumber(account.getPhoneNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signUp.enterEmail(account.getEmail());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signUp.enterPassword(account.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signUp.enterConfirmPassword(account.getPassword());
    }

    @And("^I select Sign up button in Signup page$")
    public void iSelectSignUpButtonInSignUpPage() throws Throwable {
        signUp.selectSignUpButton();
    }

    @And("I have created new account")
    public void newAccountCreated() throws Throwable {
        iEnterFirstName();
        iEnterLastName();
        iEnterMobileNumber();
        iEnterEmailAddress();
        iEnterPassword();
        iConfirmPassword();
        iSelectSignUpButtonInSignUpPage();
    }
}
