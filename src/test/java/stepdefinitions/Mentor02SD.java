package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ContactLoginPage;
import pages.ContactLoginPage2;
import utilities.ConfigReader;
import utilities.Driver;

public class Mentor02SD {
    ContactLoginPage2 clp2 = new ContactLoginPage2();

    @And("click sign in button")
    public void clickSignInButton() {
        clp2.signupButton.click();
    }

    @When("login and click")
    public void loginAndClick() {
        clp2.signIN();
    }

    @Then("see new Page and verify")
    public void seeNewPageAndVerify() {

    }


    @When("name and surname entered")
    public void nameAndSurnameEntered() {
        clp2.firstName.sendKeys(ConfigReader.getProperty("contactname"));
        clp2.lastName.sendKeys(ConfigReader.getProperty("contactsurname"));
        clp2.submitButton.click();
    }

    @Given("click add contact button")
    public void clickAddContactButton() {
        clp2.addContact.click();
    }

    @Then("see name and verify")
    public void seeNameAndVerify() {
        Assert.assertTrue(clp2.contactInfo.getText().contains(ConfigReader.getProperty("contactname")));
    }

    ContactLoginPage clp = new ContactLoginPage();

    @And("enter email and password and click")
    public void enterEmailAndPasswordAndClick() {
        clp.email.sendKeys(ConfigReader.getProperty("contactemail"));
        clp.password.sendKeys(ConfigReader.getProperty("contactpassword"));
        clp2.submitButton.click();
    }


    @When("enter valid a {word}")
    public void enterValidAEmail(String email) {
        clp.email.sendKeys(email);
    }

    @And("enter valid an {word}")
    public void enterValidAnPassword(String password) {
        clp.password.sendKeys(password);
    }
}
