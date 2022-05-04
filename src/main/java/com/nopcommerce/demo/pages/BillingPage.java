package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {
    By firstNameLink = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@name='BillingNewAddress.City']");
    By address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    By postalcode = By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']");
    By phonenumber = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    By clickOnContinue = By.xpath("//button[@onclick='Billing.save()']");


    public void enterFirstName(String text) {
        sendTextToElement(firstNameLink, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void enterEmailAddress(String text) {
        sendTextToElement(email, text);
    }

    public void enterCountryName(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    public void enterCityName(String text) {
        sendTextToElement(city, text);
    }
    public void enterAddress(String text) { sendTextToElement(address,text);}

    public void enterZipcode(String text) {
        sendTextToElement(postalcode, text);
    }

    public void enterPhonenumber(String text) {
        sendTextToElement(phonenumber, text);
    }

    public void setClickOnContinue() {
        clickOnElement(clickOnContinue);
    }
}