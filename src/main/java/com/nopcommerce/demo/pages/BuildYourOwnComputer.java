package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {

    By clickOnBuiltYourOwnComputer = By.xpath("//a[text()='Build your own computer']");

    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.xpath("//select[@name='product_attribute_2']");
    By harddrive  = By.xpath("//input[@value='7']");
    By operatingsystem   =   By.xpath("//input[@value='9']");
    By software = By.xpath("//input[@name='product_attribute_5' and @value='12']");
    By totalprice = By.xpath("//span[@id='price-value-1']");
    By actualMessage1 = By.xpath("//h1[text()='Build your own computer']");
    By getActualMessage2 = By.xpath("//span[@id='price-value-1']");
    By addtocart = By.xpath("//button[@class='button-1 add-to-cart-button']");
    By actualMessage3 = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@title='Close']");


    public void setClickOnBuiltYourOwnComputer () {
        clickOnElement(clickOnBuiltYourOwnComputer);
    }
    public String verifyTextBuiltYourComputer() {
        return getTextFromElement(actualMessage1);
    }
    public void selectProcessor(String intel) {
       selectByVisibleTextFromDropDown(processor,intel);
    }
    public void selectRam(String text) {
       selectByVisibleTextFromDropDown(ram,text);
    }
    public void setHarddrive() {
        clickOnElement(harddrive);
    }
    public void setOperatingsystem() {
        clickOnElement(operatingsystem);
    }
    public void setSoftware() {
        clickOnElement(software);
    }

    public String verifyTotal() {
        return getTextFromElement(getActualMessage2);
    }
    public void clickOnAddToCart() {
        clickOnElement(addtocart);
    }
    public String verifyTheShoppingCart(){
        return getTextFromElement(actualMessage3);
    }
    public void clickOnCloseButton()  {
        clickOnElement(closeButton);
    }




}
