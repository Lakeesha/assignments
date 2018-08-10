package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage
{
    protected static SyscoLabUI syscoLabUIOgm;

    private By cart_Option = By.id("cartHeader");
    private By remove_link = By.id("@id=\"cartheader-item-313599");
    private By products = By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/ul[1]/li[1]/a");
    private By exclusive_range = By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/div[4]/div[1]/div[1]/ul/li/ul/li[1]/a");
    private By royal_liqueur_salted_caramel = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[4]/div/ul/div/div/li[1]/div[1]/a/img");
    private By NumberOfItemsInCart = By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[5]/ul/li[2]/ul/li[3]/div/div[1]/span[2]");
    private By addToCartOption = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/form/div[2]/div[2]/div/div/div[3]/div[1]/div[2]/div/div[2]/button");
    private By itemPrice = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/form/div[2]/div[2]/div/div/div[3]/div[1]/div[1]/span/span");
    private By itemName = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/form/div[2]/div[2]/div/div/div[1]/h1");


    public void selectCartOption()
    {
        syscoLabUIOgm.click(cart_Option);
    }

    public void removeCartItems()
    {
        syscoLabUIOgm.click(remove_link);
    }

    public void navigateToProducts()
    {
        syscoLabUIOgm.click(products);
    }

    public void selectExclusiveRange()
    {
        syscoLabUIOgm.click(exclusive_range);
    }

    public void selectItem()
    {
        syscoLabUIOgm.click(royal_liqueur_salted_caramel);
    }

    public int numberOfItemsInCart()
    {
        return Integer.parseInt(syscoLabUIOgm.getText(NumberOfItemsInCart));
    }

    public void setAddToCartOption()
    {
        syscoLabUIOgm.click(addToCartOption);
    }

    public String getItemPrice()
    {
       String price = syscoLabUIOgm.getText(itemPrice);
       return price;
    }

    public String getItemName()
    {
        String name = syscoLabUIOgm.getText(itemName);
        return name;
    }

}
