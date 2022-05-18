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
// Desktops text, Sortby, Display, selectProductList Locators and it's actions
public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;

    public void verifyDesktopText(){
        log.info("verify desktop text : " + desktopsText.toString());
        String actualText = getTextFromElement(desktopsText);
        String expectedText = "Desktops";
        Assert.assertEquals("text is not visible",expectedText,actualText);
    }
}
