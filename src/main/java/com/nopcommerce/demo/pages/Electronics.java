package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {

    By PageHeader = By.xpath("//h1[text()='Electronics']");
    By actualMessage = By.xpath("//h1[contains(text(),'Cell phones')]");
    By clickOnListView = By.xpath("//a[@class='viewmode-icon list']");
    By clickOnNokiaLumia = By.xpath("//h2[@class='product-title']//a[text()='Nokia Lumia 1020']");

    public String getPageHeader() {
        return getTextFromElement(PageHeader);
    }

    public String verifycellphone() {
        return getTextFromElement(actualMessage);
    }
    public void setClickOnListView() {
        clickOnElement(clickOnListView);
    }
    public void setClickOnNokiaLumia() {
        clickOnElement(clickOnNokiaLumia);
    }


}
