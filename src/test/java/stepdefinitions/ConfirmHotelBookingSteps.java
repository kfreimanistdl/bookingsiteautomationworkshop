package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class ConfirmHotelBookingSteps {

    private TestContext test;

    public ConfirmHotelBookingSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select CONFIRM THIS BOOKING button$")
    public void iSelectConfirmThisBookingButton() {
        test.getConfirmHotelBookingPage().selectConfirmHotelBookingButton();
    }
}
