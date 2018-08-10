package com.sysco.java_ui_automation.functions;

import com.sysco.java_ui_automation.common.Constants;
import com.sysco.java_ui_automation.pages.BasePage;
import com.sysco.java_ui_automation.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login  {

    public static BasePage ogmLoginPage = new BasePage();


    public static void loadLoginPage()
    {

        if (Constants.RUN_LOCALLY)
        {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmLoginPage.loadLoginPage(capabilities, Constants.APP_URL);
                    }
        else
            {
            ogmLoginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
        ogmLoginPage.stopLoad();
    }


    public static void quiteDriver() {
        ogmLoginPage.quitDriver();
    }

    public static void loginToFtr() {

    }
}
