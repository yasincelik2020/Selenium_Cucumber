package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DortIslemSD {
    int num1,num2,result;
    @Given("ilk sayi {int}")
    public void ilkSayiSayi(int arg0) {
        num1 = arg0;
    }

    @And("ikinci sayi {int}")
    public void ikinciSayiSayi(int arg0) {
        num2 = arg0;
    }

    @When("bu sayilar {word} operatorune girdiginde")
    public void buSayilarOperatorOperatoruneGirdiginde(String operator) {
        switch (operator) {
            case "+": result=num1+num2; break;
            case "-": result=num1-num2; break;
            case "*": result=num1*num2; break;
            case "/": result=num1/num2; break;
        }
    }

    @Then("sonuc {int} olmalidir")
    public void sonucSonucOlmalidir(int arg0) {
        Assert.assertEquals(arg0,result);
    }
}
