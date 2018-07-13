package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.BookingsPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("test");
    }

    private SelenideElement getLastNameField() {
        return $("test");
    }

    private SelenideElement getMobileNumberField() {
        return $("test");
    }

    private SelenideElement getEmailField() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getConfirmPasswordField() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void enterFirstName(String name) {
        getFirstNameField().sendKeys(name);
    }

    public void enterLastName(String name) {
        getLastNameField().sendKeys(name);
    }

    public void enterMobileNumber(String mobile) {
        getMobileNumberField().sendKeys(mobile);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        getConfirmPasswordField().sendKeys(password);
    }

    public BookingsPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(BookingsPageObject.class);
    }

}
