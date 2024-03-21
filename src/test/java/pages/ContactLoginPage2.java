package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class ContactLoginPage2 {
    public ContactLoginPage2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signup")
    public WebElement signupButton;

    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "email")
    public WebElement emailsinged;
    @FindBy(id = "password")
    public WebElement passwordsinged;

    @FindBy(id = "submit")
    public WebElement submitButton;

    public void  signIN(){
        firstName.sendKeys(ConfigReader.getProperty("contactname"));
        lastName.sendKeys(ConfigReader.getProperty("contactsurname"));
        emailsinged.sendKeys(ConfigReader.getProperty("contactemail"));
        passwordsinged.sendKeys(ConfigReader.getProperty("contactpassword"));
        submitButton.click();
    }

    @FindBy(id = "add-contact")
    public WebElement addContact;

    @FindBy(xpath = "//table/tr/td[2]")
    public WebElement contactInfo;

}
