package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

import java.lang.ref.SoftReference;

public class WelcomePage extends BasePage
{
    private By ageSelectDate = By.id("age_select_day");
    private By ageSelectMonth = By.id("age_select_month");
    private By ageSelectYear = By.id("age_select_year");
    private By ageMissingMessage = By.id("age_missing_message");
    private By ageConfirmButton = By.id("age_confirm_btn");
    private String ageInvalidMessage = "Sorry, your age or location does not permit you to enter at this time.";
    private By verifyValidDate = By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/a[1]");
    private String welcomeMessage = "Welcome to Bundaberg";

    public void selectInvalidDate() throws InterruptedException
    {
        syscoLabUIOgm.waitTillElementLoaded(ageSelectDate,3000);
        syscoLabUIOgm.selectFromDropDown(ageSelectDate,"2");
    }

    public void selectInvalidMonth() throws InterruptedException
    {
        syscoLabUIOgm.selectFromDropDown(ageSelectMonth,"January");
    }

    public void selectInvalidYear() throws InterruptedException
    {
        syscoLabUIOgm.selectFromDropDown(ageSelectYear,"2003");
    }

    public void clickConfirmButton()
    {
        syscoLabUIOgm.click(ageConfirmButton);
    }

    public String getInvalidErrorMessage()
    {
        String message = syscoLabUIOgm.getText(ageMissingMessage);
        return message;
    }

    public String setAgeInvalidMessage()
    {
        return ageInvalidMessage;
    }

    public void selectValidDate() throws InterruptedException
    {
        syscoLabUIOgm.selectFromDropDown(ageSelectDate,"2");
    }

    public void selectValidMonth() throws InterruptedException
    {
        syscoLabUIOgm.selectFromDropDown(ageSelectMonth,"January");
    }

    public void selectValidYear() throws InterruptedException
    {
        syscoLabUIOgm.selectFromDropDown(ageSelectYear,"1993");
    }

    public String getIcon()
    {
        String message = syscoLabUIOgm.getText(verifyValidDate);
        return message;
    }

    public String getMessage()
    {
        return welcomeMessage;
    }


}