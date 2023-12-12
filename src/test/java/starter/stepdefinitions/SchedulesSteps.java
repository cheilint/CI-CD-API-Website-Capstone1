package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.SchedulesPage;

public class SchedulesSteps {

    @Steps
    SchedulesPage schedulesPage;

    @Given("I set GET api endpoints Schedules")
    public void ISetGETApiEndpointSchedules() {
        schedulesPage.setGetApiEndpointSchedules();
    }

    @When("I send GET HTTP request Schedules")
    public void sendGetHttpRequestSchedules() {
        schedulesPage.sendGetHttpRequestSchedules();
    }

    @Then("I receive valid HTTP response code 200 Schedules")
    public void receiveValidHttp200Schedules() {
        schedulesPage.receiveValidHttp200Schedules();
    }


    //Negative GET all Schedules invalid endpoint
    @Given("I set GET api endpoints SchedulesNeg1")
    public void ISetGETApiEndpointSchedulesNeg1() {
        schedulesPage.setGetApiEndpointSchedulesNeg1();
    }

    @When("I send GET HTTP request SchedulesNeg1")
    public void sendGetHttpRequestSchedulesNeg1() {
        schedulesPage.sendGetHttpRequestSchedulesNeg1();
    }

    @Then("I receive valid HTTP response code 400 SchedulesNeg1")
    public void receiveValidHttp400SchedulesNeg1() {
        schedulesPage.receiveValidHttp400SchedulesNeg1();
    }


    //PUT Doctor Inactive
    @Given("I set PUT endpoints Doctor Inactive")
    public void setPUTApiEndpointDoctorInactive() {
        schedulesPage.setPUTApiEndpointDoctorInactive();
    }

    @When("I send PUT HTTP request Doctor Inactive")
    public void sendPUTHttpRequestDoctorInactive() {
        schedulesPage.sendPUTHttpRequestDoctorInactive();
    }

    @Then("I receive valid HTTP response code 200 Doctor Inactive")
    public void iReceiveValidHTTPResponseCode200DoctorInactive() {
        schedulesPage.iReceiveValidHTTPResponseCode200DoctorInactive();
    }

    //PUT Doctor Inactive Invalid endpoint
    @Given("I set PUT endpoints Doctor InactiveNeg1")
    public void setPUTApiEndpointDoctorInactiveNeg1() {
        schedulesPage.setPUTApiEndpointDoctorInactiveNeg1();
    }

    @When("I send PUT HTTP request Doctor InactiveNeg1")
    public void sendPUTHttpRequestDoctorInactiveNeg1() {
        schedulesPage.sendPUTHttpRequestDoctorInactiveNeg1();
    }

    @Then("I receive valid HTTP response code 404 Doctor")
    public void iReceiveValidHTTPResponseCode404Doctor() {
        schedulesPage.iReceiveValidHTTPResponseCode404Doctor();
    }



    //PUT Doctor Active
    @Given("I set PUT endpoints Doctor Active")
    public void setPUTApiEndpointDoctorActive() {
        schedulesPage.setPUTApiEndpointDoctorActive();
    }

    @When("I send PUT HTTP request Doctor Active")
    public void sendPUTHttpRequestDoctorActive() {
        schedulesPage.sendPUTHttpRequestDoctorActive();
    }

    @Then("I receive valid HTTP response code 200 Doctor Active")
    public void iReceiveValidHTTPResponseCode200DoctorActive() {
        schedulesPage.iReceiveValidHTTPResponseCode200DoctorActive();
    }



    //PUT Doctor Active invalid endpoint
    @Given("I set PUT endpoints Doctor ActiveNeg1")
    public void setPUTApiEndpointDoctorActiveNeg1() {
        schedulesPage.setPUTApiEndpointDoctorActiveNeg1();
    }

    @When("I send PUT HTTP request Doctor ActiveNeg1")
    public void sendPUTHttpRequestDoctorActiveNeg1() {
        schedulesPage.sendPUTHttpRequestDoctorActiveNeg1();
    }



}
