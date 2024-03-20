package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya feature file'in CONTENT ROOT'u yazilir.
        glue = "stepdefinitions",//buraya stepdefinitions package'inin SOURCE ROOT'u yazilir.
        tags = "@background"
//        dryRun = true
)

public class Runner03_Background extends AbstractTestNGCucumberTests {
}
