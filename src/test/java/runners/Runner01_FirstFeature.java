package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // buraya feature file'in CONTENT ROOT'u yazilir.
        // Gherkin dilinde yazilmis senaryolari aliriz.
        glue = "stepdefinitions"//buraya stepdefinitions package'inin SOURCE ROOT'u yazilir.
        // Java kodlari olarak implement ettigimiz package
//        tags = "@background"
        // Run etmek istedigimiz tagin adi
//        dryRun = true
        // Testi test ediyor ve eksik step definition varsa onlari bize gosterir.
)

public class Runner01_FirstFeature extends AbstractTestNGCucumberTests {
}
