package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ThankYou extends Utility {

    By Thankyoutext = By.xpath("//h1[contains(text(),'Thank you')]");
    By actualMessage = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By clickOncontinue = By.xpath("//button[contains(text(),'Continue')]");

    public String verifyTheText() {
        return getTextFromElement(Thankyoutext);
    }
    public String verifyTheSuccessfulMessage() {
        return getTextFromElement(actualMessage);
    }
    public void setClickOncontinue() {
        clickOnElement(clickOncontinue);
    }
}
