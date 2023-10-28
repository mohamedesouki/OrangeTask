package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/Features",
        glue = "stepDefinitions",

        plugin = {

                "html:target/cucumber.html",


        }
)
public class Runners extends AbstractTestNGCucumberTests {




}
