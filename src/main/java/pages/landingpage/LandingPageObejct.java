package pages.landingpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.hoteldetails.HotelDetailsPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LandingPageObejct {

    private SelenideElement getBookingTypeButton(String type) {
        return $("li[data-title = '" + type + "']");
    }

    private SelenideElement getHotelField() {
        return $(By.xpath("//span[contains(text(), 'Search by Hotel or City Name')]"));
    }

    private SelenideElement getHotelInputField() {
        return $(By.xpath("//div[@id = 'select2-drop']/descendant::input"));
    }

    private SelenideElement getHotelResultMenu(String location) {
        return $(By.xpath("//div[contains(text(), '" + location + "')]"));
    }

    private SelenideElement getCheckinDateField() {
        return $("input[name = 'checkin']");
    }

    private SelenideElement getCheckoutDateField() {
        return $("input[name = 'checkout']");
    }

    private SelenideElement getTravelersMenu() {
        return $("input[name = 'travellers']");
    }

    private SelenideElement getAdultField() {
        return $(By.id("adultInput"));
    }

    private SelenideElement getChildField() {
        return $(By.id("childInput"));
    }

    private SelenideElement getSearchButton() {
        return $(By.xpath("//form[@name = 'fCustomHotelSearch']/descendant::button[contains(text(), 'Search')]"));
    }

    public LandingPageObejct selectBookingTypeButton(String type) {
        if (type.toUpperCase().equals("FLIGHTS")){
            getBookingTypeButton(type.toLowerCase()).click();
        } else {
            getBookingTypeButton(type.toUpperCase()).click();
        }
        return page(LandingPageObejct.class);
    }

    public void selectHotelField() {
        getHotelField().click();
    }

    public void enterHotelName(String hotel) {
        getHotelInputField().sendKeys(hotel);
    }

    public void selectHotelByLocation(String location) {
        getHotelResultMenu(location).click();
    }

    public void enterCheckinDateManually(String date) {
        getCheckinDateField().sendKeys(date);
    }

    public void enterCheckoutDateManually(String date) {
        getCheckoutDateField().sendKeys(date);
    }

    public void selectTravelersField(){
        getTravelersMenu().click();
    }

    public void enterAdultAmount(String amount) {
        getAdultField().clear();
        getAdultField().sendKeys(amount);
    }

    public void enterChildAmount(String amount) {
        getChildField().clear();
        getChildField().sendKeys(amount);
    }

    public HotelDetailsPageObject selectSearchButton() {
        getSearchButton().click();
        return page(HotelDetailsPageObject.class);
    }
}
