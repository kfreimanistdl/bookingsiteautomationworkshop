package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.NavigationPageObject;

public class BookingsPageSteps {

    private NavigationPageObject navigate = new NavigationPageObject();

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() {
        System.out.println("ACCOUNT CREATED!");
    }

    @And("^I logout$")
    public void iLogout() {
        navigate.selectLogoutButton();
    }
}