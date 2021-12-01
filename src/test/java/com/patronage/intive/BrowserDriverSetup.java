package com.patronage.intive;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserDriverSetup {

    public static RemoteWebDriver DRIVER;

    public static void startDriver() {
        DRIVER = new ChromeDriver();
        DRIVER.manage().window().maximize();
    }

    public static void destroyDriver() {
        DRIVER.quit();
    }
}
