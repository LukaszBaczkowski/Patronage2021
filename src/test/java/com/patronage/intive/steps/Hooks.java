package com.patronage.intive.steps;

import com.patronage.intive.BrowserDriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario() {
        BrowserDriverSetup.startDriver();
    }

    @After
    public void afterScenario() {
        BrowserDriverSetup.destroyDriver();
    }
}
