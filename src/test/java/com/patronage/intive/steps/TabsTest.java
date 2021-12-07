package com.patronage.intive.steps;

import com.patronage.intive.pages.TabsSubPage;
import com.patronage.intive.pages.MainPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TabsTest {


    MainPage mainPage = new MainPage();

    TabsSubPage tabsSubPage = new TabsSubPage();



    @Given("DemoQA site open")
    public void demoqaSiteIsOpen() {
        mainPage.openDemoQA();
        mainPage.waitUntilPageOpen();
    }

    @When("user select Widgets category")
    public void userSelectsWidgets() {
        mainPage.selectWidgetsSection();
    }


    @And("select Tabs tab")
    public void selectTabsTab() {

        mainPage.selectTabsMenuItem();
    }

    @And("user click \"Origin tab\"")
    public void selectOriginTab() {
        tabsSubPage.selectOriginTab();
    }

    @Then("{string} text should be visible")
    public void messageShouldVisible(String textMessage) {
        Assert.assertEquals(tabsSubPage.getOriginTabText(), textMessage);
    }
}
