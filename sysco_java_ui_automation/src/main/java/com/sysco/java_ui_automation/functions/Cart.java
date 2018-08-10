package com.sysco.java_ui_automation.functions;

import com.sysco.java_ui_automation.pages.CartPage;

public class Cart
{
    public static CartPage cartPage = new CartPage();

    public static void navigateToCart()
    {
        cartPage.selectCartOption();
    }

    public static boolean checkExistingItemsInTheCart()
    {
        if(cartPage.numberOfItemsInCart()>0)
        {
            return true;
        }
        return false;
    }

    public static void removeItemsInTheCart()
    {
        cartPage.selectCartOption();
        cartPage.removeCartItems();
    }

    public static void navigateToProducts()
    {
        cartPage.navigateToProducts();
    }

    public static void selectItemsToCart()
    {
        cartPage.selectExclusiveRange();
        cartPage.setExclusive();
        cartPage.selectItem();
    }

    public static void addItemToCart()
    {
        cartPage.setAddToCartOption();
    }

    public static boolean verifyTheItemName()
    {
        if(cartPage.getItemName().equalsIgnoreCase("Bundaberg Royal Liqueur Salted Caramel  ..."))
        {
            return true;
        }
        return false;

    }

    public static String cartitem()
    {
        return cartPage.getItemName();
    }

    public static boolean verifyTheItemPrice()
    {
        if(cartPage.getItemPrice().equalsIgnoreCase("$49.99"))
        {
            return true;
        }
        return false;
    }

    public static boolean verifyTheFirstName()
    {
        cartPage.setProceedToCheckOut();
        if(cartPage.setBillingFirstName().equalsIgnoreCase("william"))
        {
            return true;
        }
        return false;
    }

    public static boolean verifyTheLastName()
    {
        cartPage.setProceedToCheckOut();
        if(cartPage.setBillingLastName().equalsIgnoreCase("jacob"))
        {
            return true;
        }
        return false;
    }

    public static void setBillingFieldsTONullAndVerify()
    {
        cartPage.setProceedToCheckOut();
        cartPage.setBillingFirstNameNull();
        cartPage.setBillingLastNameNull();
        cartPage.setBillingStreetAddressNull();
        cartPage.setBillingStreetAddress2Null();
        cartPage.setBillingPostalCodeNull();
        cartPage.setBillingTelephoneNull();
        cartPage.setContinueCheckoutButton();
    }


}
