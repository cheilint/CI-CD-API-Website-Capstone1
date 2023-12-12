package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ArticlePage {
    protected String url = "https://dev.reprohealth.my.id/";

    //Positive GET Article
    @Step("I set GET api endpoints Article")
    public String setGetApiEndpointArticle() {
        return url + "doctors/articles";
    }

    @Step("I send GET HTTP request Article")
    public void sendGetHttpRequestArticle() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointArticle()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200 Article")
    public void receiveValidHttp200Article() {
        restAssuredThat(response -> response.statusCode(200));}

    //Negative GET articles invalid endpoint

    @Step("I set GET api endpoints ArticleNeg1")
    public String setGetApiEndpointArticleNeg1() {
        return url + "doctors/art1cles";
    }

    @Step("I send GET HTTP request ArticleNeg1")
    public void sendGetHttpRequestArticleNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointArticleNeg1()).then().statusCode(400);
    }

    @Step("I receive valid HTTP response code 400 ArticleNeg1")
    public void receiveValidHttp400ArticleNeg1() {
        restAssuredThat(response -> response.statusCode(400));
    }



    //Positive GET Article with ID
    @Step("I set GET api endpoints Article with ID")
    public String setGetApiEndpointArticleWithID() {
        return url + "doctors/articles/2e5301ee-9a1e-49ef-9d18-fab930108707";
    }

    @Step("I send GET HTTP request Article with ID")
    public void sendGetHttpRequestArticleWithID() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointArticleWithID()).then().statusCode(200);
    }


    //Negative article by ID invalid endpoint

    @Step("I set GET api endpoints Article with ID Neg1")
    public String setGetApiEndpointArticleWithIDNeg1() {
        return url + "doctors/article/2e5301ee-9a1e-49ef-9d18-fab930108707";
    }

    @Step("I send GET HTTP request Article with ID Neg1")
    public void sendGetHttpRequestArticleWithIDNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointArticleWithIDNeg1()).then().statusCode(400);
    }


    //Positive POST Articles
    @Step("I set POST api endpoints Articles")
    public String setPostApiEndpointArticles() {
        return url + "doctors/articles";
    }

    @Step("I send POST HTTP request Articles")
    public void sendPostHttpRequestArticles() {
            SerenityRest.given()
                    .contentType("multipart/form-data")
                    .multiPart("title", "Tips Menjaga Kesehatan Reproduksi Wanita")
                    .multiPart("tags", "reproduksi")
                    .multiPart("reference", "World Health Organization")
                    .multiPart("image", new File("src/test/resources/foto/artikel.jpg"), "image/jpeg")
                    .multiPart("image_desc", "Ilustrasi Kesehatan Reproduksi")
                    .multiPart("content", "Kesehatan reproduksi wanita memiliki peran penting dalam menjaga kesejahteraan umum. Artikel ini memberikan berbagai tips untuk menjaga kesehatan reproduksi wanita")
                    .header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                    .post(setPostApiEndpointArticles());
        }

    @Step("I receive valid HTTP response code 201 Articles")
    public void receiveValidHttp201Articles() {
        restAssuredThat(response -> response.statusCode(201));
    }


    //Negative POST Articles invalid endpoint
    @Step("I set POST api endpoints ArticlesNeg1")
    public String setPostApiEndpointArticlesNeg1() {
        return url + "doctors/article";
    }

    @Step("I send POST HTTP request ArticlesNeg1")
    public void sendPostHttpRequestArticlesNeg1() {
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Tips Menjaga Kesehatan Reproduksi Wanita")
                .multiPart("tags", "reproduksi")
                .multiPart("reference", "World Health Organization")
                .multiPart("image", new File("src/test/resources/foto/artikel.jpg"), "image/jpeg")
                .multiPart("image_desc", "Ilustrasi Kesehatan Reproduksi")
                .multiPart("content", "Kesehatan reproduksi wanita memiliki peran penting dalam menjaga kesejahteraan umum. Artikel ini memberikan berbagai tips untuk menjaga kesehatan reproduksi wanita")
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .post(setPostApiEndpointArticlesNeg1());
    }


    //Positive PUT Articles with ID
    @Step("I set PUT api endpoints Article with ID")
    public String setPUTApiEndpointArticlesWithID() {
        return url + "doctors/articles/2e5301ee-9a1e-49ef-9d18-fab930108707";
    }

    @Step("I send PUT HTTP request Article with ID")
    public void sendPUTHttpRequestArticlesWithID() {
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Tips Menjaga Kesehatan Reproduksi Wanita")
                .multiPart("tags", "reproduksi")
                .multiPart("reference", "World Health Organization")
                .multiPart("image", new File("src/test/resources/foto/artikel.jpg"), "image/jpeg")
                .multiPart("image_desc", "Ilustrasi Kesehatan Reproduksi")
                .multiPart("content", "Kesehatan reproduksi wanita memiliki peran penting dalam menjaga kesejahteraan umum. Artikel ini memberikan berbagai tips untuk menjaga kesehatan reproduksi wanita")
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .put(setPUTApiEndpointArticlesWithID());
    }

    //Negative PUT Articles with ID invalid endpoint
    @Step("I set PUT api endpoints Article with IDNeg1")
    public String setPUTApiEndpointArticlesWithIDNeg1() {
        return url + "doctors/article/2e5301ee-9a1e-49ef-9d18-fab930108707";
    }

    @Step("I send PUT HTTP request Article with IDNeg1")
    public void sendPUTHttpRequestArticlesWithIDNeg1() {
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("title", "Tips Menjaga Kesehatan Reproduksi Wanita")
                .multiPart("tags", "reproduksi")
                .multiPart("reference", "World Health Organization")
                .multiPart("image", new File("src/test/resources/foto/artikel.jpg"), "image/jpeg")
                .multiPart("image_desc", "Ilustrasi Kesehatan Reproduksi")
                .multiPart("content", "Kesehatan reproduksi wanita memiliki peran penting dalam menjaga kesejahteraan umum. Artikel ini memberikan berbagai tips untuk menjaga kesehatan reproduksi wanita")
                .header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .put(setPUTApiEndpointArticlesWithIDNeg1());
    }

    //Positive PUT doctors Published Articles
    @Step("I set PUT api endpoints Published Articles")
    public String setPUTApiEndpointArticlesPublishedArticles() {
        return url + "doctors/articles/2e5301ee-9a1e-49ef-9d18-fab930108707/publish";
    }

    @Step("I send PUT HTTP request Published Articles")
    public void sendPUTHttpRequestArticlePublishedArticles() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .put(setPUTApiEndpointArticlesPublishedArticles()).then().statusCode(200);
    }


    //Negative PUT doctors Published Articles invalid endpoint
    @Step("I set PUT api endpoints Published ArticlesNeg1")
    public String setPUTApiEndpointArticlesPublishedArticlesNeg1() {
        return url + "doctors/articles/2e5301ee-9a1e-49ef-9d18-fab930108707/publis";
    }

    @Step("I send PUT HTTP request Published ArticlesNeg1")
    public void sendPUTHttpRequestArticlePublishedArticlesNeg1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken)
                .contentType("application/json")
                .put(setPUTApiEndpointArticlesPublishedArticlesNeg1()).then().statusCode(404);
    }


    //Positive DELETE Articles with ID
    @Step("I set DELETE api endpoints Article with ID")
    public String setDELETEApiEndpointArticleWithID(){
        return url + "doctors/articles/fafe2ddf-c9d2-41bd-8680-4c3860462dbe";
    }

    @Step("I send DELETE HTTP request Article with ID")
    public void sendDELETEHTTPrequestArticleWithID(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).delete(setDELETEApiEndpointArticleWithID()).then().statusCode(200);
    }

    //Negative DELETE Articles with ID invalid endpoint
    @Step("I set DELETE api endpoints Article with ID Neg1")
    public String setDELETEApiEndpointArticleWithIDNeg1(){
        return url + "doctors/article/0dcf2c99-3a42-4af3-b363-66ae3d90ec78";
    }

    @Step("I send DELETE HTTP request Article with ID Neg1")
    public void sendDELETEHTTPrequestArticleWithIDNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).delete(setDELETEApiEndpointArticleWithIDNeg1()).then().statusCode(404);
    }

    @Step("I receive valid HTTP response code 404 ArticleNeg1")
    public void receiveValidHttp404Articles() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
