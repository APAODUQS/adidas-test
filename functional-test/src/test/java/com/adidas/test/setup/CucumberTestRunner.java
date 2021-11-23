package com.adidas.test.setup;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Cucumber setup. This class configure cucumber to start functional tests.
 * {@link CucumberOptions#features()} is the location of features.
 * {@link CucumberOptions#glue()} is the location of steps.
 *
 * @see CucumberOptions documentation here: https://cucumber.io/docs/cucumber/.
 */
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.adidas.test.steps"},
        plugin = {"pretty", // Cucumber report formats and location to store them in phone
                "html:target/CucumberReports/cucumber-html-report",
                "json:target/CucumberReports/cucumber.json",
                "junit:target/CucumberReports/cucumber.xml"
        }
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests { }