package com.nopcommerce.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {
    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
    }
    @And("^I select gender radio button \"([^\"]*)\"$")
    public void iSelectGenderRadioButton(String gender)  {
new RegisterPage().selectGenderRadioButton(gender);
    }

    @And("^I enter first name\"([^\"]*)\"$")
    public void iEnterFirstName(String FirstName) {
        new RegisterPage().enterFirstName(FirstName);

    }

    @And("^I enter last name\"([^\"]*)\"$")
    public void iEnterLastName(String LastName) {
        new RegisterPage().enterLastName(LastName);
    }

    @And("^I enter day\"([^\"]*)\"$")
    public void iEnterDay(String date) {
        new RegisterPage().selectDateOfBirth(date);
    }

    @And("^I enter month\"([^\"]*)\"$")
    public void iEnterMonth(String month) {
        new RegisterPage().selectMonthOfBirth(month);
    }

    @And("^I enter year\"([^\"]*)\"$")
    public void iEnterYear(String year) {
        new RegisterPage().selectYearOfBirth(year);
    }

    @And("^I enter email on register page$")
    public void iEnterEmailOnRegisterPage() {
        new RegisterPage().enterEmailId();
    }

    @And("^I enter password on register page\"([^\"]*)\"$")
    public void iEnterPasswordOnRegisterPage(String password) {
        new RegisterPage().enterPassword(password);

    }

    @And("^I enter confirm password on register page\"([^\"]*)\"$")
    public void iEnterConfirmPasswordOnRegisterPage(String confirmpassword) {
        new RegisterPage().enterConfirmedPassword(confirmpassword);
    }

    @And("^I click on register button on register page$")
    public void iClickOnRegisterButtonOnRegisterPage() {
        new RegisterPage().clickOnRegisterButtonOnRegisterPage();
    }

    @Then("^I can see the registration message \"([^\"]*)\"$")
    public void iCanSeeTheRegistrationMessage(String registrationMessage) {
        new RegisterPage().verifyRegistrationCompletedText(registrationMessage);
    }


    @Then("^I should see Register text$")
    public void iShouldSeeRegisterText() {
        new RegisterPage().verifyRegisterText();

    }
//==========================================================================================================

    @Then("^I should verify first name is required \"([^\"]*)\"$")
    public void iShouldVerifyFirstNameIsRequired(String msg)  {
        new RegisterPage().verifyFirstNameIsRequired(msg);
    }

    @And("^I should verify last name is required \"([^\"]*)\"$")
    public void iShouldVerifyLastNameIsRequired(String msg) {
        new RegisterPage().verifyLastNameIsRequired(msg);
    }

    @And("^I should verify email is required \"([^\"]*)\"$")
    public void iShouldVerifyEmailIsRequired(String msg) {
new RegisterPage().verifyEmailIsRequired(msg);
    }
    @And("^I should verify password is required$")
    public void iShouldVerifyPasswordIsRequired() {
        new RegisterPage().verifyPasswordIsRequired();
    }

    @And("^I should verify confirmpassword is required \"([^\"]*)\"$")
    public void iShouldVerifyConfirmpasswordIsRequired(String msg) {
        new RegisterPage().verifyConfirmPasswordIsRequired("Password is required.");
    }



}
