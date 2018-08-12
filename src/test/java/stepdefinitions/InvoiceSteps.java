package stepdefinitions;

import cucumber.api.java.en.Then;
import general.TestContext;

public class InvoiceSteps {

    private TestContext test;

    public InvoiceSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^Unpaid invoice page is opened$")
    public void unpaidInvoicePageIsOpened() {
        System.out.println("UNPAID INVOICE PAGE IS OPENED");
    }
}
