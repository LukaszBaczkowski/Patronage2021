package com.patronage.intive;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.patronage.intive"

)
public class TestRunner {

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
    }


}
