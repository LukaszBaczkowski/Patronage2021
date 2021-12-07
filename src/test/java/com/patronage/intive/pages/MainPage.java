package com.patronage.intive.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    /* Beginner TIP: Every newly created Page MUST extend BasePage */

    /* For purpose of the test exercise I assume that
    https://demoqa.com/ and https://demoqa.com/{menu}
    is one MainPage.

    Every expanded menu element (so content on the right)
    is one sub-page for example RadioButton menu content is sub-page.
    **/

    private static final String GOOGLE_URL = "https://demoqa.com";

    @FindBy(how = How.CLASS_NAME, using = "banner-image")
    WebElement mainBanner;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Elements')]")
    WebElement elementsSection;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Widgets')]")
    WebElement widgetsSection;


    @FindBy(how = How.CSS, using = "#item-2")
    WebElement radioButtonTab;
    @FindBy(how = How.CSS, using = "#item-5")
    WebElement linksTab;
    @FindBy(how = How.CSS, using = "#item-5")
    WebElement tabsTab;

    public void openDemoQA() {
        driver.get(GOOGLE_URL);
    }

    public void waitUntilPageOpen() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(mainBanner));
    }

    public void selectElementsSection() {
        // Scroll down for stability, but there are much better ways to do it  :)
        ((JavascriptExecutor)driver).executeScript("scroll(0, 250);");
        elementsSection.click();
    }
    public void selectWidgetsSection() {

        ((JavascriptExecutor)driver).executeScript("scroll(0, 250);");
        widgetsSection.click();
    }


    public void selectRadioButtonMenuItem() {
        radioButtonTab.click();
    }

    public void selectLinksMenuItem() {

        linksTab.click();
    }
    public void selectTabsMenuItem() {

        tabsTab.click();
    }
}
