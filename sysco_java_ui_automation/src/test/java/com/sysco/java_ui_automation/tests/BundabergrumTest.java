package com.sysco.java_ui_automation.tests;

import com.sysco.java_ui_automation.functions.Cart;
import com.sysco.java_ui_automation.functions.Login;
import com.sysco.java_ui_automation.functions.MyAccount;
import com.sysco.java_ui_automation.functions.Welcome;
import com.sysco.java_ui_automation.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sun.awt.geom.AreaOp;


public class BundabergrumTest extends TestBase
{
    @BeforeClass
    public void init(ITestContext iTestContext)
    {
        iTestContext.setAttribute("feature", "Bundabergrum - Checkout");
    }

    @BeforeTest
    public void beforeTest()
    {
        Login.loadLoginPage();
    }

    @Test
    public void testInvalidDateOfBirth() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectInvalidDateOfBirth();
        softAssert.assertTrue(Welcome.verifyTheErrorMessage(), "Verified the Invalid Date Of Birth");
        softAssert.assertAll();
    }

    @Test
    public void testValidDateOfBirth() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectValidDateOfBirth();
        softAssert.assertTrue(MyAccount.verifyToMyAccount(),"Verified the Welcome Page with a valid Date of Birth");
        softAssert.assertAll();
    }

    @Test
    public void testMyAccountPage() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectValidDateOfBirth();
        softAssert.assertTrue(MyAccount.verifyToMyAccount(),"Verified the navigation to the My Account");
        softAssert.assertTrue(MyAccount.verifyEmailField(),"Verified the visibility of the Email Field");
        softAssert.assertTrue(MyAccount.verifyPasswordField(),"Verified the visibility of the Password Field");
        softAssert.assertTrue(MyAccount.verifyLoginButton(),"Verified the visibility of the Login Button");
        softAssert.assertAll();
    }

    @Test
    public void testLoginWithNullPassword() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectValidDateOfBirth();
        MyAccount.enterNullPassword("abc@gmail.com","Verified the password with Null Value");
        softAssert.assertTrue(MyAccount.verifyNullPassword());
        softAssert.assertAll();
    }

    @Test
    public void testLoginWithNullEmail() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectValidDateOfBirth();
        MyAccount.enterNullEmail(" ","12345678");
        softAssert.assertTrue(MyAccount.verifyNullEmail(),"Verified the Login with Null Value");
        softAssert.assertAll();
    }

    @Test
    public void testLoginToMyAccount() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectValidDateOfBirth();
        MyAccount.enterValidLoginDetails();
        softAssert.assertTrue(MyAccount.verifyValidLogin(),"Verified the Login with valid Credentials");
        softAssert.assertAll();
    }

    @Test
    public void testIfItemsExistInTheCard() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        testLoginToMyAccount();
        Cart.navigateToCart();
        softAssert.assertTrue(Cart.checkExistingItemsInTheCart(),"Verified that the Items exist in the Cart");
        softAssert.assertAll();
    }

    @Test
    public void testremoveItemsInTheCart() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        testLoginToMyAccount();
        Cart.navigateToCart();
        Cart.removeItemsInTheCart();
        softAssert.assertFalse(Cart.checkExistingItemsInTheCart(),"Verified that the Items does not exist in the Cart");
        softAssert.assertAll();
    }

    @Test
    public void testAddItemToCart() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        testLoginToMyAccount();
        Cart.navigateToProducts();
        Cart.selectItemsToCart();
        Cart.addItemToCart();
        softAssert.assertTrue(Cart.checkExistingItemsInTheCart(),"Verified the Add to Cart Option and successfully added the item to the cart");
    }


}