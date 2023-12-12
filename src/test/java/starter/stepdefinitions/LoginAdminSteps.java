package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.LoginAdminPage;
import starter.java.LoginPage;

public class LoginAdminSteps {

    @Steps
    LoginAdminPage loginAdminPage;



    @Given("I set POST api endpoints loginAdmin")
    public void setPostApiEndpointsLoginAdmin() {
        loginAdminPage.setPostApiEndpointLoginAdmin();
    }

    @When("I send POST HTTP request loginAdmin")
    public void sendPostHttpRequestLoginAdmin() {
        loginAdminPage.sendPostHttpRequestLoginAdmin();
    }

    @Then("I receive valid HTTP response code 200 loginAdmin")
    public void receiveValidHttp200LoginAdmin() {
        loginAdminPage.receiveValidHttp200LoginAdmin();
    }

    //Negative


    @When("I send POST HTTP request loginAdminNeg1")
    public void sendPostHttpRequestloginAdminNeg1() {
        loginAdminPage.sendPostHttpRequestloginAdminNeg1();
    }

    @When("I send POST HTTP request loginAdminNeg2")
    public void sendPostHttpRequestloginAdminNeg2() {
        loginAdminPage.sendPostHttpRequestloginAdminNeg2();
    }

    @When("I send POST HTTP request loginAdminNeg3")
    public void sendPostHttpRequestloginAdminNeg3() {
        loginAdminPage.sendPostHttpRequestloginAdminNeg3();
    }

    @When("I send POST HTTP request loginAdminNeg4")
    public void sendPostHttpRequestloginAdminNeg4() {
        loginAdminPage.sendPostHttpRequestLoginAdminNeg4();
    }

    @When("I send POST HTTP request loginAdminNeg5")
    public void sendPostHttpRequestloginAdminNeg5() {
        loginAdminPage.sendPostHttpRequestLoginAdminNeg5();
    }

    @When("I send POST HTTP request loginAdminNeg6")
    public void sendPostHttpRequestloginAdminNeg6() {
        loginAdminPage.sendPostHttpRequestLoginAdminNeg6();
    }


    @Then("I receive valid HTTP response code 404 loginAdmin")
    public void receiveValidHttp404LoginAdmin() {
        loginAdminPage.receiveValidHttp404LoginAdmin();
    }

    @Then("I receive valid HTTP response code 400 loginAdmin")
    public void receiveValidHttp400LoginAdmin() {
        loginAdminPage.receiveValidHttp400LoginAdmin();
    }
}
