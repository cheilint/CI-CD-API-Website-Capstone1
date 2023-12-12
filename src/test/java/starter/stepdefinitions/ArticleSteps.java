package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.ArticlePage;

public class ArticleSteps {

    @Steps
    ArticlePage articlePage;

    @Given("I set GET api endpoints Article")
    public void ISetGETApiEndpointsArticle() {
        articlePage.setGetApiEndpointArticle();
    }

    @When("I send GET HTTP request Article")
    public void sendGetHttpRequestArticle() {
        articlePage.sendGetHttpRequestArticle();
    }

    @Then("I receive valid HTTP response code 200 Article")
    public void receiveValidHttp200Article() {
        articlePage.receiveValidHttp200Article();
    }



    //Negative GET articles invalid endpoint
    @Given("I set GET api endpoints ArticleNeg1")
    public void ISetGETApiEndpointsArticleNeg1() {
        articlePage.setGetApiEndpointArticleNeg1();
    }

    @When("I send GET HTTP request ArticleNeg1")
    public void sendGetHttpRequestArticleNeg1() {
        articlePage.sendGetHttpRequestArticleNeg1();
    }

    @Then("I receive valid HTTP response code 400 ArticleNeg1")
    public void receiveValidHttp400ArticleNeg1() {
        articlePage.receiveValidHttp400ArticleNeg1();
    }



    //Positive GET Article with ID
    @Given("I set GET api endpoints Article with ID")
    public void ISetGETApiEndpointsArticleWithID() {
        articlePage.setGetApiEndpointArticleWithID();
    }

    @When("I send GET HTTP request Article with ID")
    public void sendGetHttpRequestArticleWithID() {
        articlePage.sendGetHttpRequestArticleWithID();
    }




    //Negative GET articles invalid endpoint
    @Given("I set GET api endpoints Article with ID Neg1")
    public void ISetGETApiEndpointsArticleWithIDNeg1() {
        articlePage.setGetApiEndpointArticleWithIDNeg1();
    }

    @When("I send GET HTTP request Article with ID Neg1")
    public void sendGetHttpRequestArticleWithIDNeg1() {
        articlePage.sendGetHttpRequestArticleWithIDNeg1();
    }


    //Positive POST Articles
    @Given("I set POST api endpoints Articles")
    public void setPostApiEndpointArticles() {
        articlePage.setPostApiEndpointArticles();
    }

    @When("I send POST HTTP request Articles")
    public void sendPostHttpRequestArticles() {
        articlePage.sendPostHttpRequestArticles();
    }

    @Then("I receive valid HTTP response code 201 Articles")
    public void receiveValidHttp201Articles() {
        articlePage.receiveValidHttp201Articles();
    }


    //Negative POST Articles invalid endpoint
    @Given("I set POST api endpoints ArticlesNeg1")
    public void setPostApiEndpointArticlesNeg1() {
        articlePage.setPostApiEndpointArticlesNeg1();
    }

    @When("I send POST HTTP request ArticlesNeg1")
    public void sendPostHttpRequestArticlesNeg1() {
        articlePage.sendPostHttpRequestArticlesNeg1();
    }


    //Positive PUT Articles with ID
    @Given("I set PUT api endpoints Article with ID")
    public void setPUTApiEndpointArticlesWithID() {
        articlePage.setPUTApiEndpointArticlesWithID();
    }

    @When("I send PUT HTTP request Article with ID")
    public void sendPUTHttpRequestArticlesWithID() {
        articlePage.sendPUTHttpRequestArticlesWithID();
    }

    //Negative PUT Articles with ID invalid endpoint
    @Given("I set PUT api endpoints Article with IDNeg1")
    public void Neg1() {
        articlePage.setPUTApiEndpointArticlesWithIDNeg1();
    }

    @When("I send PUT HTTP request Article with IDNeg1")
    public void sendPUTHttpRequestArticlesWithIDNeg1() {
        articlePage.sendPUTHttpRequestArticlesWithIDNeg1();
    }


    //Positive PUT Articles with ID
    @Given("I set PUT api endpoints Published Articles")
    public void setPUTApiEndpointArticlesPublishedArticles() {
        articlePage.setPUTApiEndpointArticlesPublishedArticles();
    }

    @When("I send PUT HTTP request Published Articles")
    public void sendPUTHttpRequestArticlePublishedArticles() {
        articlePage.sendPUTHttpRequestArticlePublishedArticles();
    }

    //Negative PUT Articles with ID invalid endpoint
    @Given("I set PUT api endpoints Published ArticlesNeg1")
    public void setPUTApiEndpointArticlesPublishedArticlesNeg1() {
        articlePage.setPUTApiEndpointArticlesPublishedArticlesNeg1();
    }

    @When("I send PUT HTTP request Published ArticlesNeg1")
    public void sendPUTHttpRequestArticlePublishedArticlesNeg1() {
        articlePage.sendPUTHttpRequestArticlePublishedArticlesNeg1();
    }


    //Positive DELETE Articles with ID
    @Given("I set DELETE api endpoints Article with ID")
    public void setDELETEApiEndpointArticleWithID() {
        articlePage.setDELETEApiEndpointArticleWithID();
    }

    @When("I send DELETE HTTP request Article with ID")
    public void sendDELETEHTTPrequestArticleWithID() {
        articlePage.sendDELETEHTTPrequestArticleWithID();
    }

    //Negative DELETE Articles with ID invalid endpoint
    @Given("I set DELETE api endpoints Article with ID Neg1")
    public void setDELETEApiEndpointArticleWithIDNeg1() {
        articlePage.setDELETEApiEndpointArticleWithIDNeg1();
    }

    @When("I send DELETE HTTP request Article with ID Neg1")
    public void sendDELETEHTTPrequestArticleWithIDNeg1() {
        articlePage.sendDELETEHTTPrequestArticleWithIDNeg1();
    }

    @Then("I receive valid HTTP response code 404 ArticleNeg1")
    public void receiveValidHttp404Articles() {
        articlePage.receiveValidHttp404Articles();
    }
}
