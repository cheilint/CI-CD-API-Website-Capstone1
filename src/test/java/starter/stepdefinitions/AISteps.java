package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.AIPage;

public class AISteps {

    @Steps
    AIPage aiPage;

    @Given("I set POST api endpoints Doctor Chatbot")
    public void setPOSTApiEndpointDoctorChatbot() {
        aiPage.setPOSTApiEndpointDoctorChatbot();
    }

    @When("I send POST HTTP request Doctor Chatbot")
    public void sendPOSTHttpRequestDoctorChatbot() {
        aiPage.sendPOSTHttpRequestDoctorChatbot();
    }

    @Then("I receive valid HTTP response code 200 Chatbot")
    public void receiveValidHttp200DoctorChatbot() {
        aiPage.receiveValidHttp200DoctorChatbot();
    }


    //Positive GET Chatbot History From Doctor ID
    @Given("I set GET api endpoints Chatbot History From Doctor ID")
    public void setGetApiEndpointChatbotHistory() {
        aiPage.setGetApiEndpointChatbotHistory();
    }

    @When("I send GET HTTP request Chatbot History From Doctor ID")
    public void sendGetHttpRequestChatbotHistory() {
        aiPage.sendGetHttpRequestChatbotHistory();
    }


    //Negative GET Chatbot History From Doctor ID invalid endpoint
    @Given("I set GET api endpoints Chatbot History From Doctor ID Neg1")
    public void setGetApiEndpointChatbotHistoryNeg1() {
        aiPage.setGetApiEndpointChatbotHistoryNeg1();
    }

    @When("I send GET HTTP request Chatbot History From Doctor ID Neg1")
    public void sendGetHttpRequestChatbotHistoryNeg1() {
        aiPage.sendGetHttpRequestChatbotHistoryNeg1();
    }

    @Then("I receive valid HTTP response code 400 ChatbotNeg1")
    public void receiveValidHttp400ChatbotHistoryNeg1() {
        aiPage.receiveValidHttp400ChatbotHistoryNeg1();
    }

    //Positive GET Chatbot History From Session ID
    @Given("I set GET api endpoints Chatbot History From Session ID")
    public void setGetApiEndpointChatbotHistorySession() {
        aiPage.setGetApiEndpointChatbotHistorySession();
    }

    @When("I send GET HTTP request Chatbot History From Session ID")
    public void sendGetHttpRequestChatbotHistorySession() {
        aiPage.sendGetHttpRequestChatbotHistorySession();
    }


    //Negative GET Chatbot History From Doctor ID invalid endpoint
    @Given("I set GET api endpoints Chatbot History From Session ID Neg1")
    public void setGetApiEndpointChatbotHistorySessionNeg1() {
        aiPage.setGetApiEndpointChatbotHistorySessionNeg1();
    }

    @When("I send GET HTTP request Chatbot History From Session ID Neg1")
    public void sendGetHttpRequestChatbotHistorySessionNeg1() {
        aiPage.sendGetHttpRequestChatbotHistorySessionNeg1();
    }

}
