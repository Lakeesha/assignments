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
        cartPage.selectItem();
    }

    public static void addItemToCart()
    {
        cartPage.setAddToCartOption();
    }
}
