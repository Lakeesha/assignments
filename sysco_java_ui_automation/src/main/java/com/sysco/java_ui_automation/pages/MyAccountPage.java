package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage
{
    protected static SyscoLabUI syscoLabUIOgm;

    private By myAccountLink = By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[5]/ul/li[1]/ul/li[2]/ul/li/a");
    private By verifyThePage = By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/form/div/div/div[1]/h3");
    private String verifyThePageMEssage = "";
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("send2");
    private By verifyLogin = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2");
//    public String enterEmail = "williamjacob802@gmail.com ";
//    public String enterPassword = "12345678";
//    public WebElement verifyLogin = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2"));
//    public String userName= "William Jacob";


}
