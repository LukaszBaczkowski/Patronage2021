package com.patronage.intive.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {



    private static final String GOOGLE_URL = "https://demoqa.com";

    @FindBy(how = How.CLASS_NAME, using = "banner-image")
    WebElement mainBanner;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Elements')]")
    WebElement elementsSection;

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Widgets')]")
    WebElement widgetsSection;
    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Forms')]")
    WebElement formsSection;


    @FindBy(how = How.CSS, using = "#item-5")
    WebElement linksTab;

    @FindBy(how = How.XPATH, using = "//span[text()='Tabs']//parent::li[@id='item-5']")
    WebElement tabsTab;
    @FindBy(how = How.XPATH, using = "//span[text()='Practice Form']//parent::li[@id='item-0']")
    WebElement practiceformTab;


    public void openDemoQA() {
        driver.get(GOOGLE_URL);
    }

    public void waitUntilPageOpen() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(mainBanner));
    }

    public void selectElementsSection() {

        ((JavascriptExecutor)driver).executeScript("scroll(0, 250);");
        elementsSection.click();
    }
    public void selectWidgetsSection() {

        ((JavascriptExecutor)driver).executeScript("scroll(0, 250);");
        widgetsSection.click();
    }
    public void selectFormsSection() {
        ((JavascriptExecutor)driver).executeScript("scroll(0, 250);");
        formsSection.click();
    }

    public void selectLinksMenuItem() {
        ((JavascriptExecutor)driver).executeScript("scroll(0, 500);");
        linksTab.click();
    }
    public void selectTabsMenuItem() {
        ((JavascriptExecutor)driver).executeScript("scroll(0, 500);");
        tabsTab.click();
    }
    public void selectPracticeFormMenuItem() {
        ((JavascriptExecutor)driver).executeScript("scroll(0, 500);");
        practiceformTab.click();
    }
}
