package com.patronage.intive.pages;

import com.patronage.intive.BrowserDriverSetup;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    /* Beginner TIP:  Base Page is the ruler of all Page Objects, all newly create page objects must inherit from him */

    public final RemoteWebDriver driver;

    /* The most important constructor in this whole setup */
    protected BasePage() {
        this.driver = BrowserDriverSetup.DRIVER;
        PageFactory.initElements(this.driver, this);
    }
}
