package pages.hoteldetails;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ConfirmHotelBookingPageObject {

    private SelenideElement getConfirmHotelBookingButton() {
        return $(By.xpath("//button[contains(text(), 'CONFIRM THIS BOOKING')]"));
    }

    public InvoicePageObject selectConfirmHotelBookingButton() {
        getConfirmHotelBookingButton().click();
        return page(InvoicePageObject.class);
    }

}
