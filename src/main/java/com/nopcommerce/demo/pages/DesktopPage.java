package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By desktop = By.xpath("//div[@class='sub-category-item']//a[contains(text(),'Desktops')]");
    By computer = By.linkText("Computers");

    public void clickOnComputer() {
        clickOnElement(computer);
    }

    public void clickonDesktop() {
        clickOnElement(desktop);
    }







}