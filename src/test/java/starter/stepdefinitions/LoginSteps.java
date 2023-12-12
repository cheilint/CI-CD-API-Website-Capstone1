package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;



    @Given("I set POST api endpoints login")
    public void setPostApiEndpointsLogin() {
        loginPage.setPostApiEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        loginPage.sendPostHttpRequestLogin();
    }

    @Then("I receive valid HTTP response code 200 login")
    public void receiveValidHttp200Login() {
        loginPage.receiveValidHttp200Login();
    }

    //Negative


    @When("I send POST HTTP request loginNeg1")
    public void sendPostHttpRequestloginNeg1() {
        loginPage.sendPostHttpRequestloginNeg1();
    }

    @When("I send POST HTTP request loginNeg2")
    public void sendPostHttpRequestloginNeg2() {
        loginPage.sendPostHttpRequestloginNeg2();
    }

    @When("I send POST HTTP request loginNeg3")
    public void sendPostHttpRequestloginNeg3() {
        loginPage.sendPostHttpRequestloginNeg3();
    }

    @When("I send POST HTTP request loginNeg4")
    public void sendPostHttpRequestloginNeg4() {
        loginPage.sendPostHttpRequestLoginNeg4();
    }

    @When("I send POST HTTP request loginNeg5")
    public void sendPostHttpRequestloginNeg5() {
        loginPage.sendPostHttpRequestLoginNeg5();
    }

    @When("I send POST HTTP request loginNeg6")
    public void sendPostHttpRequestloginNeg6() {
        loginPage.sendPostHttpRequestLoginNeg6();
    }


    @Then("I receive valid HTTP response code 404 login")
    public void receiveValidHttp404Login() {
        loginPage.receiveValidHttp404Login();
    }

    @Then("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Login() {
        loginPage.receiveValidHttp400Login();
    }
}
