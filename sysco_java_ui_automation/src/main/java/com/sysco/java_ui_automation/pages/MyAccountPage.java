package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

public class MyAccountPage extends BasePage
{
//    private By myAccountLink = By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[5]/ul/li[1]/ul/li[2]/ul/li/a[@title='My Account']");
    private By verifyThePage = By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/form/div/div/div[1]/h3");
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    private By verifyLogin = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2");
    private String enterEmail = "williamjacob802@gmail.com ";
    private String enterPassword = "12345678";
    private String userName= "William Jacob";
    private By passwordRequire = By.id("//*[@id=\"advice-required-entry-pass\"");
    private String RequireMessage = "This is a required field.";
    private By emailRequire = By.id("//*[@id=\"advice-required-entry-email\"]");


    public void navigateToMyAccount()
    {
       // syscoLabUIOgm.waitTillElementLoaded(myAccountLink,200);
//        syscoLabUIOgm.click(myAccountLink);
        syscoLabUIOgm.navigateTo("https://www.bundabergrum.com.au/customer/account");
    }

    public boolean verifyMyAccountPage()
    {
        return syscoLabUIOgm.getText(verifyThePage).equalsIgnoreCase("great to see you again!");
    }

    public boolean getEmailField()
    {
        return syscoLabUIOgm.isDisplayed(emailField);
    }

    public boolean getPasswordField()
    {
        return syscoLabUIOgm.isDisplayed(passwordField);
    }

    public boolean getLoginButton()
    {
        return syscoLabUIOgm.isDisplayed(loginButton);
    }

    public void setEmail(String value)
    {
        syscoLabUIOgm.sendKeys(emailField,value);
    }

    public void setPassword(String value)
    {
        syscoLabUIOgm.sendKeys(passwordField,value);
    }

    public void clickLoginButton()
    {
        syscoLabUIOgm.click(loginButton);
    }

    public String emailValue()
    {
        return enterEmail;
    }

    public String passwordValue()
    {
        return enterPassword;
    }

    public String verifyLogin()
    {
        return syscoLabUIOgm.getText(verifyLogin);
    }

    public String myAccountUser()
    {
        return userName;
    }

    public String getNullPasswordMessage()
    {
        String message = syscoLabUIOgm.getText(passwordRequire);
        return message;
    }

    public String requireMessageValue()
    {
        String message = RequireMessage;
        return message;
    }

    public String getNullEmailMessage()
    {
        String message = syscoLabUIOgm.getText(emailRequire);
        return message;
    }

}
