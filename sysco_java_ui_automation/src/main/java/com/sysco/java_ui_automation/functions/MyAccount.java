package com.sysco.java_ui_automation.functions;

import com.sysco.java_ui_automation.pages.MyAccountPage;
import org.openqa.selenium.WebElement;

public class MyAccount
{
    public static MyAccountPage myAccountPage = new MyAccountPage();

    public static boolean verifyToMyAccount()
    {
        myAccountPage.navigateToMyAccount();

        if(myAccountPage.verifyMyAccountPage())
        {
            return true;
        }
        return false;
    }

    public static boolean verifyEmailField()
    {
        if(myAccountPage.getEmailField())
        {
            return true;
        }
        return false;
    }

    public static boolean verifyPasswordField()
    {
        if(myAccountPage.getPasswordField())
        {
            return true;
        }
        return false;
    }

    public static boolean verifyLoginButton()
    {
        if(myAccountPage.getLoginButton())
        {
            return true;
        }
        return false;
    }

    public static void enterValidLoginDetails()
    {
        myAccountPage.setEmail(myAccountPage.emailValue());
        myAccountPage.setPassword(myAccountPage.passwordValue());
        myAccountPage.clickLoginButton();
    }

    public static boolean verifyValidLogin()
    {
        String username = "HELLO, "+myAccountPage.myAccountUser()+"!";
        if(myAccountPage.verifyLogin().equalsIgnoreCase(username))
        {
            return true;
        }
        return false;
    }

    public static void enterNullPassword(String username,String password)
    {
        myAccountPage.setEmail(username);
        myAccountPage.setPassword(password);
        myAccountPage.clickLoginButton();
    }

    public static void enterNullEmail(String username,String password)
    {
        myAccountPage.setEmail(username);
        myAccountPage.setPassword(password);
        myAccountPage.clickLoginButton();

    }

    public static boolean verifyNullPassword()
    {
        if(myAccountPage.setInvalidMessage())
        {
            return true;
        }
        return false;
    }

    public static boolean verifyNullEmail()
    {
        if(myAccountPage.setRequiredField())
        {
            return true;
        }
        return false;
    }

}
