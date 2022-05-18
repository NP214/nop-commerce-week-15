package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/*
- Build your own computer Text, Processor Drop Down, Ram
drop down,
HDD radios, os radio, software check boxes, Add To Card button, "The product has been
added to your shopping cart"
message locators and it's actions
 */
public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='product_attribute_2'])[1]")
    WebElement ramM;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='product_attribute_3_6'])[1]")
   WebElement  threeHundredhddButton;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='product_attribute_3_7'])[1]")
    WebElement  fourHundredhddButton;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[4]/ul[1]/li[1]/label[1]")
    WebElement vistaHome;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[4]/ul[1]/li[2]/label[1]")
    WebElement vistaPremium;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[5]/ul[1]/li[1]/label[1]")
    WebElement microsoftOfficeSoftware;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[5]/ul[1]/li[2]/label[1]")
    WebElement acrobatReadersoftwareButton;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[5]/ul[1]/li[3]/label[1]")
    WebElement totalCommanderSoftware;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[9]/div[1]/button[1]")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    WebElement message1;


    public void selectprocessor(String processor) {

        log.info("select processor " + processorDropDown.getText());
    selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void ramDropDown(String ram) {
        selectByVisibleTextFromDropDown(ramM, ram);
    }

    public void selectHddButton(String hdd) {
        if(hdd.equalsIgnoreCase("320 GB")){
            clickOnElement(threeHundredhddButton);
        }else if(hdd.equalsIgnoreCase("400 GB [+$100.00]")){
            clickOnElement(fourHundredhddButton);
        }else{
            System.out.println("select one hdd option");
        }
    }



    public void selectOsButton(String os) {
       if(os.equalsIgnoreCase("Vista Home [+$50.00]")){
           clickOnElement(vistaHome);
       }else if(os.equalsIgnoreCase("Vista Premium [+$60.00]")){
           clickOnElement(vistaPremium);
       }else{
           System.out.println("select one os");
       }
    }

    public void selectSoftwareButton(String software) {
        clickOnElement(microsoftOfficeSoftware);
      if(software.equalsIgnoreCase("Acrobat Reader [+$10.00]")){
        clickOnElement(acrobatReadersoftwareButton);
      }else if(software.equalsIgnoreCase("Microsoft Office [+$50.00]")) {
          clickOnElement(microsoftOfficeSoftware);
      }else{
          clickOnElement(totalCommanderSoftware);
      }
      }


    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void verifyAddedToYourShoppingCartMessage() {
        String actualText = getTextFromElement(message1);
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(actualText, expectedText, "Verify shopping cart text");
        log.info("verify added to your shopping cart message : " + message1.toString());
    }

}
