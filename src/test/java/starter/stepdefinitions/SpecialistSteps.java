package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.SpecialistPage;

public class SpecialistSteps {

    @Steps
    SpecialistPage specialistPage;

    @Given("I set GET api endpoints Specialists")
    public void ISetGETApiEndpointsSpecialists() {
        specialistPage.setGetApiEndpointSpecialists();
    }

    @When("I send GET HTTP request Specialists")
    public void sendGetHttpRequestSpecialists() {
        specialistPage.sendGetHttpRequestSpecialists();
    }

    @Then("I receive valid HTTP response code 200 Specialists")
    public void receiveValidHttp200Specialists() {
        specialistPage.receiveValidHttp200Specialists();
    }


    //Positive GET All Specialists invalid endpoint (Admin)
    @Given("I set GET api endpoints SpecialistsNeg1")
    public void ISetGETApiEndpointsSpecialistsNeg1() {
        specialistPage.setGetApiEndpointSpecialistsNeg1();
    }

    @When("I send GET HTTP request SpecialistsNeg1")
    public void sendGetHttpRequestSpecialistsNeg1() {
        specialistPage.sendGetHttpRequestSpecialistsNeg1();
    }

    @Then("I receive valid HTTP response code 404 SpecialistsNeg1")
    public void receiveValidHttp404SpecialistsNeg1() {
        specialistPage.receiveValidHttp404SpecialistsNeg1();
    }


    //POST new Specialists (Admin)
    @Given("I set POST api endpoints Specialists")
    public void setPostApiEndpointSpecialists() {
        specialistPage.setPostApiEndpointSpecialists();
    }

    @When("I send POST HTTP request Specialists")
    public void sendPostHttpRequestSpecialists() {
        specialistPage.sendPostHttpRequestSpecialists();
    }

    @Then("I receive valid HTTP response code 201 Specialists")
    public void receiveValidHttp201Specialists() {
        specialistPage.receiveValidHttp201Specialists();
    }


    //POST new Specialists invalid endpoint (Admin)
    @Given("I set POST api endpoints SpecialistsNeg1")
    public void setPostApiEndpointSpecialistsNeg1() {
        specialistPage.setPostApiEndpointSpecialistsNeg1();
    }

    @When("I send POST HTTP request SpecialistsNeg1")
    public void sendPostHttpRequestSpecialistsNeg1() {
        specialistPage.sendPostHttpRequestSpecialistsNeg1();
    }


    //PUT Specialists Data (Admin)
    @Given("I set PUT api endpoints Specialists")
    public void setPUTApiEndpointSpecialists() {
        specialistPage.setPUTApiEndpointSpecialists();
    }

    @When("I send PUT HTTP request Specialists")
    public void sendPUTHttpRequestSpecialists() {
        specialistPage.sendPUTHttpRequestSpecialists();
    }


    //PUT Specialists Data invalid endpoint (Admin)
    @Given("I set PUT api endpoints SpecialistsNeg1")
    public void setPUTApiEndpointSpecialistsNeg1() {
        specialistPage.setPUTApiEndpointSpecialistsNeg1();
    }

    @When("I send PUT HTTP request SpecialistsNeg1")
    public void sendPUTHttpRequestSpecialistsNeg1() {
        specialistPage.sendPUTHttpRequestSpecialistsNeg1();
    }

    //Positive DELETE Articles with ID
    @Given("I set DELETE api endpoints Specialists")
    public void setDELETEApiEndpointSpecialists() {
        specialistPage.setDELETEApiEndpointSpecialists();
    }

    @When("I send DELETE HTTP request Specialists")
    public void sendDELETEHTTPrequestSpecialists() {
        specialistPage.sendDELETEHTTPrequestSpecialists();
    }

    //Positive DELETE Articles with ID
    @Given("I set DELETE api endpoints SpecialistsNeg1")
    public void setDELETEApiEndpointSpecialistsNeg1() {
        specialistPage.setDELETEApiEndpointSpecialistsNeg1();
    }

    @When("I send DELETE HTTP request SpecialistsNeg1")
    public void sendDELETEHTTPrequestSpecialistsNeg1() {
        specialistPage.sendDELETEHTTPrequestSpecialistsNeg1();
    }
}
