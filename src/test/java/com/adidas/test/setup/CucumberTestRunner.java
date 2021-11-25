package com.adidas.test.setup;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.adidas.test.steps"},
        plugin = {"pretty", // Cucumber report formats and location to store them in phone
                "html:target/CucumberReports/cucumber-html-report",
                "json:target/CucumberReports/cucumber.json",
                "junit:target/CucumberReports/cucumber.xml"
        }
)
public class CucumberTestRunner { }