package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia extends Utility {
    By actualMessage = By.xpath("//h1[text()='Nokia Lumia 1020']");
    By actualMessage1 = By.xpath("//span[@id='price-value-20']");
    By clearquantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By changequantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addtocart = By.xpath("//button[@id='add-to-cart-button-20']");
    By getActualMessage2 =By.xpath("//p[@class='content']");
    By closeMessagebar = By.xpath("//span[@title='Close']");
    By mouseHoverOnShoppingcart = By.xpath("//span[text()='Shopping cart']");
    By gotocart = By.xpath("//button[contains(text(),'Go to cart')]");

    public String verifyNokiaLumia() {
        return getTextFromElement(actualMessage);
    }
    public String verifyThePrice() {
        return getTextFromElement(actualMessage1);
    }
    public void clearTheQuantity() {
        sendTextToElement(clearquantity);
    }

    public void setChangequantity(String qty) {
        sendTextToElement(changequantity, qty);
    }
public void clickOnaddTcart() {
        clickOnElement(addtocart);
}
public String verifytheShoppingCart() {
        return getTextFromElement(getActualMessage2);
}
public void setCloseMessagebar() {
        clickOnElement(closeMessagebar);
}
public void setMouseHoverOnShoppingcart() {
        mouseHoverToElement(mouseHoverOnShoppingcart);
}
public void clickOnGoTocart() {
        clickOnElement(gotocart);
}
}
