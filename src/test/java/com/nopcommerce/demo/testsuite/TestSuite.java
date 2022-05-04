package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuite extends TestBase {
    HomePage homePage = new HomePage();
    Computer computer = new Computer();
   DesktopPage desktop = new DesktopPage();
   BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
   ShoppingCart shoppingCart = new ShoppingCart();
   WelcomeCheckoutPage welcomeCheckoutPage = new WelcomeCheckoutPage();
   BillingPage billingPage = new BillingPage();
   ShippingMethod shippingMethod = new ShippingMethod();
   PaymentMethod paymentMethod = new PaymentMethod();
   PaymentInformation paymentInformation = new PaymentInformation();
   ConfirmOrder confirmOrder = new ConfirmOrder();
   ThankYou thankYou = new ThankYou();


  @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
     desktop.clickOnComputer();
      desktop.clickonDesktop();
      buildYourOwnComputer.setClickOnBuiltYourOwnComputer();

     String actualMessage = buildYourOwnComputer.verifyTextBuiltYourComputer();
      String expectedbuiltMessage = "Build your own computer";
      Assert.assertEquals(actualMessage,expectedbuiltMessage,"");
      Thread.sleep(3000);

    //  buildYourOwnComputer.setClickOnBuiltYourOwnComputer();
      buildYourOwnComputer.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
      Thread.sleep(1000);
      buildYourOwnComputer.selectRam("8GB [+$60.00]");
      Thread.sleep(1000);
      buildYourOwnComputer.setHarddrive();
      Thread.sleep(1000);
      buildYourOwnComputer.setOperatingsystem();
      Thread.sleep(1000);
      buildYourOwnComputer.setSoftware();
      Thread.sleep(1000);
      String expectedverpriceMessage = "$1,475.00";
      String actualtotalMessage = buildYourOwnComputer.verifyTotal();
      Assert.assertEquals(actualtotalMessage,expectedverpriceMessage,"");
      //2.13 Verify the Message "The product has been added to your shopping cart"
      buildYourOwnComputer.clickOnAddToCart();
      Thread.sleep(2000);

      String actualshoppingMessage = buildYourOwnComputer.verifyTheShoppingCart();
      String expectedshoppingMessage = "The product has been added to your shopping cart";
      Assert.assertEquals(actualshoppingMessage,expectedshoppingMessage,"");
      buildYourOwnComputer.clickOnCloseButton();
      Thread.sleep(2000);
      shoppingCart.setMouseHoverShopping();

      shoppingCart.setClickOnCart();
      Thread.sleep(1000);
      String expectedshopcartMessage = "Shopping cart";
      Thread.sleep(1000);
      String actualMessage4 = shoppingCart.verifyProductaddedToShoppingCart();
      Assert.assertEquals(actualMessage4,expectedshopcartMessage,"");
      shoppingCart.clearTheQuantity();
      shoppingCart.setChangequantity("2");
      shoppingCart.setClickonUpdatecart();
      // 2.17 verify the total
      String expectedshoptotalMessage = "$2,950.00";
      String actualMessage5 = shoppingCart.verifyTheTotal();
      Assert.assertEquals(actualMessage5,expectedshoptotalMessage,"");
      shoppingCart.setClickOnterms();
      shoppingCart.setClickOnCheckOut();
     // verify the Welcome page
      String expectedwelcomeMessage = "Welcome, Please Sign In!";
      String actualMessage6 = welcomeCheckoutPage.verifyTheTextWelcome();

      Assert.assertEquals(actualMessage6,expectedwelcomeMessage,"");
   Thread.sleep(1000);
      welcomeCheckoutPage.setClickOnCheckoutAsGuest();
      billingPage.enterFirstName("sam");
      billingPage.enterLastName("Patil");
      billingPage.enterEmailAddress("samp@gmail.com");
      Thread.sleep(1000);
      billingPage.enterCountryName("France");
      billingPage.enterCityName("Mumbai");
      billingPage.enterAddress("chota gali");
      billingPage.enterZipcode("456789");
      billingPage.enterPhonenumber("075445566778");
      billingPage.setClickOnContinue();
      shippingMethod.setClickonNextDayair();
      shippingMethod.setClickOncontinue1();
      Thread.sleep(2000);
      paymentMethod.setClickOnCreditcard();
      Thread.sleep(2000);
      paymentMethod.setClickonContinue();
      Thread.sleep(2000);
      paymentInformation.setSelectCreditCard();
      paymentInformation.enterCardHolerName("sam");
      paymentInformation.enterCardNumber("5555555555554444");
      paymentInformation.enterExpiryMonth();
      paymentInformation.enterExpiryYear();
      paymentInformation.setCardcode("205");
      paymentInformation.setClickonContinue();
      confirmOrder.paymentconfirm();
      String expectedMessage9 = "$2,950.00";
      String actualMessage9 = confirmOrder.paymentconfirm();
      Assert.assertEquals(actualMessage9,expectedMessage9,"");
      confirmOrder.clickOnConfirmButton();
      String expecteMessage10 = "Thank you";
      String actualMessage10 = thankYou.verifyTheText();
      Assert.assertEquals(actualMessage10,expecteMessage10,"");
      String expectedMessage11 = "Your order has been successfully processed!";
      String actualMessage11 = thankYou.verifyTheSuccessfulMessage();
      Assert.assertEquals(actualMessage11,expectedMessage11,"");













  }

}