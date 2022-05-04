package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Computer computer = new Computer();
    ElectronicsTest electronics = new ElectronicsTest();
    Apparel apparel = new Apparel();
    GiftCards giftCards = new GiftCards();
    Books books = new Books();
    Jewelry jewelry = new Jewelry();
    DigitalDownLoads digitalDownLoads = new DigitalDownLoads();


    @Test // 1.3
    public void verifyTestNavigation() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(computer.getPageHeader(), "Computers", "Not on correct page");
        System.out.println("User is on Correct Tab = Computer");

        homePage.selectMenu("Electronics");
       // Assert.assertEquals(electronics.getPageHeader(), "Electronics", "Not on correct page");
        System.out.println("User is on Correct Tab = Electronics");

        homePage.selectMenu("Apparel");
        Assert.assertEquals(apparel.getPageHeader(), "Apparel", "Not on correct page");
        System.out.println("User is on Correct Tab = Apparel");

        homePage.selectMenu("Digital downloads");
        Assert.assertEquals(digitalDownLoads.getPageHeader(), "Digital downloads", "Not on correct page");
        System.out.println("User is on Correct Tab = Digital downloads");

        homePage.selectMenu("Books");
        Assert.assertEquals(books.getPageHeader(), "Books", "Not on correct page");
        System.out.println("User is on Correct Tab = Books");

        homePage.selectMenu("Jewelry");
        Assert.assertEquals(jewelry.getPageHeader(), "Jewelry", "Not on correct page");
        System.out.println("User is on Correct Tab = Jewelry");

        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(), "Gift Cards", "Not on correct page");
        System.out.println("User is on Correct Tab = Gift Cards");


    }


}






