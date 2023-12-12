package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import starter.java.AppointmentPage;

public class AppointmentSteps {
    @Steps
    AppointmentPage appointmentPage;

    @Given("I set GET api endpoints consultation schedules")
    public void ISetGETApiEndpointsConsultationSchedules() {
        appointmentPage.ISetGETApiEndpointsConsultationSchedules();
    }

    @When("I send GET HTTP request consultation schedules")
    public void IsendGETHTTPrequestConsultationSchedules() {
        appointmentPage.IsendGETHTTPrequestConsultationSchedules();
    }

    @Then("I receive valid HTTP response code 200 consultation schedules")
    public void iReceiveValidHTTPResponseCode200ConsultationSchedules() {
        appointmentPage.iReceiveValidHTTPResponseCode200ConsultationSchedules();
    }

    //Negative GET all Appointment
    @Given("I set GET api endpoints consultation schedulesNeg1")
    public void ISetGETApiEndpointsConsultationSchedulesNeg1() {
        appointmentPage.ISetGETApiEndpointsConsultationSchedulesNeg1();
    }

    @When("I send GET HTTP request consultation schedulesNeg1")
    public void IsendGETHTTPrequestConsultationSchedulesNeg1() {
        appointmentPage.IsendGETHTTPrequestConsultationSchedulesNeg1();
    }

    @Then("I receive valid HTTP response code 400 consultation schedulesNeg1")
    public void iReceiveValidHTTPResponseCode400ConsultationSchedulesNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode400ConsultationSchedulesNeg1();
    }

    //Positive GET Detail Appointment
    @Given("I set GET api endpoints Detail Appointment")
    public void ISetGETApiEndpointsDetailAppointment() {
        appointmentPage.ISetGETApiEndpointsDetailAppointment();
    }

    @When("I send GET HTTP request Detail Appointment")
    public void IsendGETHTTPrequestDetailAppointment() {
        appointmentPage.IsendGETHTTPrequestDetailAppointment();
    }

    @Then("I receive valid HTTP response code 200 Detail Appointment")
    public void iReceiveValidHTTPResponseCode200DetailAppointment() {
        appointmentPage.iReceiveValidHTTPResponseCode200DetailAppointment();
    }


    //Negative Detail Appointment
    @Given("I set GET api endpoints Detail AppointmentNeg1")
    public void ISetGETApiEndpointsDetailAppointmentNeg1() {
        appointmentPage.ISetGETApiEndpointsDetailAppointmentNeg1();
    }

    @When("I send GET HTTP request Detail AppointmentNeg1")
    public void IsendGETHTTPrequestDetailAppointmentNeg1() {
        appointmentPage.IsendGETHTTPrequestDetailAppointmentNeg1();
    }

    @Then("I receive valid HTTP response code 400 Detail AppointmentNeg1")
    public void iReceiveValidHTTPResponseCode400DetailAppointmentNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode400DetailAppointmentNeg1();
    }


    //Positive Detail Transaction
    @Given("I set GET api endpoints Detail Transaction")
    public void ISetGETApiEndpointsDetailTransaction() {
        appointmentPage.ISetGETApiEndpointsDetailTransaction();
    }

    @When("I send GET HTTP request Detail Transaction")
    public void IsendGETHTTPrequestDetailTransaction() {
        appointmentPage.IsendGETHTTPrequestDetailTransaction();
    }

    @Then("I receive valid HTTP response code 200 Detail Transaction")
    public void iReceiveValidHTTPResponseCode200DetailTransaction() {
        appointmentPage.iReceiveValidHTTPResponseCode200DetailTransaction();
    }


    //Negative Detail Transaction
    @Given("I set GET api endpoints Detail TransactionNeg1")
    public void ISetGETApiEndpointsDetailTransactionNeg1() {
        appointmentPage.ISetGETApiEndpointsDetailTransactionNeg1();
    }

    @When("I send GET HTTP request Detail TransactionNeg1")
    public void IsendGETHTTPrequestDetailTransactionNeg1() {
        appointmentPage.IsendGETHTTPrequestDetailTransactionNeg1();
    }

    @Then("I receive valid HTTP response code 400 Detail TransactionNeg1")
    public void iReceiveValidHTTPResponseCode400DetailTransactionNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode400DetailTransactionNeg1();
    }



    //Positive PUT Confirm Consultation
    @Given("I set PUT api endpoints Confirm Consultation")
    public void setPUTApiEndpointConfirmConsultation() {
        appointmentPage.setPUTApiEndpointConfirmConsultation();
    }

    @When("I send PUT HTTP request Confirm Consultation")
    public void sendPUTHTTPrequestConfirmConsultation() {
        appointmentPage.sendPUTHTTPrequestConfirmConsultation();
    }

    @Then("I receive valid HTTP response code 200 Confirm Consultation")
    public void iReceiveValidHTTPResponseCode200ConfirmConsultation() {
        appointmentPage.iReceiveValidHTTPResponseCode200ConfirmConsultation();
    }

    //Negative  PUT Confirm Consultation invalid endpoint
    @Given("I set PUT api endpoints Confirm ConsultationNeg1")
    public void setPUTApiEndpointConfirmConsultationNeg1() {
        appointmentPage.setPUTApiEndpointConfirmConsultationNeg1();
    }

    @When("I send PUT HTTP request Confirm ConsultationNeg1")
    public void sendPUTHTTPrequestConfirmConsultationNeg1() {
        appointmentPage.sendPUTHTTPrequestConfirmConsultationNeg1();
    }

    @Then("I receive valid HTTP response code 404 Confirm ConsultationNeg1")
    public void iReceiveValidHTTPResponseCode404ConfirmConsultationNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode404ConfirmConsultationNeg1();
    }


    //Positive PUT Finish Consultation
    @Given("I set PUT api endpoints Finish Consultation")
    public void setPUTApiEndpointFinishConsultation() {
        appointmentPage.setPUTApiEndpointFinishConsultation();
    }

    @When("I send PUT HTTP request Finish Consultation")
    public void sendPUTHTTPrequestFinishConsultation() {
        appointmentPage.sendPUTHTTPrequestFinishConsultation();
    }

    @Then("I receive valid HTTP response code 200 Finish Consultation")
    public void iReceiveValidHTTPResponseCode200FinishConsultation() {
        appointmentPage.iReceiveValidHTTPResponseCode200FinishConsultation();
    }

    //Negative  PUT Finish Consultation invalid endpoint
    @Given("I set PUT api endpoints Finish ConsultationNeg1")
    public void setPUTApiEndpointFinishConsultationNeg1() {
        appointmentPage.setPUTApiEndpointFinishConsultationNeg1();
    }

    @When("I send PUT HTTP request Finish ConsultationNeg1")
    public void sendPUTHTTPrequestFinishConsultationNeg1() {
        appointmentPage.sendPUTHTTPrequestFinishConsultationNeg1();
    }

    @Then("I receive valid HTTP response code 404 Finish ConsultationNeg1")
    public void iReceiveValidHTTPResponseCode404FinishConsultationNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode404FinishConsultationNeg1();
    }


    //Positive GET Filter all consultation by Name
    @Given("I set GET api endpoints Filter all consultation by Name")
    public void ISetGETApiEndpointsFilterName() {
        appointmentPage.ISetGETApiEndpointsFilterName();
    }

    @When("I send GET HTTP request Filter all consultation by Name")
    public void IsendGETHTTPrequestFilterName() {
        appointmentPage.IsendGETHTTPrequestFilterName();
    }

    @Then("I receive valid HTTP response code 200 Filter all consultation by Name")
    public void iReceiveValidHTTPResponseCode200FilterName() {
        appointmentPage.iReceiveValidHTTPResponseCode200FilterName();
    }


    //Negative GET Filter all consultation by Name
    @Given("I set GET api endpoints Filter all consultation by NameNeg1")
    public void ISetGETApiEndpointsFilterNameNeg1() {
        appointmentPage.ISetGETApiEndpointsFilterNameNeg1();
    }

    @When("I send GET HTTP request Filter all consultation by NameNeg1")
    public void IsendGETHTTPrequestFilterNameNeg1() {
        appointmentPage.IsendGETHTTPrequestFilterNameNeg1();
    }

    @Then("I receive valid HTTP response code 404 Filter all consultation by NameNeg1")
    public void iReceiveValidHTTPResponseCode404FilterNameNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode404FilterNameNeg1();
    }


    //Positive GET Filter all consultation by status
    @Given("I set GET api endpoints Filter all consultation by status")
    public void ISetGETApiEndpointsFilterstatus() {
        appointmentPage.ISetGETApiEndpointsFilterstatus();
    }

    @When("I send GET HTTP request Filter all consultation by status")
    public void IsendGETHTTPrequestFilterstatus() {
        appointmentPage.IsendGETHTTPrequestFilterstatus();
    }

    @Then("I receive valid HTTP response code 200 Filter all consultation by status")
    public void iReceiveValidHTTPResponseCode200Filterstatus() {
        appointmentPage.iReceiveValidHTTPResponseCode200Filterstatus();
    }


    //Negative GET Filter all consultation by status
    @Given("I set GET api endpoints Filter all consultation by statusNeg1")
    public void ISetGETApiEndpointsFilterstatusNeg1() {
        appointmentPage.ISetGETApiEndpointsFilterstatusNeg1();
    }

    @When("I send GET HTTP request Filter all consultation by statusNeg1")
    public void IsendGETHTTPrequestFilterstatusNeg1() {
        appointmentPage.IsendGETHTTPrequestFilterstatusNeg1();
    }

    @Then("I receive valid HTTP response code 404 Filter all consultation by statusNeg1")
    public void iReceiveValidHTTPResponseCode404FilterstatusNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode404FilterstatusNeg1();
    }


    //Positive Get Filter all consultation by Name and status
    @Given("I set GET api endpoints Filter all consultation by Name and status")
    public void ISetGETApiEndpointsFilterNameAndStatus() {
        appointmentPage.ISetGETApiEndpointsFilterNameAndStatus();
    }

    @When("I send GET HTTP request Filter all consultation by Name and status")
    public void IsendGETHTTPrequestFilterNameAndStatus() {
        appointmentPage.IsendGETHTTPrequestFilterNameAndStatus();
    }

    @Then("I receive valid HTTP response code 200 Filter all consultation by Name and status")
    public void iReceiveValidHTTPResponseCode200FilterNameAndStatus() {
        appointmentPage.iReceiveValidHTTPResponseCode200FilterNameAndStatus();
    }


    //Negative Get Filter all consultation by Name and status
    @Given("I set GET api endpoints Filter all consultation by Name and statusNeg1")
    public void ISetGETApiEndpointsFilterNameAndStatusNeg1() {
        appointmentPage.ISetGETApiEndpointsFilterNameAndStatusNeg1();
    }

    @When("I send GET HTTP request Filter all consultation by Name and statusNeg1")
    public void IsendGETHTTPrequestFilterNameAndStatusNeg1() {
        appointmentPage.IsendGETHTTPrequestFilterNameAndStatusNeg1();
    }

    @Then("I receive valid HTTP response code 404 Filter all consultation by Name and statusNeg1")
    public void iReceiveValidHTTPResponseCode404FilterNameAndStatusNeg1() {
        appointmentPage.iReceiveValidHTTPResponseCode404FilterNameAndStatusNeg1();
    }
}
