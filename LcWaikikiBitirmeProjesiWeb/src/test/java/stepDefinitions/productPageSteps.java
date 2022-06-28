package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.productPage;
import util.DriverFactory;

public class productPageSteps {
    productPage productpage = new productPage(DriverFactory.getDriver());
    @Then("should see products page")
    public void shouldSeeProductsPage() {
        productpage.shouldSeeProductsPage();
    }

    @When("click colour {string}")
    public void clickColour(String colour) {
        productpage.clickColour(colour);
    }

    @Then("should see product detail page")
    public void shouldSeeProductDetailPage() {
        productpage.shouldSeeProductDetailPage();
    }

    @When("click name {string}")
    public void clickName(String productName) {
        productpage.clickName(productName);
    }

    @When("click product size {string}")
    public void clickProductSize(String productSize) {
        productpage.clickProductSize(productSize);
    }

    @When("click add cart")
    public void clickAddCart() {
        productpage.clickCAddart();
    }

    @When("click cart button")
    public void clickCartButton() {
        productpage.clickCartButton();
    }
}
