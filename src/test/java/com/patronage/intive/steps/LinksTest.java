package com.patronage.intive.steps;

import com.patronage.intive.pages.LinksSubPage;
import com.patronage.intive.pages.MainPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LinksTest {


    MainPage mainPage = new MainPage();

    LinksSubPage linksSubPage = new LinksSubPage();



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
        linksSubPage.selectLinkCreated();
    }

    @Then("{string} message should be visible")
    public void messageShouldVisible(String textMessage) {
        Assert.assertEquals(linksSubPage.getCreatedLinkConfirmationMessage(), textMessage);
    }
}
