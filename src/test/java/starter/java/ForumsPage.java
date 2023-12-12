package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ForumsPage {
    protected static String url = "https://dev.reprohealth.my.id/";

    @Step("I set GET api endpoints Forums")
    public String ISetGETApiEndpointsForums(){
        return url + "doctors/forums";
    }
    @Step("I send GET HTTP request Forums")
    public void IsendGETHTTPrequestForums(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsForums()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200 Forums")
    public void iReceiveValidHTTPResponseCode200Forums(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative GET forum invalid endpoint
    @Step("I set GET api endpoints ForumsNeg1")
    public String ISetGETApiEndpointsForumsNeg1(){
        return url + "doctors/forumss";
    }
    @Step("I send GET HTTP request ForumsNeg1")
    public void IsendGETHTTPrequestForumsNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsForumsNeg1()).then().statusCode(400);
    }
    @Step("I receive valid HTTP response code 400 ForumsNeg1")
    public void iReceiveValidHTTPResponseCode400ForumsNeg1(){
        restAssuredThat(response -> response.statusCode(400));
    }


    //Positive Get all forums by search
    @Step("I set GET api endpoints Forums by search")
    public String ISetGETApiEndpointsForumsBySearch(){
        return url + "doctors/forums?title=penyakit";
    }
    @Step("I send GET HTTP request Forums by search")
    public void IsendGETHTTPrequestForumsbysearch(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsForumsBySearch()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200 Forums by search")
    public void iReceiveValidHTTPResponseCode200Forumsbysearch(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Negative Get all forums by search invalid endpoint
    @Step("I set GET api endpoints Forums by searchNeg1")
    public String ISetGETApiEndpointsForumsBySearchNeg1(){
        return url + "doctors/forum?title=penyakit";
    }
    @Step("I send GET HTTP request Forums by searchNeg1")
    public void IsendGETHTTPrequestForumsbysearchNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsForumsBySearchNeg1()).then().statusCode(400);
    }
    @Step("I receive valid HTTP response code 400 Forums by searchNeg1")
    public void iReceiveValidHTTPResponseCode400ForumsbysearchNeg1(){
        restAssuredThat(response -> response.statusCode(400));
    }

    //Positive Get Detail forums
    @Step("I set GET api endpoints Detail forums")
    public String ISetGETApiEndpointsDetailforums(){
        return url + "doctors/forums/details/20c62301-597f-40a1-83a9-bf1a576ad1ad";
    }
    @Step("I send GET HTTP request Detail forums")
    public void IsendGETHTTPrequestDetailforums(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsDetailforums()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200 Detail forums")
    public void iReceiveValidHTTPResponseCode200Detailforums(){
        restAssuredThat(response -> response.statusCode(200));
    }

    //Negative Get Detail forums invalid endpoint
    @Step("I set GET api endpoints Detail forumsNeg1")
    public String ISetGETApiEndpointsDetailforumsNeg1(){
        return url + "doctors/forums/detail/20c62301-597f-40a1-83a9-bf1a576ad1ad";
    }
    @Step("I send GET HTTP request Detail forumsNeg1")
    public void IsendGETHTTPrequestDetailforumsNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsDetailforumsNeg1()).then().statusCode(400);
    }
    @Step("I receive valid HTTP response code 400 Detail forumsNeg1")
    public void iReceiveValidHTTPResponseCode400DetailforumsNeg1(){
        restAssuredThat(response -> response.statusCode(400));
    }


    //Positive POST forum replies
    @Step("I set POST endpoints Forum Replies")
    public String setPostApiEndpointForumReplies() {
        return url + "doctors/forum-replies";
    }

    @Step("I send POST HTTP request Forum Replies")
    public void sendPostHttpRequestForumReplies() {
    JSONObject requestBody = new JSONObject();
        requestBody.put("forum_id", "17bfac04-9644-46f1-8697-859b4235ca69");
        requestBody.put("content", "Manusia adalah spesies makhluk hidup yang termasuk dalam kelompok primata dan mamalia. Berikut adalah beberapa ciri-ciri ");


        SerenityRest.given()
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .post(setPostApiEndpointForumReplies()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Forum Replies")
    public void receiveValidHttp200ForumReplies() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Negative POST forum replies invalid endpoint
    @Step("I set POST endpoints Forum RepliesNeg1")
    public String setPostApiEndpointForumRepliesNeg1() {
        return url + "doctors/forum-replies";
    }

    @Step("I send POST HTTP request Forum RepliesNeg1")
    public void sendPostHttpRequestForumRepliesNeg1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("forum_id", "");
        requestBody.put("content", "Semoga jawaban saya membantu Anda");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).post(setPostApiEndpointForumRepliesNeg1()).then().statusCode(404);
    }



    //Positive PUT forum replies
    @Step("I set PUT endpoints Forum Replies")
    public String setPUTApiEndpointForumReplies() {
        return url + "doctors/forum-replies/9eabd07e-90fa-46e4-b036-72fbacb3f8d0";
    }

    @Step("I send PUT HTTP request Forum Replies")
    public void sendPUTHTTPrequestForumReplies(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "Semoga jawaban saya membantu Anda yaa dan cepat sehat yaa");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointForumReplies()).then().statusCode(200);
    }

    //Positive PUT forum replies invalid endpoint
    @Step("I set PUT endpoints Forum RepliesNeg1")
    public String setPUTApiEndpointForumRepliesNeg1() {
        return url + "doctors/Forum-replies/9eabd07e-90fa-46e4-b036-72fbacb3f8d0";
    }

    @Step("I send PUT HTTP request Forum RepliesNeg1")
    public void sendPUTHTTPrequestForumRepliesNeg1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "Semoga jawaban saya membantu Anda yaa dan cepat sehat yaa");

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPUTApiEndpointForumRepliesNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 Forum RepliesNeg1")
    public void receiveValidHttp404ForumRepliesNeg1() {
        restAssuredThat(response -> response.statusCode(404));
    }


    //Positive DELETE forum replies
    @Step("I set DELETE endpoints Forum Replies")
    public String setDELETEApiEndpointForumReplies(){
        return url + "doctors/forum-replies/0fdaf7ec-f405-46f4-bb7c-bf9ee96b068f";
    }

    @Step("I send DELETE HTTP request Forum Replies")
    public void sendDELETEHTTPrequestForumReplies(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).delete(setDELETEApiEndpointForumReplies()).then().statusCode(200);
    }

    //Negative DELETE forum replies invalid endpoint
    @Step("I set DELETE endpoints Forum RepliesNeg1")
    public String setDELETEApiEndpointForumRepliesNeg1(){
        return url + "doctors/Forum-replies/e0a8e494-6acb-4ec6-b0dd-c063cc27fdb5";
    }

    @Step("I send DELETE HTTP request Forum RepliesNeg1")
    public void sendDELETEHTTPrequestForumRepliesNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).delete(setDELETEApiEndpointForumRepliesNeg1()).then().statusCode(404);
    }
}
