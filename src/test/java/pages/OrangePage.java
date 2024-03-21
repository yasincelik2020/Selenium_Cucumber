package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangePage {
    public OrangePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy (xpath = "//input[@placeholder='Password']")
    public  WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Invalid credentials']")
    public WebElement text;
}
