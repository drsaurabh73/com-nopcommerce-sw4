package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownLoads extends Utility {

    By PageHeader = By.xpath("//h1[text()='Digital downloads']");

    public String getPageHeader() {
        return getTextFromElement(PageHeader);
    }


}
