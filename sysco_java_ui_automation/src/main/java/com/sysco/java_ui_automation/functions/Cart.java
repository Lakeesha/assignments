package com.sysco.java_ui_automation.functions;

import com.sysco.java_ui_automation.pages.CartPage;

public class Cart
{
    public static CartPage cartPage = new CartPage();

    public static void removeExistingItemsInTheCart()
    {
        cartPage.selectCartOption();

    }
}
