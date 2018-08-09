package com.sysco.java_ui_automation.tests;

import com.sysco.java_ui_automation.functions.Login;
import com.sysco.java_ui_automation.functions.MyAccount;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyAccountTest
{


    @BeforeClass
    public void init(ITestContext iTestContext)
    {
        iTestContext.setAttribute("feature", "My Account - Verify the My Account Page");
        Login login = new Login();
        login.loadLoginPage();
    }

//    @Test
//    public void a_testMyAccountPage()
//    {
//        MyAccount myAccount = new MyAccount();
//        myAccount.navigateToMyAccount();
//        Assert.assertTrue(myAccount.verifyMyAccountPage().isDisplayed());
//    }
//
//    @Test
//    public void b_testVisibilityOfEmailField()
//    {
//        MyAccount myAccount = new MyAccount();
//        a_testMyAccountPage();
//        Assert.assertTrue(myAccount.getEmailField().isDisplayed());
//    }
//
//    @Test
//    public void c_testVisibilityOfPasswordField()
//    {
//        MyAccount myAccount = new MyAccount();
//        a_testMyAccountPage();
//        Assert.assertTrue(myAccount.getPasswordField().isDisplayed());
//    }
//
//    @Test
//    public void d_testVisibilityOfLoginButton()
//    {
//        MyAccount myAccount = new MyAccount();
//        a_testMyAccountPage();
//        Assert.assertTrue(myAccount.getLoginButton().isDisplayed());
//    }
//
//    @Test
//    public void e_testLoginToMyAccount()
//    {
//        MyAccount myAccount = new MyAccount();
//        a_testMyAccountPage();
//        myAccount.setEmail(myAccount.emailValue());
//        myAccount.setPassword(myAccount.passwordValue());
//        myAccount.clickLoginButton();
//
//        Assert.assertTrue(myAccount.verifyLogin().contains(myAccount.myAccountUser()));
//    }
}
