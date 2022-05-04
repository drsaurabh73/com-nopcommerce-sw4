package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitaldownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewelrtLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftcardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");
    By cellphone = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    // click on login link
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    // click on Register link
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    // click on Element from Top Menu
    public void selectMenu(String menu) {
        if (menu.equalsIgnoreCase("Computers")) clickOnElement(computerLink);
        if (menu.equalsIgnoreCase("Electronics")) clickOnElement(electronicsLink);
        if (menu.equalsIgnoreCase("Apparel")) clickOnElement(apparelLink);
        if (menu.equalsIgnoreCase("Digital downloads")) clickOnElement(digitaldownloadsLink);
        if (menu.equalsIgnoreCase("Books")) clickOnElement(booksLink);
        if (menu.equalsIgnoreCase("Jewelry")) clickOnElement(jewelrtLink);
        if (menu.equalsIgnoreCase("Gift Cards")) clickOnElement(giftcardsLink);

    }
    // MouseHover on Electronics
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(electronicsLink);
    }
    public void mouseHoverOnCellPhone() {
        mouseHoverToElement(cellphone);
    }
    public void clickOnCellPhone() {
        clickOnElement(cellphone);
    }


}



