package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//- Email, password, Login Button and "Welcome, Please Sign In!" text
public class LogInPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogInPage.class.getName());

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "Email")
    WebElement Email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement Password;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@class='master-wrapper-content']/div/div/div/div/h1")
    WebElement welcometext;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement ErrorMessage;


//======================================================================================================
    public void enterEmailId(String email) {
        log.info("enter email ID : " + Email.toString());
        sendTextToElement(Email, email);
    }

    public void enterPassword(String password) {
        log.info("enter password : " + Password.toString());
        sendTextToElement(Password, password);
    }

    public void clickOnLoginButton() {
        log.info("click on log in button : " + loginBtn.toString());
        clickOnElement(loginBtn);
    }

    public String verifyWelcomeText() {
        String actualWelcomeText = getTextFromElement(welcometext);
        log.info("Getting text from : " + welcometext.toString());
      return actualWelcomeText;
    }
    public String verifyErrorMessage() {
        log.info("verify error message : " + ErrorMessage.toString());
       return getTextFromElement(ErrorMessage);
    }

}
