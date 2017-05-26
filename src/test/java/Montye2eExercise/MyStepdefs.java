package Montye2eExercise;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * All step definition
 */
public class MyStepdefs  {

    //object to call the methods from these class
    HomePage homePage = new HomePage();

    @Given("^I am viewing product list tops$")
    public void iAmViewingProductListTops() {

    }

    @And("^I filter the product list$")
    public void iFilterTheProductList() {

    }

    @And("^I filter by option \"([^\"]*)\"$")
    public void iFilterByOption(String arg0) {

    }

    @And("^I select colour 'Black'$")
    public void iSelectColourBlack() {

    }

    @When("^I apply these filters$")
    public void iApplyTheseFilters() {

    }

    @Then("^Filter button has 1 filter$")
    public void filterButtonHasFilter() {

    }

    @And("^Filter returns a product list$")
    public void filterReturnsAProductList() {

    }

    @And("^I select colour 'White'$")
    public void iSelectColourWhite() {

    }

    @And("^I clear all filters$")
    public void iClearAllFilters() {

    }

    @Then("^Filter button has no filters$")
    public void filterButtonHasNoFilters() {

    }
}
