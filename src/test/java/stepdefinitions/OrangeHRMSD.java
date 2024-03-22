package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.OrangePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMSD {
    OrangePage op = new OrangePage();

    @Given("kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("orangeUrl"));
    }

    @And("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String arg0) {
        op.username.sendKeys(arg0);
    }

    @And("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
        op.password.sendKeys(arg0);
    }

    @And("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        op.submitButton.click();
    }

    @And("scenario fail olur")
    public void scenarioFailOlur() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse(op.text.getText().contains("Invalid credentials"));
    }

    @When("kullanici credentiallari girer")
    public void kullaniciCredentiallariGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> adminCredentials = dataTable.asMaps();
        for(Map<String, String> each : adminCredentials){
            op.username.sendKeys(each.get("username"));
            op.password.sendKeys(each.get("password"));
            op.submitButton.click();
            System.out.println(each);

        }
        Thread.sleep(2000);
    }

    @When("kullanici invalid credentiallari girer")
    public void kullaniciInvalidCredentiallariGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> invalidCredentials = dataTable.asMaps();
        for (int i = 0; i < invalidCredentials.size(); i++) {
            op.username.sendKeys(invalidCredentials.get(i).get("username"));
            op.password.sendKeys(invalidCredentials.get(i).get("password"));
            op.submitButton.click();
            System.out.println(invalidCredentials.get(i));

            Assert.assertTrue(op.text.getText().contains(invalidCredentials.get(i).get("error_message")));
            Thread.sleep(2000);
        }
    }
}
