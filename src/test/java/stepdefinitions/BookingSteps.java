package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class BookingSteps {

    private TestContext test;

    public BookingSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I select book ([^\"]*) button")
    public void iSelectBookingTypetButton(String type) {
        test.getLandingPage().selectBookingTypeButton(type);
    }

    @And("^I enter ([^\"]*) hotel")
    public void iEnterHotelName(String hotel) {
        test.getLandingPage().selectHotelField();
        test.getLandingPage().enterHotelName(hotel);

    }

    @And("^I select hotel that is located in ([^\"]*)")
    public void iSelectHotel(String location) {
        test.getLandingPage().selectHotelByLocation(location);
    }

    @And("^I select ([^\"]*) as Check in date")
    public void iEnterCheckinDateManually(String date) {
        test.getLandingPage().enterCheckinDateManually(date);
    }

    @And("^I select ([^\"]*) as Check out date")
    public void iEnterCheckoutDateManually(String date) {
        test.getLandingPage().enterCheckoutDateManually(date);
    }

    @And("^I select ([^\"]*) Adult and ([^\"]*) Child")
    public void iEnterCheckoutDateManually(String adultAmount, String childAmount) {
        test.getLandingPage().selectTravelersField();
        test.getLandingPage().enterAdultAmount(adultAmount);
        test.getLandingPage().enterChildAmount(childAmount);
    }

    @And("^I select Search button")
    public void iSelectSearchButton() {
        test.getLandingPage().selectSearchButton();
    }
}
