package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginAdminPage {
    protected String url = "https://dev.reprohealth.my.id/";


    @Step("I set POST api endpoints loginAdmin")
    public String setPostApiEndpointLoginAdmin() {
        return url + "admins/login";
    }

    @Step("I send POST HTTP request loginAdmin")
    public void sendPostHttpRequestLoginAdmin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin1@gmail.com");
        requestBody.put("password", "Admin@123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }

    @Step("I receive valid HTTP response code 200 loginAdmin")
    public void receiveValidHttp200LoginAdmin() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative

    @Step("I send POST HTTP request loginAdminNeg1")
    public void sendPostHttpRequestloginAdminNeg1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "Admin@123");
       SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }

    @Step("I send POST HTTP request loginAdminNeg2")
    public void sendPostHttpRequestloginAdminNeg2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin1@gmail.com");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }



    @Step("I send POST HTTP request loginAdminNeg3")
    public void sendPostHttpRequestloginAdminNeg3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }



    @Step("I send POST HTTP request loginAdminNeg4")
    public void sendPostHttpRequestLoginAdminNeg4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin1@gmail.com");
        requestBody.put("password", "Admin@1234");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }

    @Step("I send POST HTTP request loginAdminNeg5")
    public void sendPostHttpRequestLoginAdminNeg5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin1@gml.com");
        requestBody.put("password", "Admin@123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }

    @Step("I send POST HTTP request loginAdminNeg6")
    public void sendPostHttpRequestLoginAdminNeg6() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "lxaszcdvcbg@gmail.com");
        requestBody.put("password", "ASdfghyf");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLoginAdmin());
    }


    @Step("I receive valid HTTP response code 404 loginAdmin")
    public void receiveValidHttp404LoginAdmin() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid HTTP response code 400 loginAdmin")
    public void receiveValidHttp400LoginAdmin() {
        restAssuredThat(response -> response.statusCode(400));
    }

}