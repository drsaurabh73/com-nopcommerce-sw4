package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentInformation extends Utility {

    By selectCreditCard = By.xpath("//select[@id='CreditCardType']");
    By cardholderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber  = By.xpath("//input[@id='CardNumber']");
    By expiryMonth  = By.xpath("//select[@name='ExpireMonth']");
    By expiryYear  = By.xpath("//select[@name='ExpireYear']");
    By cardcode   = By.xpath("//input[@name='CardCode']");
    By clickonContinue = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void setSelectCreditCard() {
        selectByVisibleTextFromDropDown(selectCreditCard,"Master card");
    }
    public void enterCardHolerName(String text) {
        sendTextToElement(cardholderName,text);
    }
    public void enterCardNumber(String text) {
        sendTextToElement(cardNumber,text);
    }
    public void enterExpiryMonth() {
        selectByVisibleTextFromDropDown(expiryMonth,"10");
    }
    public void enterExpiryYear() {
        selectByVisibleTextFromDropDown(expiryYear,"2022");
    }
    public void setCardcode(String text){
        sendTextToElement(cardcode,"205");
    }
    public void setClickonContinue() {
        clickOnElement(clickonContinue);
    }


}
