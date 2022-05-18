package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;


    public void clickOnLoginLink() {
        log.info("click on login link: " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        log.info("click on register link : " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnLogOutButton() {
        log.info("click on logout button : " + logOut.toString());
        clickOnElement(logOut);
    }

    public void verifyLogoutLinkIsDisplayed() {
        log.info("verify log out link is displayed : " + logOut.toString());
        verifyThatElementIsDisplayed(logOut);
    }

    public void verifyLogInLinkIsDisplayed() {
        log.info("verify login link is displayed : " + loginLink.toString());
        verifyThatElementIsDisplayed(loginLink);
    }

    //==================================
    public void clickOnComputerTab(){
        log.info("click on computer tab : " + computerTab.toString());
        clickOnElement(computerTab);
    }
}