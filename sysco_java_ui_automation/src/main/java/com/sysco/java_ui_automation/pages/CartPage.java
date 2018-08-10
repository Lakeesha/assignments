package com.sysco.java_ui_automation.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage
{
    private By cart_Option = By.id("cartHeader");
    private By remove_link = By.id("@id=\"cartheader-item-313599");
    private By products = By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div/div/ul[1]/li[1]/a");
    private By exclusive_range = By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[1]/a/img");
    private By exclusive = By.xpath("/html/body/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a/img");
    private By royal_liqueur_salted_caramel = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[4]/div/ul/div/div/li[1]/div[1]/a/img");
    private By NumberOfItemsInCart = By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[5]/ul/li[2]/ul/li[3]/div/div[1]/span[2]");
    private By addToCartOption = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/form/div[2]/div[2]/div/div/div[3]/div[1]/div[2]/div/div[2]/button");
    private By itemPrice = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/form/div[2]/div[2]/div/div/div[3]/div[1]/div[1]/span/span");
    private By itemName = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/form/div[2]/div[2]/div/div/div[1]/h1");
    private By cartItem = By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[5]/ul/li[2]/ul/li[3]/div/div[2]/div/ol/li/a/img");
    private By cartItemPrice = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/form/fieldset/div/div[2]/div/div/div[3]/div[5]/span/span");
    private By cartItemName = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/form/fieldset/div/div[2]/div/div/div[2]/h2/a");
    private By proceedToCheckOut = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[1]/div/ul/li[2]/button");
    private By billingFirstName = By.id("//*[@id=\"billing:firstname\"]");
    private By billingLastName = By.id("//*[@id=\"billing:lastname\"]");
    private By billingStreetAddress = By.id("//*[@id=\"billing:street1\"]");
    private By billingStreetAddress2 = By.id("//*[@id=\"billing:street2\"]");
    private By billingPostalCode = By.id("//*[@id=\"billing:postcodesuburb\"]");
    private By billingTelephone = By.id("//*[@id=\"billing:telephone\"]");
    private By continueCheckoutButton = By.id("//*[@id=\"delivery-address-button\"]");
    private By selectItemfromCart = By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[5]/ul/li[2]/ul/li[3]/div/div[2]/div/ol/li[1]/div/p/a");


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

    public String getCartItemPrice()
    {
        String price = syscoLabUIOgm.getText(cartItemPrice);
        return price;
    }

    public String getCartItemName()
    {
        String name = syscoLabUIOgm.getText(cartItemName);
        return name;
    }

    public void selectCartItem()
    {
        syscoLabUIOgm.click(cartItem);
    }

    public void setProceedToCheckOut()
    {
        syscoLabUIOgm.click(proceedToCheckOut);
    }

    public String setBillingFirstName()
    {
        return syscoLabUIOgm.getText(billingFirstName);
    }

    public String setBillingLastName()
    {
        return syscoLabUIOgm.getText(billingLastName);
    }

    public void setBillingFirstNameNull()
    {
        syscoLabUIOgm.sendKeys(billingFirstName," ");
    }

    public void setBillingLastNameNull()
    {
        syscoLabUIOgm.sendKeys(billingLastName," ");
    }

    public void setBillingStreetAddressNull()
    {
        syscoLabUIOgm.sendKeys(billingStreetAddress," ");
    }

    public void setBillingStreetAddress2Null()
    {
        syscoLabUIOgm.sendKeys(billingStreetAddress2," ");
    }

    public void setBillingPostalCodeNull()
    {
        syscoLabUIOgm.sendKeys(billingPostalCode," ");
    }

    public void setBillingTelephoneNull()
    {
        syscoLabUIOgm.sendKeys(billingTelephone," ");
    }

    public void setContinueCheckoutButton()
    {
        syscoLabUIOgm.click(continueCheckoutButton);
    }

    public void setExclusive()
    {
        syscoLabUIOgm.click(exclusive);
    }

    public void setSelectItemfromCart()
    {
        syscoLabUIOgm.click(selectItemfromCart);
    }

}
