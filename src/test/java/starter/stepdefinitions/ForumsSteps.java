package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.ForumsPage;

public class ForumsSteps {

    @Steps
    ForumsPage forumsPage;

    @Given("I set GET api endpoints Forums")
    public void ISetGETApiEndpointsForums() {
        forumsPage.ISetGETApiEndpointsForums();
    }

    @When("I send GET HTTP request Forums")
    public void IsendGETHTTPrequestForums() {
        forumsPage.IsendGETHTTPrequestForums();
    }

    @Then("I receive valid HTTP response code 200 Forums")
    public void iReceiveValidHTTPResponseCode200Forums() {
        forumsPage.iReceiveValidHTTPResponseCode200Forums();
    }

    //Negative GET forum invalid endpoint
    @Given("I set GET api endpoints ForumsNeg1")
    public void ISetGETApiEndpointsForumsNeg1() {
        forumsPage.ISetGETApiEndpointsForumsNeg1();
    }

    @When("I send GET HTTP request ForumsNeg1")
    public void IsendGETHTTPrequestForumsNeg1() {
        forumsPage.IsendGETHTTPrequestForumsNeg1();
    }

    @Then("I receive valid HTTP response code 400 ForumsNeg1")
    public void iReceiveValidHTTPResponseCode400ForumsNeg1() {
        forumsPage.iReceiveValidHTTPResponseCode400ForumsNeg1();
    }


    //Positive Get all forums by search
    @Given("I set GET api endpoints Forums by search")
    public void ISetGETApiEndpointsForumsBySearch() {
        forumsPage.ISetGETApiEndpointsForumsBySearch();
    }

    @When("I send GET HTTP request Forums by search")
    public void IsendGETHTTPrequestForumsbysearch() {
        forumsPage.IsendGETHTTPrequestForumsbysearch();
    }

    @Then("I receive valid HTTP response code 200 Forums by search")
    public void iReceiveValidHTTPResponseCode200Forumsbysearch() {
        forumsPage.iReceiveValidHTTPResponseCode200Forumsbysearch();
    }

    //Negative Get all forums by search invalid endpoint
    @Given("I set GET api endpoints Forums by searchNeg1")
    public void ISetGETApiEndpointsForumsBySearchNeg1() {
        forumsPage.ISetGETApiEndpointsForumsBySearchNeg1();
    }

    @When("I send GET HTTP request Forums by searchNeg1")
    public void IsendGETHTTPrequestForumsbysearchNeg1() {
        forumsPage.IsendGETHTTPrequestForumsbysearchNeg1();
    }

    @Then("I receive valid HTTP response code 400 Forums by searchNeg1")
    public void iReceiveValidHTTPResponseCode400ForumsbysearchNeg1() {
        forumsPage.iReceiveValidHTTPResponseCode400ForumsbysearchNeg1();
    }

    //Positive Get Detail forums
    @Given("I set GET api endpoints Detail forums")
    public void ISetGETApiEndpointsDetailforums() {
        forumsPage.ISetGETApiEndpointsDetailforums();
    }

    @When("I send GET HTTP request Detail forums")
    public void IsendGETHTTPrequestDetailforums() {
        forumsPage.IsendGETHTTPrequestDetailforums();
    }

    @Then("I receive valid HTTP response code 200 Detail forums")
    public void iReceiveValidHTTPResponseCode200Detailforums() {
        forumsPage.iReceiveValidHTTPResponseCode200Detailforums();
    }

    //Negative Get Detail forums invalid endpoint
    @Given("I set GET api endpoints Detail forumsNeg1")
    public void ISetGETApiEndpointsDetailforumsNeg1() {
        forumsPage.ISetGETApiEndpointsDetailforumsNeg1();
    }

    @When("I send GET HTTP request Detail forumsNeg1")
    public void IsendGETHTTPrequestDetailforumsNeg1() {
        forumsPage.IsendGETHTTPrequestDetailforumsNeg1();
    }

    @Then("I receive valid HTTP response code 400 Detail forumsNeg1")
    public void iReceiveValidHTTPResponseCode400DetailforumsNeg1() {
        forumsPage.iReceiveValidHTTPResponseCode400DetailforumsNeg1();
    }


    //Positive POST forum replies
    @Given("I set POST endpoints Forum Replies")
    public void setPostApiEndpointForumReplies() {
        forumsPage.setPostApiEndpointForumReplies();
    }

    @When("I send POST HTTP request Forum Replies")
    public void sendPostHttpRequestForumReplies() {
        forumsPage.sendPostHttpRequestForumReplies();
    }

    @Then("I receive valid HTTP response code 200 Forum Replies")
    public void receiveValidHttp200ForumReplies() {
        forumsPage.receiveValidHttp200ForumReplies();
    }


    //Negative POST forum replies invalid endpoint
    @Given("I set POST endpoints Forum RepliesNeg1")
    public void setPostApiEndpointForumRepliesNeg1() {
        forumsPage.setPostApiEndpointForumRepliesNeg1();
    }

    @When("I send POST HTTP request Forum RepliesNeg1")
    public void sendPostHttpRequestForumRepliesNeg1() {
        forumsPage.sendPostHttpRequestForumRepliesNeg1();
    }

    @Then("I receive valid HTTP response code 404 Forum RepliesNeg1")
    public void receiveValidHttp404ForumRepliesNeg1() {
        forumsPage.receiveValidHttp404ForumRepliesNeg1();
    }


    //Positive PUT forum replies
    @Given("I set PUT endpoints Forum Replies")
    public void setPUTApiEndpointForumReplies() {
        forumsPage.setPUTApiEndpointForumReplies();
    }

    @When("I send PUT HTTP request Forum Replies")
    public void sendPUTHTTPrequestForumReplies() {
        forumsPage.sendPUTHTTPrequestForumReplies();
    }

    //Positive PUT forum replies invalid endpoint
    @Given("I set PUT endpoints Forum RepliesNeg1")
    public void setPUTApiEndpointForumRepliesNeg1() {
        forumsPage.setPUTApiEndpointForumRepliesNeg1();
    }

    @When("I send PUT HTTP request Forum RepliesNeg1")
    public void sendPUTHTTPrequestForumRepliesNeg1() {
        forumsPage.sendPUTHTTPrequestForumRepliesNeg1();
    }




    //Positive DELETE forum replies
    @Given("I set DELETE endpoints Forum Replies")
    public void setDELETEApiEndpointForumReplies() {
        forumsPage.setDELETEApiEndpointForumReplies();
    }

    @When("I send DELETE HTTP request Forum Replies")
    public void sendDELETEHTTPrequestForumReplies() {
        forumsPage.sendDELETEHTTPrequestForumReplies();
    }

    //Positive DELETE forum replies
    @Given("I set DELETE endpoints Forum RepliesNeg1")
    public void setDELETEApiEndpointForumRepliesNeg1() {
        forumsPage.setDELETEApiEndpointForumRepliesNeg1();
    }

    @When("I send DELETE HTTP request Forum RepliesNeg1")
    public void sendDELETEHTTPrequestForumRepliesNeg1() {
        forumsPage.sendDELETEHTTPrequestForumRepliesNeg1();
    }
}

