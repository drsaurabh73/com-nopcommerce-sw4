package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Register extends Utility {
    By actualMessage = By.xpath("//h1[text()='Welcome, Please Sign In!']");// verify register

    By firstname = By.xpath("//input[@id='FirstName']");
    By lastname = By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@type='email' and @name='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmpassword = By.xpath("//input[@name='ConfirmPassword']");
    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");
    By actualMessage1 = By.xpath("//div[contains(text(),'Your registration completed')]");// registration completed
    By clickcontinue = By.xpath("//a[text()='Continue']");

    public void getFirstName(String text) {
        sendTextToElement(firstname,text);
    }
    public void getLastName (String text){
        sendTextToElement(lastname,text);
    }
    public void getemailaddress(String text) {
        sendTextToElement(email,text);
    }
    public void getPassword(String text) {
        sendTextToElement(password,text);
    }
    public void getConfirmPassword(String text) {
        sendTextToElement(confirmpassword,text);
    }
    public void getClickOnRegister() {
        clickOnElement(clickOnRegister);
    }
    public String verifyRegistrationComplete() {
       return getTextFromElement(actualMessage1);
    }
    public void setClickContinue() {
        clickOnElement(clickcontinue);
    }









}
