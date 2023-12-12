package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AIPage {
    protected String url = "https://dev.reprohealth.my.id/";

    @Step("I set POST api endpoints Doctor Chatbot")
    public String setPOSTApiEndpointDoctorChatbot() {
        return url + "doctors/chatbot/health-recommendation";
    }

    @Step("I send POST HTTP request Doctor Chatbot")
    public void sendPOSTHttpRequestDoctorChatbot() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "Terimakasih atas nasihat anda dalam menjelaskan tentang kanker payudara");
        requestBody.put("session_id", "f7613c10-29fd-4b82-bfea-1649ae41af98");


        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).post(setPOSTApiEndpointDoctorChatbot()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Chatbot")
    public void receiveValidHttp200DoctorChatbot() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Positive GET Chatbot History From Doctor ID
    @Step("I set GET api endpoints Chatbot History From Doctor ID")
    public String setGetApiEndpointChatbotHistory() {
        return url + "doctors/chatbot/health-recommendation/f7613c10-29fd-4b82-bfea-1649ae41af98";
    }

    @Step("I send GET HTTP request Chatbot History From Doctor ID")
    public void sendGetHttpRequestChatbotHistory() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointChatbotHistory()).then().statusCode(200);
    }


    //Negative GET Chatbot History From Doctor ID invalid endpoint
    @Step("I set GET api endpoints Chatbot History From Doctor ID Neg1")
    public String setGetApiEndpointChatbotHistoryNeg1() {
        return url + "doctors/chatbot/health-recomendation/f7613c10-29fd-4b82-bfea-1649ae41af98";
    }

    @Step("I send GET HTTP request Chatbot History From Doctor ID Neg1")
    public void sendGetHttpRequestChatbotHistoryNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointChatbotHistoryNeg1()).then().statusCode(400);
    }

    @Step("I receive valid HTTP response code 400 ChatbotNeg1")
    public void receiveValidHttp400ChatbotHistoryNeg1() {
        restAssuredThat(response -> response.statusCode(400));
    }



    //Positive GET Chatbot History From Session ID
    @Step("I set GET api endpoints Chatbot History From Session ID")
    public String setGetApiEndpointChatbotHistorySession() {
        return url + "doctors/chatbot/health-recommendation/session/88197ab8-5462-4821-8424-f4d7aa2223a3";
    }

    @Step("I send GET HTTP request Chatbot History From Session ID")
    public void sendGetHttpRequestChatbotHistorySession() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointChatbotHistorySession()).then().statusCode(200);
    }


    //Negative GET Chatbot History From Session ID invalid endpoint
    @Step("I set GET api endpoints Chatbot History From Session ID Neg1")
    public String setGetApiEndpointChatbotHistorySessionNeg1() {
        return url + "doctors/chatbot/health-recommendation/sesion/88197ab8-5462-4821-8424-f4d7aa2223a3";
    }

    @Step("I send GET HTTP request Chatbot History From Session ID Neg1")
    public void sendGetHttpRequestChatbotHistorySessionNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointChatbotHistorySessionNeg1()).then().statusCode(400);
    }



}
