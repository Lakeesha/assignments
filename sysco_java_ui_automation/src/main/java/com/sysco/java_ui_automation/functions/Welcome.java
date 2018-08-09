package com.sysco.java_ui_automation.functions;

import com.sysco.java_ui_automation.pages.WelcomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Welcome
{
    public static WelcomePage welcomePage = new WelcomePage();

    public static void selectInvalidDateOfBirth() throws InterruptedException
    {
        welcomePage.selectInvalidDate();
        welcomePage.selectInvalidMonth();
        welcomePage.selectInvalidYear();
        welcomePage.clickConfirmButton();
    }

    public static boolean verifyTheErrorMessage()
    {
        if (welcomePage.getInvalidErrorMessage().equals(welcomePage.setAgeInvalidMessage()))
        {
            return true;
        }
        return false;
    }


}

