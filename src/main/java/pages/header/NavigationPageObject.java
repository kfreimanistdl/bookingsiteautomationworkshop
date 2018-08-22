package pages.header;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.landingpage.LandingPageObejct;
import pages.login.LoginPageObject;
import pages.singup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $(By.xpath("//nav/descendant::li[@id = 'li_myaccount' ]"));
    }

    private SelenideElement getUserAccountButton(String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username + "')]"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[ contains(text(), 'Sign Up') ]"));
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//nav/descendant::a[ contains(text(), 'Login') ]"));
    }

    private SelenideElement getLogoutButton() {
        return $(By.xpath("//nav/descendant::a[ contains(text(), 'Logout') ]"));
    }

    private SelenideElement getHomeButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Home')]"));
    }

    private SelenideElement getLogoImageLocation() {
        return $(".navbar-brand img");
    }

    private SelenideElement getLoadingIndicator() {
        return $(By.id("preloader"));
    }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public void selectUserAccountButton(String username) {
        getUserAccountButton(username).click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public LandingPageObejct selectLogoutButton() {
        getLogoutButton().click();
        return page(LandingPageObejct.class);
    }

    public LandingPageObejct selectHomeButton() throws InterruptedException {
        Thread.sleep(1000);
        getHomeButton().click();
        return page(LandingPageObejct.class);
    }

    public boolean isLogoVisible() {
        return getLogoImageLocation().isDisplayed();
    }

    public boolean isMyAccountButtonVisible() {
        return getMyAccountButton().isDisplayed();
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 5000);
    }

}
