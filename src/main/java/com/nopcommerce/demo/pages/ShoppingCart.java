package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By MouseHoverShopping = By.xpath("//span[text()='Shopping cart']");
   By clickOnCart = By.xpath("//button[@class='button-1 cart-button']");

   // By actualMessage = By.xpath("//h1[text()='Shopping cart']");
    By actualMessage = By.xpath("//div/h1[text()='Shopping cart']");
    By clearquantity = By.xpath("//input[@aria-label='Qty.']");
    By changequantity = By.xpath("//input[@aria-label='Qty.']");
    By clickonUpdatecart = By.xpath("//button[@class='button-2 update-cart-button']");
    By actualMessage2 = By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']");
    By clickOnterms = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckOut = By.xpath("//button[@id='checkout']");
    By actualMessage5 = By.xpath("//h1[text()='Shopping cart']");// verify shopping cart
    By actualMessage3 = By.xpath("//input[@class='qty-input']");// verify the qty
    By actualMessage4 = By.xpath("//span[@class='product-subtotal']");// verify the total
    By clickonTermsofServices = By.xpath("//input[@id='termsofservice']");
    By clickoncheckoutcellphone = By.xpath("//button[@id='checkout']");


    public String verifyShoppingcart(){
        return getTextFromElement(actualMessage5);
    }
    public String verifyTheQty(String text) {
        return getTextFromElement(actualMessage3,text);
    }
    public String verifyThePrice() {
        return getTextFromElement(actualMessage4);
    }
    public void clickOnIAgreeTerms() {
        clickOnElement(clickonTermsofServices);
    }
    public void setClickoncheckoutcellphone() {
        clickOnElement(clickoncheckoutcellphone);
    }



    public void setMouseHoverShopping() {
        mouseHoverToElement(MouseHoverShopping);
    }

    public void setClickOnCart() {
        clickOnElement(clickOnCart);
    }

    public String verifyProductaddedToShoppingCart() {
        return getTextFromElement(actualMessage);
    }

    public void clearTheQuantity() {
        sendTextToElement(clearquantity);
    }

    public void setChangequantity(String qty) {
        sendTextToElement(changequantity,qty);
    }
    public void setClickonUpdatecart() {
        clickOnElement(clickonUpdatecart);
    }
    public String verifyTheTotal() {
        return getTextFromElement(actualMessage2);
    }
    public void setClickOnterms() {
        clickOnElement(clickOnterms);
    }
    public void setClickOnCheckOut() {
        clickOnElement(clickOnCheckOut);
    }


}
