package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya feature file'in CONTENT ROOT'u yazilir.
        glue = "stepdefinitions",//buraya stepdefinitions package'inin SOURCE ROOT'u yazilir.
        tags = "@firstFeature and not @java"
//        dryRun = true
)

public class Runner02_Tags extends AbstractTestNGCucumberTests {
}
