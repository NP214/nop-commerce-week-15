package com.nopcommerce.steps;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.DesktopsPage;
import com.nopcommerce.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerSteps {
    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }

    @And("^I should verify computer text$")
    public void iShouldVerifyComputerText() {
        new ComputerPage().verifyComputerText();
    }

    @And("^I click on desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I should verify desktops text$")
    public void iShouldVerifyDesktopsText() {
        new DesktopsPage().verifyDesktopText();
    }
}
