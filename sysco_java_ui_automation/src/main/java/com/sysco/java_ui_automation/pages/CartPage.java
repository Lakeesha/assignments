package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage
{
    protected static SyscoLabUI syscoLabUIOgm;

    WebDriver driver;

    public WebElement cart_Option = driver.findElement(By.id("cartHeader"));

}
