package pages.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    private SelenideElement getEmailField() {
        return $("input[name = 'username']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name = 'password']");
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//button[contains(text(), 'Login')]"));
    }

    private SelenideElement getLoginFormTitle() {
        return $(".panel-heading");
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public AccountPageObject selectLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }

    public String getLoginFormTitleText() {
        return getLoginFormTitle().getText();
    }

    public boolean isLoginButtonVisible() {
        return getLoginButton().isDisplayed();
    }

    public void waitUntilLoginFormIsLoaded() {
        getLoginButton().waitUntil(Condition.visible, 5000);
    }

}
