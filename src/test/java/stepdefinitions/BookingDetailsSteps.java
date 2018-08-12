package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

public class BookingDetailsSteps {

    private TestContext test;

    public BookingDetailsSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I select ([^\"]*) room$")
    public void iSelectRoom(String roomType) throws InterruptedException {
        test.getHotelDetailPage().scrollToRoomsSection();
        test.getHotelDetailPage().selectBookNowButton(roomType);
    }

}
