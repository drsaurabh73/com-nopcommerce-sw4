package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeCheckoutPage extends Utility {

    By clickOnCheckoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By actualmessage = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By actualmessage1 = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");

    public String verifyTheTextWelcome() {
        return getTextFromElement(actualmessage);
    }
    public void setClickOnCheckoutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public String verifyWelcomePleaseSignIn() {
      return   getTextFromElement(actualmessage1);
    }
    public void getRegistered() {
        clickOnElement(clickOnRegister);
    }
}