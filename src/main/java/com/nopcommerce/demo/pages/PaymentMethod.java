package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethod extends Utility {
    By clickOnCreditcard = By.xpath("//input[@value='Payments.Manual']");
    By clickonContinue = By.xpath("//button[@onclick='PaymentMethod.save()']");

    public void setClickOnCreditcard() {
        clickOnElement(clickOnCreditcard);
    }
    public void setClickonContinue() {
        clickOnElement(clickonContinue);
    }
}
