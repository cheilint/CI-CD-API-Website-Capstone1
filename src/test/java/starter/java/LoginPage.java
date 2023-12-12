package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginPage {
    protected String url = "https://dev.reprohealth.my.id/";


    @Step("I set POST api endpoints login")
    public String setPostApiEndpointLogin() {
        return url + "doctors/login";
    }

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "andicahyo@gmail.com");
        requestBody.put("password", "Doctor@123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I receive valid HTTP response code 200 login")
    public void receiveValidHttp200Login() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative

    @Step("I send POST HTTP request loginNeg1")
    public void sendPostHttpRequestloginNeg1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "Doctor@123");
       SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request loginNeg2")
    public void sendPostHttpRequestloginNeg2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lalasyaa92@gmail.com");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }



    @Step("I send POST HTTP request loginNeg3")
    public void sendPostHttpRequestloginNeg3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }



    @Step("I send POST HTTP request loginNeg4")
    public void sendPostHttpRequestLoginNeg4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lalasyaa92@gmail.com");
        requestBody.put("password", "Taurus24");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request loginNeg5")
    public void sendPostHttpRequestLoginNeg5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lalasyaa92@.com");
        requestBody.put("password", "Taurus24");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I send POST HTTP request loginNeg6")
    public void sendPostHttpRequestLoginNeg6() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lxaszcdvcbg@gmail.com");
        requestBody.put("password", "ASdfghyf");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());
    }

    @Step("I receive valid HTTP response code 404 login")
    public void receiveValidHttp404Login() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Login() {
        restAssuredThat(response -> response.statusCode(400));
    }

}