package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.landingpage.BookHotelsPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountMenu() {
        return $(By.xpath("//nav/descendant::li[@id = 'li_myaccount']"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::li[@id = 'li_myaccount']/descendant::a[contains(text(), 'Sign')]"));
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//nav/descendant::li[@id = 'li_myaccount']/descendant::a[contains(text(), 'Login')]"));
    }

    private SelenideElement getLogoutButton() {
        return $("test");
    }

    public void selectMyAccountMenu() {
        getMyAccountMenu().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public BookHotelsPageObject selectLogoutButton() {
        getLogoutButton().click();
        return page(BookHotelsPageObject.class);
    }

}
