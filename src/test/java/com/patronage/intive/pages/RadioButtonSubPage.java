//package com.patronage.intive.pages;
//
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//
//public class RadioButtonSubPage extends BasePage {
//
//    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Yes')]")
//    WebElement radioButtonYes;
//
//    @FindBy(how = How.XPATH, using = "//p[@class='mt-3']")
//    WebElement confirmRadioButtonMessage;
//
//
//    public void selectRadioButtonYes() {
//        radioButtonYes.click();
//    }
//
//    public String getRadioButtonConfirmationMessage() {
//        return confirmRadioButtonMessage.getText();
//    }
//
//
//}
