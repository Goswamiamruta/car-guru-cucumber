package com.au.carsguide.steps;

import com.au.carsguide.pages.BuyPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnTab(String value) {
        new BuyPages().mouseHooverOnBuyAndSellLink();
    }
    @And("I click Search Cars link")
    public void iClickSearchCarsLink() throws InterruptedException {
        Thread.sleep(2000);
        new BuyPages().searchCarLink();
    }
    @Then("I navigate to new and used car search page")
    public void iNavigateToNewAndUsedCarSearchPage() throws InterruptedException {
        Thread.sleep(2000);
        new BuyPages().clickOnNewAndUsedCars();
    }



    @And("I select make {string}")
    public void iSelectMake(String value) {
        new BuyPages().selectMakeOptions(value);
    }

    @And("I select model {string}")
    public void iSelectModel(String value) {
        new BuyPages().selectModelOptions(value);
    }

    @And("I select location {string}")
    public void iSelectLocation(String value) {
        new BuyPages().selectLocationOptions(value);
    }

    @And("I select price {string}")
    public void iSelectPrice(String value) throws InterruptedException {
        Thread.sleep(2000);
        new BuyPages().selectPriceText(value);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new BuyPages().clickOnFindMyNextCarTab();

    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertEquals(new BuyPages().verifyTheMake(make),make, "Error");

    }

      @And("I click Used link")
    public void iClickUsedLink() {
        new BuyPages().clickOnUsedLink();
    }

    @Then("I navigate to Used Cars For Sale page")
    public void iNavigateToUsedCarsForSalePage() {
    }
}
