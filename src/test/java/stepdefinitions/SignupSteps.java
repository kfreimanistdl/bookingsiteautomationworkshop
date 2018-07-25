package stepdefinitions;

import cucumber.api.java.en.And;
import general.User;
import pages.singup.SignUpPageObject;

public class SignupSteps {

    private SignUpPageObject signUp = new SignUpPageObject();
    private User user = new User();
    private User userTwo = new User("Janis", "Berzins");

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signUp.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signUp.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signUp.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signUp.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signUp.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signUp.enterConfirmationPassword(user.getPassword());
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
