package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homepage = new homePage(DriverFactory.getDriver());

    @Given("user navigates to LC Waikiki")
    public void userNavigatesToLCWaikiki() {
        homepage.userNavigatestoLCWaikiki();
    }

    @When("click Login button")
    public void clickLoginButton() {
        homepage.clickLoginButton();
    }

    @Then("should see home page")
    public void shouldSeeHomePage() {
        homepage.shouldSeeHomePage();
    }

    @When("hover mouse hover {string}")
    public void hoverMouseHover(String categoryName) {
        homepage.hoverMouseHover(categoryName);
    }

    @When("click Product {string}")
    public void clickCategory(String productName) {
        homepage.clickProduct(productName);

    }
}
