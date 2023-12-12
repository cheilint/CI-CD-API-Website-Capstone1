package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.ProfilePage;

public class ProfileSteps {

    @Steps
    ProfilePage profile;


    @Given("I set GET api endpoints Profile")
    public void setGetApiEndpointProfile() {
        profile.setGetApiEndpointProfile();
    }

    @When("I send GET HTTP request Profile")
    public void sendGetHttpRequestProfile() {
        profile.sendGetHttpRequestProfile();
    }

    @Then("I receive valid HTTP response code 200 Profile")
    public void receiveValidHttp200Profile() {
        profile.receiveValidHttp200Profile();
    }

    //NEGATIVE Profile
    @Given("I set Get api endpoints Profile1")
    public void setGetApiEndpointProfile1() {
        profile.setGetApiEndpointProfile1();
    }

    @When("I send Get HTTP request Profile1")
    public void sendGetHttpRequestProfile1() {
        profile.sendGetHttpRequestProfile1();
    }

    @Then("I receive valid HTTP response code 404 Profile")
    public void receiveValidHttp404Profile() {
        profile.receiveValidHttp404Profile();
    }


    //positive work histories
    @Given("I set GET api endpoints work histories")
    public void setGetApiEndpointworkhistories() {
        profile.setGetApiEndpointworkhistories();
    }

    @When("I send GET HTTP request work histories")
    public void sendGetHttpRequestworkhistories() {
        profile.sendGetHttpRequestworkhistories();
    }

    @Then("I receive valid HTTP response code 200 work histories")
    public void receiveValidHttp200workhistories() {
        profile.receiveValidHttp200workhistories();
    }


    //NEGATIVE work histories
    @Given("I set Get api endpoints work histories1")
    public void setGetApiEndpointworkhistories1() {
        profile.setGetApiEndpointworkhistories1();
    }

    @When("I send Get HTTP request work histories1")
    public void sendGetHttpRequestworkhistories1() {
        profile.sendGetHttpRequestworkhistories1();
    }

    @Then("I receive valid HTTP response code 400 work histories1")
    public void receiveValidHttp404workhistories1() {
        profile.receiveValidHttp404workhistories1();
    }

    //positive Education
    @Given("I set GET api endpoints Education")
    public void setGetApiEndpointEducation() {
        profile.setGetApiEndpointEducation();
    }

    @When("I send GET HTTP request Education")
    public void sendGetHttpRequestEducation() {
        profile.sendGetHttpRequestEducation();
    }

    @Then("I receive valid HTTP response code 200 Education")
    public void receiveValidHttp200Education() {
        profile.receiveValidHttp200Education();
    }


    //NEGATIVE Education
    @Given("I set Get api endpoints Education1")
    public void setGetApiEndpointEducationEducation1() {
        profile.setGetApiEndpointEducation1();
    }

    @When("I send Get HTTP request Education1")
    public void sendGetHttpRequestEducation1() {
        profile.sendGetHttpRequestEducation1();
    }

    @Then("I receive valid HTTP response code 400 Education1")
    public void receiveValidHttp404Education1() {
        profile.receiveValidHttp404Education1();
    }

    //positive certifications
    @Given("I set GET api endpoints certifications")
    public void setGetApiEndpointcertifications() {
        profile.setGetApiEndpointcertifications();
    }

    @When("I send GET HTTP request certifications")
    public void sendGetHttpRequestcertifications() {
        profile.sendGetHttpRequestcertifications();
    }

    @Then("I receive valid HTTP response code 200 certifications")
    public void receiveValidHttp200certifications() {
        profile.receiveValidHttp200certifications();
    }


    //NEGATIVE certifications
    @Given("I set Get api endpoints certifications1")
    public void setGetApiEndpointEducationcertificationsEducation1() {
        profile.setGetApiEndpointcertifications1();
    }

    @When("I send Get HTTP request certifications1")
    public void sendGetHttpRequestcertifications1() {
        profile.sendGetHttpRequestcertifications1();
    }

    @Then("I receive valid HTTP response code 400 certifications1")
    public void receiveValidHttp404certifications1() {
        profile.receiveValidHttp404certifications1();
    }
}
