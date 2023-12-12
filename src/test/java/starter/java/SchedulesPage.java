package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class SchedulesPage {

    protected String url = "https://dev.reprohealth.my.id/";

    //Positive GET all Schedules
    @Step("I set GET api endpoints Schedules")
    public String setGetApiEndpointSchedules() {
        return url + "doctors/schedule";
    }

    @Step("I send GET HTTP request Schedules")
    public void sendGetHttpRequestSchedules() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointSchedules()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200 Schedules")
    public void receiveValidHttp200Schedules() {
        restAssuredThat(response -> response.statusCode(200));}


    //Negative GET all Schedules invalid endpoint
    @Step("I set GET api endpoints SchedulesNeg1")
    public String setGetApiEndpointSchedulesNeg1() {
        return url + "doctors/schedules";
    }

    @Step("I send GET HTTP request SchedulesNeg1")
    public void sendGetHttpRequestSchedulesNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointSchedulesNeg1()).then().statusCode(400);
    }
    @Step("I receive valid HTTP response code 400 SchedulesNeg1")
    public void receiveValidHttp400SchedulesNeg1() {
        restAssuredThat(response -> response.statusCode(400));}


    //PUT Doctor Inactive
    @Step("I set PUT endpoints Doctor Inactive")
    public String setPUTApiEndpointDoctorInactive() {
        return url + "doctors/schedule/inactive?date=2023-12-16&session=pagi";
    }

    @Step("I send PUT HTTP request Doctor Inactive")
    public void sendPUTHttpRequestDoctorInactive() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .put(setPUTApiEndpointDoctorInactive()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Doctor Inactive")
    public void iReceiveValidHTTPResponseCode200DoctorInactive(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //PUT Doctor Inactive Invalid endpoint
    @Step("I set PUT endpoints Doctor InactiveNeg1")
    public String setPUTApiEndpointDoctorInactiveNeg1() {
        return url + "doctors/scheduless/inactive?date=2023-12-16&session=pagi";
    }

    @Step("I send PUT HTTP request Doctor InactiveNeg1")
    public void sendPUTHttpRequestDoctorInactiveNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .put(setPUTApiEndpointDoctorInactiveNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Doctor")
    public void iReceiveValidHTTPResponseCode404Doctor(){
        restAssuredThat(response -> response.statusCode(404));
    }


    //PUT Doctor Active
    @Step("I set PUT endpoints Doctor Active")
    public String setPUTApiEndpointDoctorActive() {
        return url + "doctors/schedule/active?date=2023-12-23&session=siang";
    }

    @Step("I send PUT HTTP request Doctor Active")
    public void sendPUTHttpRequestDoctorActive() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .put(setPUTApiEndpointDoctorActive()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Doctor Active")
    public void iReceiveValidHTTPResponseCode200DoctorActive(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //PUT Doctor Active invalid endpoint
    @Step("I set PUT endpoints Doctor ActiveNeg1")
    public String setPUTApiEndpointDoctorActiveNeg1() {
        return url + "doctors/scheduless/active?date=2023-12-23&session=siang";
    }

    @Step("I send PUT HTTP request Doctor ActiveNeg1")
    public void sendPUTHttpRequestDoctorActiveNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .put(setPUTApiEndpointDoctorActiveNeg1()).then().statusCode(404);
    }


}
