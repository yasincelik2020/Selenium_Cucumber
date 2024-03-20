package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ContactLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Mentor01SD {
    ContactLoginPage clp = new ContactLoginPage();

    @Given("go to the home page")
    public void goToTheHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("contactUrl"));
    }

    @And("enter invalid password")
    public void enterInvalidPassword() {
        clp.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("click submit button")
    public void clickSubmitButton() {
        clp.submitButton.click();
    }

    @Then("verify incorrect message")
    public void verifyIncorrectMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(clp.errorMessage.isDisplayed());
    }

    @And("close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @When("enter invalid email")
    public void enterInvalidEmail() {
        clp.loginEmail();
    }

    @When("enter valid email")
    public void enterValidEmail() {
        clp.email.sendKeys(ConfigReader.getProperty("c_username"));
    }

    @When("enter valid password")
    public void enterValidPassword() {
        clp.password.sendKeys(ConfigReader.getProperty("c_password"));
    }

    @Then("verify correct message")
    public void verifyCorrectMessage() {
        Assert.assertTrue(clp.verifyText.getText().contains("Contact List"));
    }
}
