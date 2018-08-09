package com.sysco.java_ui_automation.tests;

import com.sysco.java_ui_automation.functions.Login;
import com.sysco.java_ui_automation.functions.Welcome;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WelcomeTest
{
    @BeforeClass
    public void init(ITestContext iTestContext)
    {
        iTestContext.setAttribute("feature", "Welcome - Verify the Date of Birth");
        Login login = new Login();
        login.loadLoginPage();
    }

//    @Test
//    public void a_testInvalidDateOfBirth() throws InterruptedException
//    {
//        Welcome welcome = new Welcome();
//        welcome.selectInvalidDate();
//        welcome.selectInvalidMonth();
//        welcome.selectInvalidYear();
//        welcome.clickConfirmButton();
//        Assert.assertEquals(welcome.getInvalidErrorMessage(),welcome.setAgeInvalidMessage());
//    }
//
//    @Test
//    public void b_testValidDateOfBirth() throws InterruptedException
//    {
//        Welcome welcome = new Welcome();
//        welcome.selectValidDate();
//        welcome.selectValidMonth();
//        welcome.selectValidYear();
//        welcome.clickConfirmButton();
//        Assert.assertTrue(welcome.getIcon().isDisplayed());
//    }
}
