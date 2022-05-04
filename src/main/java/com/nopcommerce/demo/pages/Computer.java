package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computer extends Utility {

    By PageHeader = By.xpath("//h1[text()='Computers']");
    By loginLink  = By.xpath("");
    By registerLink = By.xpath("");

    public String getPageHeader() {
        return getTextFromElement(PageHeader);
    }
    // click on login link
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    // click on Register link
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

}
