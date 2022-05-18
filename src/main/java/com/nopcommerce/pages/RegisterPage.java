package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;
import java.util.Random;
/*
 Register Text, male female radio, Firstname, lastname, Date of Birth drop downs, email,
Password, Confirm Password, Register Button, "First name is required.","Last name is
required."
Email is required.","Password is required.", "Password is required." error message,
"Your registration completed" message, "CONTINUE" button
Locators and it's actions

 */

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
@CacheLookup
@FindBy(xpath = "//input[@id='gender-female']")
WebElement femaleRadioButton;

@CacheLookup
@FindBy(xpath = "//input[@id='gender-male']")
WebElement maleRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement Month;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement Year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmedPassword2;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationSuccessfullyText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButtonOnRegisterPage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-fields']/div/span")
    List<WebElement> errorMessageList;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordIsRequired;

    //==========================================================================================
    public void verifyRegisterText() {
        Reporter.log("Verify Register Text" + registerText.toString() + "<br>");
        String expectedText = "Register";
        String actualText = getTextFromElement(registerText);
        Assert.assertEquals("register text is not displayed", expectedText, actualText);
    }
    public void selectGenderRadioButton(String gender) {
        Reporter.log("select Radio Button" + femaleRadioButton.toString() + "<br>");
        if (gender.equalsIgnoreCase("Male")) {
            clickOnElement(maleRadioButton);
        } else if (gender.equalsIgnoreCase("Female")){
            clickOnElement(femaleRadioButton);
        }else{
            System.out.println("select one gender radio button");
        }

    }
    public void enterFirstName(String name) {
        log.info("enter first name : " + firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String lastname) {
        log.info("enter last name : " + lastName.toString());
        sendTextToElement(lastName, lastname);
    }

    public void selectDateOfBirth(String date) {
        log.info("select date : " + day.toString());
        selectByVisibleTextFromDropDown(day, date);
    }

    public void selectMonthOfBirth(String month) {
        log.info("select month : " + Month.toString());
        selectByVisibleTextFromDropDown(Month, month);
    }

    public void selectYearOfBirth(String year) {
        log.info("select year : " + Year.toString());
        selectByVisibleTextFromDropDown(Year, year);

    }

    public void enterEmailId() {
        log.info("enter email id : " + email.toString());
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(email, "username" + randomInt + "@gmail.com");
        System.out.println("username" + randomInt + "@gmail.com");
    }

    public void enterPassword(String password) {
        log.info("enter password : " + password2.toString());
        sendTextToElement(password2, password);
    }

    public void enterConfirmedPassword(String confirmpassword) {
        log.info("enter confirm password : " + confirmedPassword2.toString());
        sendTextToElement(confirmedPassword2, confirmpassword);
    }

    public void verifyRegistrationCompletedText(String registrationMessage) {
        log.info("verify registration text : " + registrationSuccessfullyText.toString());
        String actualText = getTextFromElement(registrationSuccessfullyText);
        String expectedText = "Your registration completed";
        Assert.assertEquals("Registration text is not displayed", expectedText, actualText);
    }

    public void clickOnRegisterButtonOnRegisterPage() {
        log.info("click on register button : " + registerButtonOnRegisterPage.toString());
        clickOnElement(registerButtonOnRegisterPage);
    }

    public void verifyFirstNameIsRequired(String expText) {
        for (WebElement fn : errorMessageList) {
            if (fn.getText().equalsIgnoreCase("First name is required.")) {
              String actualText = fn.getText();
             Assert.assertEquals("abc",actualText,expText);
                log.info("verify first name is required : " + errorMessageList.toString());
            }
        }
     }
    public void verifyLastNameIsRequired(String expText) {
        for (WebElement ln : errorMessageList) {
            if (ln.getText().equalsIgnoreCase("Last name is required.")) {
               String actualText = ln.getText();
                Assert.assertEquals("abc",actualText,expText);
                log.info("verify last name : " + errorMessageList.toString());
            }
        }
    }
    public void verifyEmailIsRequired(String expText) {
        for (WebElement em : errorMessageList) {
            if (em.getText().equalsIgnoreCase("Email is required.")) {
                String actualText = em.getText();
                Assert.assertEquals("abc",actualText,expText);
                log.info("verify email is required : " + errorMessageList.toString());
            }
        }
    }
    public void verifyPasswordIsRequired(){
        String actualText = getTextFromElement(passwordIsRequired);
        String expectedText = "Password is required.";
        Assert.assertEquals("abc",actualText,expectedText);
        log.info("verify password is required : " + errorMessageList.toString());
        }

    public void verifyConfirmPasswordIsRequired(String expText) {
        for (WebElement conpas : errorMessageList) {
            if (conpas.getText().equalsIgnoreCase("Password is required.")){
                String actualText = conpas.getText();
                Assert.assertEquals("abc",actualText,expText);
                log.info("verify confirm password is required : " + errorMessageList.toString());
            }
        }
    }













}