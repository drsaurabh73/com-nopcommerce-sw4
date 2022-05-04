package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethod extends Utility {
    By clickonNextDayair = By.xpath("//div[@class='method-name']//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
    By clickOncontinue1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By clickOn2ndDayAir = By.xpath("//input[@value='2nd Day Air___Shipping.FixedByWeightByTotal']");




    public void setClickonNextDayair() {
        clickOnElement(clickonNextDayair);
    }
    public void setClickOncontinue1() {
        clickOnElement(clickOncontinue1);
    }
    public void setClickOn2ndDayAir() {
        clickOnElement(clickOn2ndDayAir);
    }
    }


