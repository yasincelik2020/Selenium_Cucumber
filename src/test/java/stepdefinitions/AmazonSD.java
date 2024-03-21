package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.amazonCaptcha;

public class AmazonSD {
    AmazonPage ap = new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonCaptcha(Driver.getDriver());
    }

    @When("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String str) { //kullanici_icin_arama_yapar(String str)
        ap.amazonSearchFor(str);
    }

    @Then("kullanici title da {string} gormelidir")
    public void kullaniciTitleDaGormelidir(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }
}
