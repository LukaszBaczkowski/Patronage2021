package com.patronage.intive.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TabsSubPage extends BasePage {

    @FindBy(how = How.ID, using = "demo-tab-origin")
    WebElement OriginTab;

    @FindBy(how = How.XPATH, using = "//p[@class='mt-3']")
    WebElement confirmOriginTabText;


    public void selectOriginTab() {

        OriginTab.click();
    }

    public String getOriginTabText() {

        return confirmOriginTabText.getText();
    }


}