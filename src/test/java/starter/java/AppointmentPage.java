package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AppointmentPage {
    protected static String url = "https://dev.reprohealth.my.id/";


    @Step("I set GET api endpoints consultation schedules")
    public String ISetGETApiEndpointsConsultationSchedules(){
        return url + "doctors/appointments/details-consultation";
    }

    @Step("I send GET HTTP request consultation schedules")
    public void IsendGETHTTPrequestConsultationSchedules(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsConsultationSchedules()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 consultation schedules")
    public void iReceiveValidHTTPResponseCode200ConsultationSchedules(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Negative GET all Appointment
    @Step("I set GET api endpoints consultation schedulesNeg1")
    public String ISetGETApiEndpointsConsultationSchedulesNeg1(){
        return url + "doctors/appointments/details-consultation.";
    }

    @Step("I send GET HTTP request consultation schedulesNeg1")
    public void IsendGETHTTPrequestConsultationSchedulesNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsConsultationSchedulesNeg1()).then().statusCode(400);
    }

    @Step("I receive valid HTTP response code 400 consultation schedulesNeg1")
    public void iReceiveValidHTTPResponseCode400ConsultationSchedulesNeg1(){
        restAssuredThat(response -> response.statusCode(400));
    }

    //Positive GET Detail Appointment
    @Step("I set GET api endpoints Detail Appointment")
    public String ISetGETApiEndpointsDetailAppointment(){
        return url + "doctors/appointments/details-consultation/2ba56760-5a31-41ab-92b9-4a31e0c281b7";
    }

    @Step("I send GET HTTP request Detail Appointment")
    public void IsendGETHTTPrequestDetailAppointment(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsDetailAppointment()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Detail Appointment")
    public void iReceiveValidHTTPResponseCode200DetailAppointment(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative  Detail Appointment
    @Step("I set GET api endpoints Detail AppointmentNeg1")
    public String ISetGETApiEndpointsDetailAppointmentNeg1(){
        return url + "doctors/appointment/details-consultation/2ba56760-5a31-41ab-92b9-4a31e0c281b7";
    }

    @Step("I send GET HTTP request Detail AppointmentNeg1")
    public void IsendGETHTTPrequestDetailAppointmentNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsDetailAppointmentNeg1()).then().statusCode(400);
    }

    @Step("I receive valid HTTP response code 400 Detail AppointmentNeg1")
    public void iReceiveValidHTTPResponseCode400DetailAppointmentNeg1(){
        restAssuredThat(response -> response.statusCode(400));
    }


    //Positive Detail Transaction
    @Step("I set GET api endpoints Detail Transaction")
    public String ISetGETApiEndpointsDetailTransaction(){
        return url + "doctors/appointments/details-transaction/357ba23b-436d-43ee-8769-78008f4e4491";
    }

    @Step("I send GET HTTP request Detail Transaction")
    public void IsendGETHTTPrequestDetailTransaction(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsDetailTransaction()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Detail Transaction")
    public void iReceiveValidHTTPResponseCode200DetailTransaction(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative  Detail Transaction
    @Step("I set GET api endpoints Detail TransactionNeg1")
    public String ISetGETApiEndpointsDetailTransactionNeg1(){
        return url + "doctors/appointments/details-transactionn/357ba23b-436d-43ee-8769-78008f4e4491";
    }

    @Step("I send GET HTTP request Detail TransactionNeg1")
    public void IsendGETHTTPrequestDetailTransactionNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsDetailTransactionNeg1()).then().statusCode(400);
    }

    @Step("I receive valid HTTP response code 400 Detail TransactionNeg1")
    public void iReceiveValidHTTPResponseCode400DetailTransactionNeg1(){
        restAssuredThat(response -> response.statusCode(400));
    }


    // Positive  PUT Confirm Consultation
    @Step("I set PUT api endpoints Confirm Consultation")
    public String setPUTApiEndpointConfirmConsultation() {
        return url + "doctors/appointments/confirm-consultation";
    }

    @Step("I send PUT HTTP request Confirm Consultation")
    public void sendPUTHTTPrequestConfirmConsultation(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("consultation_id", "e66e3136-a9a0-4254-9cbb-64a1391930e3");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointConfirmConsultation()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Confirm Consultation")
    public void iReceiveValidHTTPResponseCode200ConfirmConsultation(){
        restAssuredThat(response -> response.statusCode(200));
    }


    // Negative  PUT Confirm Consultation invalid endpoint
    @Step("I set PUT api endpoints Confirm ConsultationNeg1")
    public String setPUTApiEndpointConfirmConsultationNeg1() {
        return url + "doctors/appointments/confirm-consultatio";
    }

    @Step("I send PUT HTTP request Confirm ConsultationNeg1")
    public void sendPUTHTTPrequestConfirmConsultationNeg1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("consultation_id", "e66e3136-a9a0-4254-9cbb-64a1391930e3");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointConfirmConsultationNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Confirm ConsultationNeg1")
    public void iReceiveValidHTTPResponseCode404ConfirmConsultationNeg1(){
        restAssuredThat(response -> response.statusCode(404));
    }



    // Positive  PUT Finish Consultation
    @Step("I set PUT api endpoints Finish Consultation")
    public String setPUTApiEndpointFinishConsultation() {
        return url + "doctors/appointments/finish-consultation";
    }

    @Step("I send PUT HTTP request Finish Consultation")
    public void sendPUTHTTPrequestFinishConsultation(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("consultation_id", "e66e3136-a9a0-4254-9cbb-64a1391930e3");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointFinishConsultation()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Finish Consultation")
    public void iReceiveValidHTTPResponseCode200FinishConsultation(){
        restAssuredThat(response -> response.statusCode(200));
    }


    // Negative  PUT Finish Consultation invalid endpoint
    @Step("I set PUT api endpoints Finish ConsultationNeg1")
    public String setPUTApiEndpointFinishConsultationNeg1() {
        return url + "doctors/appointments/finish-consultatio";
    }

    @Step("I send PUT HTTP request Finish ConsultationNeg1")
    public void sendPUTHTTPrequestFinishConsultationNeg1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("consultation_id", "e66e3136-a9a0-4254-9cbb-64a1391930e3");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointFinishConsultationNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Finish ConsultationNeg1")
    public void iReceiveValidHTTPResponseCode404FinishConsultationNeg1(){
        restAssuredThat(response -> response.statusCode(404));
    }



    //Positive GET Filter all consultation by Name
    @Step("I set GET api endpoints Filter all consultation by Name")
    public String ISetGETApiEndpointsFilterName(){
        return url + "doctors/appointments/details-consultation?name=Jo";
    }

    @Step("I send GET HTTP request Filter all consultation by Name")
    public void IsendGETHTTPrequestFilterName(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsFilterName()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Filter all consultation by Name")
    public void iReceiveValidHTTPResponseCode200FilterName(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative  GET Filter all consultation by Name
    @Step("I set GET api endpoints Filter all consultation by NameNeg1")
    public String ISetGETApiEndpointsFilterNameNeg1(){
        return url + "doctors/appointments/details-consultation?name=Cheilint";
    }

    @Step("I send GET HTTP request Filter all consultation by NameNeg1")
    public void IsendGETHTTPrequestFilterNameNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsFilterNameNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Filter all consultation by NameNeg1")
    public void iReceiveValidHTTPResponseCode404FilterNameNeg1(){
        restAssuredThat(response -> response.statusCode(404));
    }


    //Positive GET Filter all consultation by status
    @Step("I set GET api endpoints Filter all consultation by status")
    public String ISetGETApiEndpointsFilterstatus(){
        return url + "doctors/appointments/details-consultation?status=waiting";
    }

    @Step("I send GET HTTP request Filter all consultation by status")
    public void IsendGETHTTPrequestFilterstatus(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsFilterstatus()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Filter all consultation by status")
    public void iReceiveValidHTTPResponseCode200Filterstatus(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative  GET Filter all consultation by status
    @Step("I set GET api endpoints Filter all consultation by statusNeg1")
    public String ISetGETApiEndpointsFilterstatusNeg1(){
        return url + "doctors/appointments/details-consultation?name=Ant&status=waiting.";
    }

    @Step("I send GET HTTP request Filter all consultation by statusNeg1")
    public void IsendGETHTTPrequestFilterstatusNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsFilterstatusNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Filter all consultation by statusNeg1")
    public void iReceiveValidHTTPResponseCode404FilterstatusNeg1(){
        restAssuredThat(response -> response.statusCode(404));
    }


    //Positive Get Filter all consultation by Name and status
    @Step("I set GET api endpoints Filter all consultation by Name and status")
    public String ISetGETApiEndpointsFilterNameAndStatus(){
        return url + "doctors/appointments/details-consultation?status=waiting";
    }

    @Step("I send GET HTTP request Filter all consultation by Name and status")
    public void IsendGETHTTPrequestFilterNameAndStatus(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsFilterNameAndStatus()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Filter all consultation by Name and status")
    public void iReceiveValidHTTPResponseCode200FilterNameAndStatus(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative  Get Filter all consultation by Name and status
    @Step("I set GET api endpoints Filter all consultation by Name and statusNeg1")
    public String ISetGETApiEndpointsFilterNameAndStatusNeg1(){
        return url + "doctors/appointments/details-consultation?name=Ant&status=waiting.";
    }

    @Step("I send GET HTTP request Filter all consultation by Name and statusNeg1")
    public void IsendGETHTTPrequestFilterNameAndStatusNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsFilterNameAndStatusNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Filter all consultation by Name and statusNeg1")
    public void iReceiveValidHTTPResponseCode404FilterNameAndStatusNeg1(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
