package com.sysco.java_ui_automation.tests;


import com.sysco.java_ui_automation.data.LoginData;
import com.sysco.java_ui_automation.functions.Login;
import com.sysco.java_ui_automation.functions.MyAccount;
import com.sysco.java_ui_automation.functions.Welcome;
import com.sysco.java_ui_automation.pages.WelcomePage;
import com.sysco.java_ui_automation.utils.ExcelUtil;
import com.sysco.java_ui_automation.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginTest extends TestBase
{
    @BeforeClass
    public void init(ITestContext iTestContext)
    {
        iTestContext.setAttribute("feature", "Java Wed UI Automation");
    }

    @BeforeTest
    public void beforeTest()
    {
        Login.loadLoginPage();
    }

    @Test(priority = 1)
    public void testInvalidDateOfBirth() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectInvalidDateOfBirth();
        softAssert.assertTrue(Welcome.verifyTheErrorMessage(), "Verified the Invalid Date Of Birth");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testValidDateOfBirth() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectValidDateOfBirth();
        softAssert.assertTrue(Welcome.verifyTheWelcomePage(),"Verified the Welcome Page with a valid Date of Birth");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void testMyAccountPage()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(MyAccount.verifyToMyAccount(),"Verified the navigation to the My Account");
        softAssert.assertTrue(MyAccount.verifyEmailField(),"Verified the visibility of the Email Field");
        softAssert.assertTrue(MyAccount.verifyPasswordField(),"Verified the visibility of the Password Field");
        softAssert.assertTrue(MyAccount.verifyLoginButton(),"Verified the visibility of the Login Button");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void testLoginWithNullPassword()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAccount.enterNullPassword("abc@gmail.com","Verified the password with Null Value");
        softAssert.assertTrue(MyAccount.verifyNullPassword());
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void testLoginWithNullEmail()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAccount.enterNullEmail(" ","12345678");
        softAssert.assertTrue(MyAccount.verifyNullEmail(),"Verified the Login with Null Value");
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void testLoginToMyAccount()
    {
        SoftAssert softAssert = new SoftAssert();
        MyAccount.enterValidLoginDetails();
        softAssert.assertTrue(MyAccount.verifyValidLogin(),"Verified the Login with valid Credentials");
        softAssert.assertAll();
    }
}