package com.patronage.intive.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LinksSubPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Created')]")
    WebElement LinkCreated;

    @FindBy(how = How.ID, using = "linkResponse")
    WebElement confirmCreatedLinkMessage;

    public void selectLinkCreated() {

        LinkCreated.click();
    }

    public String getCreatedLinkConfirmationMessage() {

        return confirmCreatedLinkMessage.getText();
    }


}