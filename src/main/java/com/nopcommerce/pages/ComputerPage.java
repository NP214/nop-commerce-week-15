package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

// Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Link
public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    public ComputerPage() {
        PageFactory.initElements(driver,this);
    }
@CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktops;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerButton;


    public void verifyComputerText(){
        String actualText =   getTextFromElement(computerText);
        String expectedText = "Computers";
        Assert.assertEquals("text is not visible",expectedText,actualText);
        log.info("verify computer text : " + computerText.toString());
    }
    public void clickOnDesktop(){
        log.info("click on desktop: " + desktops.toString());
        clickOnElement(desktops);
    }
    public void clickOnBuildYourOwnComputer(){
        Reporter.log("Build your own computer"+buildYourOwnComputerButton.toString()+"<br>");
        clickOnElement(buildYourOwnComputerButton);
        log.info("eclick on build on your computer: " + buildYourOwnComputerButton.toString());
    }

}
