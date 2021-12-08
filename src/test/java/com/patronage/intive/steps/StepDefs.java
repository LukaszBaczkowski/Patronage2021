package com.patronage.intive.steps;

import com.patronage.intive.pages.SubPage;
import com.patronage.intive.pages.MainPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefs {


    MainPage mainPage = new MainPage();

   SubPage subPage = new SubPage();



    @Given("DemoQA site is open")
    public void demoqaSiteIsOpen() {
        mainPage.openDemoQA();
        mainPage.waitUntilPageOpen();
    }

    @When("user select Element category")
    public void userSelectsElements() {
        mainPage.selectElementsSection();
    }


    @And("select Links tab")
    public void selectLinksButtonTab() {

        mainPage.selectLinksMenuItem();
    }

    @And("select created link")
    public void selectLinkCreated() {
        subPage.selectLinkCreated();
    }

    @Then("{string} message should be visible")
    public void messageShouldVisible(String textMessage) {
        Assert.assertEquals(subPage.getCreatedLinkConfirmationMessage(), textMessage);
    }
    @When("user select Widgets category")
    public void userSelectsWidgets() {
        mainPage.selectWidgetsSection();
    }


    @And("select Tabs tab")
    public void selectTabsTab() {

        mainPage.selectTabsMenuItem();
    }

//    @And("user click \"Origin tab\"")
//    public void selectOriginTab() {
//        tabsSubPage.selectOriginTab();
//    }

    @Then("{string} text should be visible")
    public void textShouldVisible(String textMessage) {
        Assert.assertEquals(subPage.getOriginTabText(), textMessage);

    }
}
