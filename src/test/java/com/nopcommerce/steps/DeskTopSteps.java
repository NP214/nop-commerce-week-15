package com.nopcommerce.steps;



import com.nopcommerce.pages.BuildYourOwnComputerPage;
import com.nopcommerce.pages.ComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DeskTopSteps {


    @Then("^I should navigate to desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
    }

    @And("^I click on Build your own computer$")
    public void iClickOnBuildYourOwnComputer() {
        new ComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
new BuildYourOwnComputerPage().selectprocessor(processor);
    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().ramDropDown(ram);

    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHddButton(hdd);

    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOsButton(os);

    }

    @And("^I select Software\"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
new BuildYourOwnComputerPage().selectSoftwareButton(software);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }


    @Then("^I should verify the product has been added to your shopping cart$")
    public void iShouldVerifyTheProductHasBeenAddedToYourShoppingCart() {
        new BuildYourOwnComputerPage().verifyAddedToYourShoppingCartMessage();
    }


}
