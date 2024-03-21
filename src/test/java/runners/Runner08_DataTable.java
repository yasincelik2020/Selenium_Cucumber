package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // buraya feature file'in CONTENT ROOT'u yazilir.
        glue = {"stepdefinitions","hooks"},//buraya stepdefinitions package'inin SOURCE ROOT'u yazilir.
        tags = "@invalidCredentials"
//        dryRun = true
)

public class Runner08_DataTable extends AbstractTestNGCucumberTests {
}
