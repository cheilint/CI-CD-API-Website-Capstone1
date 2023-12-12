package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProfileAdminPage {
    protected String url = "https://dev.reprohealth.my.id/";


    @Step("I set POST api endpoints Work History Admin")
    public String setPostApiEndpointWorkHistoryAdmin() {
        return url + "admins/profile/work-history";
    }

    @Step("I send POST HTTP request Work History Admin")
    public void sendPostHttpRequestWorkHistoryAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3712");
        requestBody.put("start_date", "2022-03-15T08:00:00Z");
        requestBody.put("end_date", "2022-12-31T17:00:00Z");
        requestBody.put("job", "Pediatrician");
        requestBody.put("workplace", "Bandung Children's Hospital");
        requestBody.put("position", "Head of Pediatrics");

        SerenityRest.given()
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpointWorkHistoryAdmin()).then().statusCode(201);
    }


    @Step("I receive valid HTTP response code 201 Work History Admin")
    public void receiveValidHttp201WorkHistoryAdmin() {
        restAssuredThat(response -> response.statusCode(201));
    }


//Positive PUT Doctor Work History Admin
    @Step("I set PUT api endpoints Work History Admin")
    public String setPUTApiEndpointWorkHistoryAdmin() {
        return url + "admins/profile/work-history/0f482ee4-a1f8-4541-8619-c1dd65b465ac";
    }

    @Step("I send PUT HTTP request Work History Admin")
    public void sendPUTHTTPrequestWorkHistoryAdmin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3712");
        requestBody.put("start_date", "2022-03-15T08:00:00Z");
        requestBody.put("end_date", "2022-12-31T17:00:00Z");
        requestBody.put("job", "Pediatriciann");
        requestBody.put("workplace", "Bandung Children's Hospital");
        requestBody.put("position", "Head of Pediatrics");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointWorkHistoryAdmin()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200 Work History Admin")
    public void receiveValidHttp200WorkHistoryAdmin() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //Positive DELETE Doctor Work History Admin
    @Step("I set DELETE api endpoints Work History Admin")
    public String setDELETEApiEndpointWorkHistoryAdmin(){
        return url + "admins/profile/work-history/6c6ad1d4-4777-4437-8fd2-953905778ad1";
    }

    @Step("I send DELETE HTTP request Work History Admin")
    public void sendDELETEHTTPrequestWorkHistoryAdmin(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).delete(setDELETEApiEndpointWorkHistoryAdmin()).then().statusCode(200);
    }


    //Positive POST Doctor Education admin
    @Step("I set POST api endpoints Education admin")
    public String setPOSTApiEndpointEducationAdmin() {
        return url + "admins/profile/education";
    }

    @Step("I send POST HTTP request Education admin")
    public void sendPOSTHTTPrequestEducationAdmin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3712");
        requestBody.put("start_date", "2014-09-01T00:00:00Z");
        requestBody.put("end_date", "2020-06-30T23:59:59Z");
        requestBody.put("education_program", "Doctor of Medicine");
        requestBody.put("university", "Fakultas Kedokteran Universitas Padjadjaran");

        SerenityRest.given()
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPOSTApiEndpointEducationAdmin()).then().statusCode(200);
    }


    @Step("I receive valid HTTP response code 200 Education admin")
    public void receiveValidHttp200EducationAdmin() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //Positive PUT doctor education admin
    @Step("I set PUT api endpoints Education Admin")
    public String setPUTApiEndpointEducationAdmin() {
        return url + "admins/profile/education/19b1cbb5-a321-44cf-9e2f-24404b7aee4d";
    }

    @Step("I send PUT HTTP request Education Admin")
    public void sendPUTHTTPrequestEducationAdmin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3712");
        requestBody.put("start_date", "2022-03-15T08:00:00Z");
        requestBody.put("end_date", "2022-12-31T17:00:00Z");
        requestBody.put("job", "Pediatrician");
        requestBody.put("workplace", "Bandung Children's Hospital");
        requestBody.put("position", "Head of Pediatrics");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointEducationAdmin()).then().statusCode(200);
    }

    //Positive DELETE Doctor education Admin
    @Step("I set DELETE api endpoints Education Admin")
    public String setDELETEApiEndpointEducationAdmin(){
        return url + "admins/profile/education/decc1793-bd08-4752-92d1-08c976b73b9b";
    }

    @Step("I send DELETE HTTP request Education Admin")
    public void sendDELETEHTTPrequestEducationAdmin(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).delete(setDELETEApiEndpointEducationAdmin()).then().statusCode(200);
    }



    //Positive POST Doctor Certification admin
    @Step("I set POST api endpoints Certification admin")
    public String setPOSTApiEndpointCertificationAdmin() {
        return url + "admins/profile/certification";
    }

    @Step("I send POST HTTP request Certification admin")
    public void sendPOSTHTTPrequestCertificationAdmin(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3712")
                .multiPart("start_date", "2016-01-02T15:04:05Z")
                .multiPart("end_date", "2022-01-02T15:04:05Z")
                .multiPart("description", "Darurat Reformasi Kesehatan")
                .multiPart("certificate_type", "Training Certification")
                .multiPart("details", new File("src/test/resources/foto/Sertifikat.jpg"), "image/jpeg")
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .post(setPOSTApiEndpointCertificationAdmin());
    }


    @Step("I receive valid HTTP response code 201 Certification admin")
    public void receiveValidHttp201CertificationAdmin() {
        restAssuredThat(response -> response.statusCode(201));
    }


    //Positive PUT doctor Certification admin
    @Step("I set PUT api endpoints Certification Admin")
    public String setPUTApiEndpointCertificationAdmin() {
        return url + "admins/profile/certification/25ebbad1-0d6c-4e1d-8117-dd4161adb431";
    }

    @Step("I send PUT HTTP request Certification Admin")
    public void sendPUTHTTPrequestCertificationAdmin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3712");
        requestBody.put("start_date", "2023-01-01T00:00:00Z");
        requestBody.put("end_date", "2023-12-31T23:59:59Z");
        requestBody.put("description", "Certification for Radiology");
        requestBody.put("certificate_type", "Medical Board Certification");
        requestBody.put("file_size", "2 MB");
        requestBody.put("details", "Certification of Medical Board Certification");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointCertificationAdmin()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Certification admin")
    public void receiveValidHttp200CertificationAdmin() {
        restAssuredThat(response -> response.statusCode(200));
    }



    //Positive DELETE Doctor Certification Admin
    @Step("I set DELETE api endpoints Certification Admin")
    public String setDELETEApiEndpointCertificationAdmin(){
        return url + "admins/profile/certification/1a7ead9f-bef3-4f03-940f-1a89632c7b37";
    }


    @Step("I send DELETE HTTP request Certification Admin")
    public void sendDELETEHTTPrequestCertificationAdmin(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authTokenAdmin).delete(setDELETEApiEndpointCertificationAdmin()).then().statusCode(200);
    }
}
