package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LogInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LogInSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {

    }

    @And("^I can see welcome to sign in text$")
    public void iCanSeeWelcomeToSignInText() {
        Assert.assertEquals("Login page is not displayed",new LogInPage().verifyWelcomeText(),"Welcome, Please Sign In!");
    }


    @And("^I enter emailID \"([^\"]*)\"$")
    public void iEnterEmailID(String email) {
        new LogInPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new LogInPage().enterPassword(password);
    }
    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LogInPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErroeMessage(String errorMessage) {
        Assert.assertEquals("Error message is not displayed",errorMessage,new LogInPage().verifyErrorMessage());
    }


    @Then("^I should see the logout link$")
    public void iShouldSeeTheLogoutLink() {
        new HomePage().verifyLogoutLinkIsDisplayed();
    }


    @And("^I should see login link$")
    public void iShouldSeeLoginLink() {
        new HomePage().verifyLogInLinkIsDisplayed();
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new HomePage().clickOnLogOutButton();
    }
}
