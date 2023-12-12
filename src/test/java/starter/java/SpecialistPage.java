package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class SpecialistPage {
    protected String url = "https://dev.reprohealth.my.id/";

    @Step("I set GET api endpoints Specialists")
    public String setGetApiEndpointSpecialists() {
        return url + "admins/specialists";
    }

    @Step("I send GET HTTP request Specialists")
    public void sendGetHttpRequestSpecialists() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).get(setGetApiEndpointSpecialists()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Specialists")
    public void receiveValidHttp200Specialists() {
        restAssuredThat(response -> response.statusCode(200));
    }



    //Positive GET All Specialists invalid endpoint (Admin)
    @Step("I set GET api endpoints SpecialistsNeg1")
    public String setGetApiEndpointSpecialistsNeg1() {
        return url + "admins/specialist";
    }

    @Step("I send GET HTTP request SpecialistsNeg1")
    public void sendGetHttpRequestSpecialistsNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).get(setGetApiEndpointSpecialistsNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 SpecialistsNeg1")
    public void receiveValidHttp404SpecialistsNeg1() {
        restAssuredThat(response -> response.statusCode(404));
    }


    //POST new Specialists (Admin)
    @Step("I set POST api endpoints Specialists")
    public String setPostApiEndpointSpecialists() {
        return url + "admins/specialists";
    }

    @Step("I send POST HTTP request Specialists")
    public void sendPostHttpRequestSpecialists() {
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("Name", "Obgyn ")
                .multiPart("image", new File("src/test/resources/foto/Specialists.jpg"), "image/jpeg")
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .post(setPostApiEndpointSpecialists());
    }

    @Step("I receive valid HTTP response code 201 Specialists")
    public void receiveValidHttp201Specialists() {
        restAssuredThat(response -> response.statusCode(201));
    }


    //POST new Specialists invalid endpoint (Admin)
    @Step("I set POST api endpoints SpecialistsNeg1")
    public String setPostApiEndpointSpecialistsNeg1() {
        return url + "admins/specialist";
    }

    @Step("I send POST HTTP request SpecialistsNeg1")
    public void sendPostHttpRequestSpecialistsNeg1() {
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("Name", "Kandungan")
                .multiPart("image", new File("src/test/resources/foto/Specialists.jpg"), "image/jpeg")
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .post(setPostApiEndpointSpecialistsNeg1());
    }

    //PUT Specialists Data (Admin)
    @Step("I set PUT api endpoints Specialists")
    public String sendPUTHttpRequestSpecialists() {
        return url + "admins/specialists/4d7363dc-cab1-4f30-a9d7-6edfcddbe38a";
    }

    @Step("I send PUT HTTP request Specialists")
    public void setPUTApiEndpointSpecialists(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name", "Kandungan Jamak");
        requestBody.put("image", "src/test/resources/foto/Specialists.jpg");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(sendPUTHttpRequestSpecialists()).then().statusCode(200);
    }

    //PUT Specialists Data  invalid endpoint (Admin)
    @Step("I set PUT api endpoints SpecialistsNeg1")
    public String sendPUTHttpRequestSpecialistsNeg1() {
        return url + "admins/Specialists/4d7363dc-cab1-4f30-a9d7-6edfcddbe38a";
    }

    @Step("I send PUT HTTP request SpecialistsNeg1")
    public void setPUTApiEndpointSpecialistsNeg1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Name", "Kandungan Jamak");
        requestBody.put("image", "src/test/resources/foto/Specialists.jpg");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(sendPUTHttpRequestSpecialistsNeg1()).then().statusCode(404);
    }

    //Positive DELETE Specialists with ID
    @Step("I set DELETE api endpoints Specialists")
    public String setDELETEApiEndpointSpecialists(){
        return url + "admins/specialists/ad525900-f9ad-4460-9c69-5faee95e1ced";
    }

    @Step("I send DELETE HTTP request Specialists")
    public void sendDELETEHTTPrequestSpecialists(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).delete(setDELETEApiEndpointSpecialists()).then().statusCode(200);
    }

    //negative DELETE Specialists with ID invalid endpoint
    @Step("I set DELETE api endpoints SpecialistsNeg1")
    public String setDELETEApiEndpointSpecialistsNeg1(){
        return url + "doctors/articl/dbe6d5d2-641b-4655-8f90-07d82ee5d4ca";
    }

    @Step("I send DELETE HTTP request SpecialistsNeg1")
    public void sendDELETEHTTPrequestSpecialistsNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).delete(setDELETEApiEndpointSpecialistsNeg1()).then().statusCode(404);
    }
}
