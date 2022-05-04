package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    HomePage homePage = new HomePage();
    Electronics electronics = new Electronics();
    NokiaLumia nokiaLumia = new NokiaLumia();
    ShoppingCart shoppingCart = new ShoppingCart();
    WelcomeCheckoutPage welcomeCheckoutPage = new WelcomeCheckoutPage();
    Register register = new Register();
    BillingPage billingPage = new BillingPage();
    ShippingMethod shippingMethod = new ShippingMethod();
    PaymentMethod paymentMethod = new PaymentMethod();
    PaymentInformation paymentInformation = new PaymentInformation();
    ConfirmOrder confirmOrder = new ConfirmOrder();
    ThankYou thankYou = new ThankYou();


    @Test
    public void testName() {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnCellPhone();
        homePage.clickOnCellPhone();

    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnCellPhone();
        homePage.clickOnCellPhone();
        Assert.assertEquals(electronics.verifycellphone(),"Cell phones","Not Cell Phone");
        electronics.setClickOnListView();
        Thread.sleep(1000);
        electronics.setClickOnNokiaLumia();
        Assert.assertEquals(nokiaLumia.verifyNokiaLumia(),"Nokia Lumia 1020","Not Nokia");
        Assert.assertEquals(nokiaLumia.verifyThePrice(),"$349.00","Not correct Price");
        nokiaLumia.clearTheQuantity();
        nokiaLumia.setChangequantity("2");
        nokiaLumia.clickOnaddTcart();
        Assert.assertEquals(nokiaLumia.verifytheShoppingCart(),"The product has been added to your shopping cart","");
        nokiaLumia.setCloseMessagebar();
        nokiaLumia.setMouseHoverOnShoppingcart();
        nokiaLumia.clickOnGoTocart();
        Assert.assertEquals(shoppingCart.verifyShoppingcart(),"Shopping cart","");
        Thread.sleep(2000);
        Assert.assertEquals(shoppingCart.verifyTheQty("value"),"2","Not correct qty");
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCart.verifyThePrice(),"$698.00","Not correct Price");
        shoppingCart.setClickOnterms();
        shoppingCart.setClickoncheckoutcellphone();
        //verify the welcome message
        Assert.assertEquals(welcomeCheckoutPage.verifyWelcomePleaseSignIn(),"Welcome, Please Sign In!","");
        // click on register
        welcomeCheckoutPage.getRegistered();
        // registration details
        register.getFirstName("sam");
        register.getLastName("Patil");
        register.getemailaddress("sam1123@gamil.com");
        register.getPassword("123456");
        register.getConfirmPassword("123456");
        register.getClickOnRegister();
        // verify your registration completed
        Assert.assertEquals(register.verifyRegistrationComplete(),"Your registration completed","");
        register.setClickContinue();
        //2.25 verify the text shopping cart
        Assert.assertEquals(shoppingCart.verifyShoppingcart(),"Shopping cart","");
        shoppingCart.clickOnIAgreeTerms();
        shoppingCart.setClickoncheckoutcellphone();
        billingPage.enterFirstName("sam");
        billingPage.enterLastName("Patil");
        billingPage.enterEmailAddress("");
        billingPage.enterCountryName("India");
        billingPage.enterCityName("Mumbai");
        billingPage.enterAddress("Chota chatri");
        billingPage.enterZipcode("456789");
        billingPage.enterPhonenumber("075445566778");
        billingPage.setClickOnContinue();
        shippingMethod.setClickOn2ndDayAir();
        shippingMethod.setClickOncontinue1();
        paymentMethod.setClickOnCreditcard();
        paymentMethod.setClickonContinue();
        paymentInformation.setSelectCreditCard();
        paymentInformation.enterCardHolerName("sam");
        paymentInformation.enterCardNumber("4012888888881881");
        paymentInformation.enterExpiryMonth();
        paymentInformation.enterExpiryYear();
        paymentInformation.setCardcode("205");
        paymentInformation.setClickonContinue();
        //2.35 verify the checkout
        Assert.assertEquals(confirmOrder.verifyCheckout(),"Checkout","");
        //2.36 verify shipping
        Assert.assertEquals(confirmOrder.verifyShippingMethod(),"2nd Day Air","");
        //2.37 verify total
        Assert.assertEquals(confirmOrder.verifyTotal(),"$698.00","");
        //2.38 click on confirm
        confirmOrder.clickOnConfirmButton();
        // 2.39 Your order has been successfully processed!
        Assert.assertEquals(thankYou.verifyTheSuccessfulMessage(),"Your order has been successfully processed!","");
        thankYou.setClickOncontinue();











    }
}
