package com.sysco.java_ui_automation.tests;


import com.sysco.java_ui_automation.data.LoginData;
import com.sysco.java_ui_automation.functions.Login;
import com.sysco.java_ui_automation.functions.Welcome;
import com.sysco.java_ui_automation.pages.WelcomePage;
import com.sysco.java_ui_automation.utils.ExcelUtil;
import com.sysco.java_ui_automation.utils.TestBase;
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
//    @Test(priority = 1)
//    public void testLogin() throws Exception
//    {
//        //UI Automation  sample
//        Login.loadLoginPage();
//    }

    @Test
    public void testInvalidDateOfBirth() throws InterruptedException
    {
//        Login.loadLoginPage();
        SoftAssert softAssert = new SoftAssert();
        Welcome.selectInvalidDateOfBirth();
        softAssert.assertTrue(Welcome.verifyTheErrorMessage());
        softAssert.assertAll();
    }

//    @Test(priority = 3)
//    public void testValidDateOfBirth() throws InterruptedException
//    {
//        SoftAssert softAssert = new SoftAssert();
//        welcomePage.selectValidDate();
//        welcomePage.selectValidMonth();
//        welcomePage.selectValidYear();
//        welcomePage.clickConfirmButton();
//        softAssert.assertTrue(welcomePage.getIcon());
//    }
}