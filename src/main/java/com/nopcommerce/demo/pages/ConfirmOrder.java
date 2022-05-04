package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrder extends Utility {

    By actualPaymentMessage = By.xpath("//span[@class='value-summary']/strong[text()='$2,950.00']");
    By confirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By actualMessage1 = By.xpath("//h1[contains(text(),'Checkout')]");// verify checkout
    By actualMessage2 = By.xpath("//span[contains(text(),'Payment Method:')]");// verify Payment Method
    By actualMessage3 = By.xpath("//li[@class='shipping-method']//span[@class='value']");// verify Shipping Method
    By actualMessage4 = By.xpath("//span[@class='value-summary']/strong[text()='$698.00']");// Verify total

    public String  paymentconfirm() {
        return getTextFromElement(actualPaymentMessage);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirm);
    }

    public String verifyCheckout() {
        return getTextFromElement(actualMessage1);
    }
    public String verifyPaymentMethod() {
        return getTextFromElement(actualMessage2);
    }
    public String verifyShippingMethod () {
        return getTextFromElement(actualMessage3);
    }
    public String verifyTotal() {
        return getTextFromElement(actualMessage4);
    }

}
