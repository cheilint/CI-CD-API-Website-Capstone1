package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.ProfileAdminPage;

public class ProfileAdminSteps {

    @Steps
    ProfileAdminPage profileAdminPage;

    @Given("I set POST api endpoints Work History Admin")
    public void setPostApiEndpointWorkHistoryAdmin() {
        profileAdminPage.setPostApiEndpointWorkHistoryAdmin();
    }

    @When("I send POST HTTP request Work History Admin")
    public void sendPostHttpRequestWorkHistoryAdmin() {
        profileAdminPage.sendPostHttpRequestWorkHistoryAdmin();
    }

    @Then("I receive valid HTTP response code 201 Work History Admin")
    public void receiveValidHttp201WorkHistoryAdmin() {
        profileAdminPage.receiveValidHttp201WorkHistoryAdmin();
    }

    //Positive PUT Doctor Work History Admin
    @Given("I set PUT api endpoints Work History Admin")
    public void setPUTApiEndpointWorkHistoryAdmin() {
        profileAdminPage.setPUTApiEndpointWorkHistoryAdmin();
    }

    @When("I send PUT HTTP request Work History Admin")
    public void sendPUTHTTPrequestWorkHistoryAdmin() {
        profileAdminPage.sendPUTHTTPrequestWorkHistoryAdmin();
    }

    @Then("I receive valid HTTP response code 200 Work History Admin")
    public void receiveValidHttp200WorkHistoryAdmin() {
        profileAdminPage.receiveValidHttp200WorkHistoryAdmin();
    }

    //Positive DELETE Doctor Work History Admin
    @Given("I set DELETE api endpoints Work History Admin")
    public void setDELETEApiEndpointWorkHistoryAdmin() {
        profileAdminPage.setDELETEApiEndpointWorkHistoryAdmin();
    }

    @When("I send DELETE HTTP request Work History Admin")
    public void sendDELETEHTTPrequestWorkHistoryAdmin() {
        profileAdminPage.sendDELETEHTTPrequestWorkHistoryAdmin();
    }

    //Positive POST Doctor Education admin
    @Given("I set POST api endpoints Education admin")
    public void setPOSTApiEndpointEducationAdmin() {
        profileAdminPage.setPOSTApiEndpointEducationAdmin();
    }

    @When("I send POST HTTP request Education admin")
    public void sendPOSTHTTPrequestEducationAdmin() {
        profileAdminPage.sendPOSTHTTPrequestEducationAdmin();
    }

    @Then("I receive valid HTTP response code 200 Education admin")
    public void receiveValidHttp200EducationAdmin() {
        profileAdminPage.receiveValidHttp200EducationAdmin();
    }

    //Positive PUT Doctor Education admin
    @Given("I set PUT api endpoints Education admin")
    public void setPUTApiEndpointEducationAdmin() {
        profileAdminPage.setPUTApiEndpointEducationAdmin();
    }

    @When("I send PUT HTTP request Education admin")
    public void sendPUTHTTPrequestEducationAdmin() {
        profileAdminPage.sendPUTHTTPrequestEducationAdmin();
    }


    //Positive DELETE Doctor Education Admin
    @Given("I set DELETE api endpoints Education Admin")
    public void setDELETEApiEndpointEducationAdmin() {
        profileAdminPage.setDELETEApiEndpointEducationAdmin();
    }

    @When("I send DELETE HTTP request Education Admin")
    public void sendDELETEHTTPrequestEducationAdmin() {
        profileAdminPage.sendDELETEHTTPrequestEducationAdmin();
    }


    //Positive POST Doctor Certification admin
    @Given("I set POST api endpoints Certification admin")
    public void setPOSTApiEndpointCertificationAdmin() {
        profileAdminPage.setPOSTApiEndpointCertificationAdmin();
    }

    @When("I send POST HTTP request Certification admin")
    public void sendPOSTHTTPrequestCertificationAdmin() {
        profileAdminPage.sendPOSTHTTPrequestCertificationAdmin();
    }

    @Then("I receive valid HTTP response code 201 Certification admin")
    public void receiveValidHttp201CertificationAdmin() {
        profileAdminPage.receiveValidHttp201CertificationAdmin();
    }

    //Positive PUT Doctor Certification admin
    @Given("I set PUT api endpoints Certification admin")
    public void setPUTApiEndpointCertificationAdmin() {
        profileAdminPage.setPUTApiEndpointCertificationAdmin();
    }

    @When("I send PUT HTTP request Certification admin")
    public void sendPUTHTTPrequestCertificationAdmin() {
        profileAdminPage.sendPUTHTTPrequestCertificationAdmin();
    }

    @Then("I receive valid HTTP response code 200 Certification admin")
    public void receiveValidHttp200CertificationAdmin() {
        profileAdminPage.receiveValidHttp200CertificationAdmin();
    }

    //Positive DELETE Doctor Certification Admin
    @Given("I set DELETE api endpoints Certification Admin")
    public void setDELETEApiEndpointCertificationAdmin() {
        profileAdminPage.setDELETEApiEndpointCertificationAdmin();
    }

    @When("I send DELETE HTTP request Certification Admin")
    public void sendDELETEHTTPrequestCertificationAdmin() {
        profileAdminPage.sendDELETEHTTPrequestCertificationAdmin();
    }


}
