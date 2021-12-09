package com.patronage.intive.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubPage extends BasePage{

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Created')]")
    WebElement LinkCreated;

    @FindBy(how = How.ID, using = "linkResponse")
    WebElement confirmCreatedLinkMessage;

    @FindBy(how = How.ID, using = "demo-tab-origin")
    WebElement OriginTab;

    @FindBy(how = How.ID, using = "demo-tabpane-origin")
    WebElement confirmOriginTabText;

    public void selectLinkCreated() {
        ((JavascriptExecutor)driver).executeScript("scroll(0, -250);");
        LinkCreated.click();
    }

    public String getCreatedLinkConfirmationMessage() {

        return confirmCreatedLinkMessage.getText();
    }

    public void selectOriginTab() {

        OriginTab.click();
    }

    public String getOriginTabText() {

        return confirmOriginTabText.getText();
    }


}
