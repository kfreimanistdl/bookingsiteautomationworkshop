package pages.signup;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.BookingsPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $(By.xpath("//input[@name = 'firstname']"));
    }

    private SelenideElement getLastNameField() {
        return $(By.xpath("//input[@name = 'lastname']"));
    }

    private SelenideElement getMobileNumberField() {
        return $(By.xpath("//input[@name = 'phone']"));
    }

    private SelenideElement getEmailField() {
        return $(By.xpath("//input[@name = 'email']"));
    }

    private SelenideElement getPasswordField() {
        return $(By.xpath("//input[@name = 'password']"));
    }

    private SelenideElement getConfirmPasswordField() {
        return $(By.xpath("//input[@name = 'confirmpassword']"));
    }

    private SelenideElement getSignUpButton() {
        return $("#login button");
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
