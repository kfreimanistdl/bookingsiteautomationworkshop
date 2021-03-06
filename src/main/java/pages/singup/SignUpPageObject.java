package pages.singup;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("input[name = 'firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name = 'lastname']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name = 'phone']");
    }

    private SelenideElement getEmailField() {
        return $("input[name = 'email']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name = 'password']");
    }

    private SelenideElement getConfirmPasswordField() {
        return $("input[name = 'confirmpassword']");
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//button[contains(text(), 'Sign Up')]"));
    }

    private SelenideElement getFormTitle() {
        return $(".panel-heading");
    }

    private SelenideElement getErrorField() {
        return $(".alert-danger");
    }

    private ElementsCollection getErrorList() {
        return $$(".alert-danger p");
    }

    public void enterFirstName(String firstname) {
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        getLastNameField().sendKeys(lastname);
    }

    public void enterMobileNumber(String number) {
        getMobileNumberField().sendKeys(number);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmationPassword(String password) {
        getConfirmPasswordField().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }

    public String getFormTitleText() {
        return getFormTitle().getText();
    }

    public boolean isSignUpButtonVisible() {
        return getSignUpButton().isDisplayed();
    }

    public ElementsCollection getAllErrorMessages() {
        return getErrorList();
    }

    public int getErrorMessageCount() {
        return getErrorList().size();
    }

    public void waitUntilErrorMessagesAreDisplayed() {
        getErrorField().waitUntil(Condition.visible, 5000);
    }

}
