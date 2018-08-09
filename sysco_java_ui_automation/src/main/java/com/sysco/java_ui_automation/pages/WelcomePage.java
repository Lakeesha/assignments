package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage
{
    protected static SyscoLabUI syscoLabUIOgmWelcome;

    private By ageSelectDate = By.id("age_select_day");
    private By selectInvalidDate = By.xpath("//*[@id=\"age_select_day\"]//option[2]");
    private By ageSelectMonth = By.id("age_select_month");
    private By selectInvalidMonth = By.xpath("//*[@id=\"age_select_month\"]//option[2]");
    private By ageSelectYear = By.id("age_select_year");
    private By selectInvalidYear = By.xpath("//*[@id=\"age_select_year\"]//option[2]");
    private By ageMissingMessage = By.id("age_missing_message");
    private By ageConfirmButton = By.id("age_confirm_btn");
    private String ageInvalidMessage = "Sorry, your age or location does not permit you to enter at this time.";
    private By selectValidDate = By.xpath("//*[@id=\"age_select_day\"]//option[2]");
    private By selectValidMonth = By.xpath("//*[@id=\"age_select_month\"]//option[2]");
    private By selectValidYear = By.xpath("//*[@id=\"age_select_year\"]//option[2]");
    private By verifyValidDate = By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/a[1]/img");

    public void selectInvalidDate() throws InterruptedException
    {
        syscoLabUIOgmWelcome.waitTillElementLoaded(ageSelectDate,3000);
        syscoLabUIOgmWelcome.click(ageSelectDate);
        syscoLabUIOgmWelcome.waitTillElementLoaded(selectInvalidDate,3000);
        syscoLabUIOgmWelcome.click(selectInvalidDate);
    }

    public void selectInvalidMonth() throws InterruptedException
    {
        syscoLabUIOgmWelcome.click(ageSelectMonth);
        syscoLabUIOgmWelcome.click(selectInvalidMonth);
    }

    public void selectInvalidYear() throws InterruptedException
    {
        syscoLabUIOgmWelcome.click(ageSelectYear);
        wait();
        syscoLabUIOgmWelcome.click(selectInvalidYear);
    }

    public void clickConfirmButton()
    {
        syscoLabUIOgmWelcome.click(ageConfirmButton);
    }

    public By getInvalidErrorMessage()
    {
        return ageMissingMessage;
    }

    public String setAgeInvalidMessage()
    {
        return ageInvalidMessage;
    }

    public void selectValidDate() throws InterruptedException
    {
        syscoLabUIOgmWelcome.click(ageSelectDate);
        wait();
        syscoLabUIOgmWelcome.click(selectValidDate);
    }

    public void selectValidMonth() throws InterruptedException
    {
        syscoLabUIOgmWelcome.click(ageMissingMessage);
        wait();
        syscoLabUIOgmWelcome.click(selectValidMonth);
    }

    public void selectValidYear() throws InterruptedException
    {
        syscoLabUIOgmWelcome.click(ageSelectYear);
        wait();
        syscoLabUIOgmWelcome.click(selectValidYear);
    }

    public boolean getIcon()
    {
        return syscoLabUIOgmWelcome.isDisplayed(verifyValidDate);
    }
}