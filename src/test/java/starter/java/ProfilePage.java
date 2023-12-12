package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ProfilePage {

    protected String url = "https://dev.reprohealth.my.id/";

    @Step("I set GET api endpoints Profile")
    public String setGetApiEndpointProfile() {
        return url + "doctors/profile";
    }

    @Step("I send GET HTTP request Profile")
    public void sendGetHttpRequestProfile() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointProfile()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Profil")
    public void receiveValidHttp200Profile() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //negative Profile
    @Step("I set Get api endpoints Profile1")
    public String setGetApiEndpointProfile1() {
        return url + "doctor/profilee";
    }

    @Step("I send Get HTTP request Profile1")
    public void sendGetHttpRequestProfile1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointProfile1()).then().statusCode(404);
    }

    @Step("Then I receive valid HTTP response code 404 Profile")
    public void receiveValidHttp404Profile() {
        restAssuredThat(response -> response.statusCode(404));
    }


    //Positive work histories
    @Step("I set GET api endpoints work histories")
    public String setGetApiEndpointworkhistories() {
        return url + "doctors/profile/work-histories";
    }

    @Step("I send GET HTTP request work histories")
    public void sendGetHttpRequestworkhistories() {
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointworkhistories()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 work histories")
    public void receiveValidHttp200workhistories() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //negative work histories
    @Step("I set Get api endpoints work histories1")
    public String setGetApiEndpointworkhistories1() {
        return url + "doctors/profile/work-historiess";
    }

    @Step("I send Get HTTP request work histories1")
    public void sendGetHttpRequestworkhistories1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointworkhistories1()).then().statusCode(400);
    }

    @Step("Then I receive valid HTTP response code 400 work histories1")
    public void receiveValidHttp404workhistories1() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Positive Education
    @Step("I set GET api endpoints Education")
    public String setGetApiEndpointEducation() {
        return url + "doctors/profile/educations";
    }

    @Step("I send GET HTTP request Education")
    public void sendGetHttpRequestEducation() {
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointEducation()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Education")
    public void receiveValidHttp200Education() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //negative Education
    @Step("I set Get api endpoints Education1")
    public String setGetApiEndpointEducation1() {
        return url + "doctors/profile/educationss";
    }

    @Step("I send Get HTTP request Education1")
    public void sendGetHttpRequestEducation1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointEducation1()).then().statusCode(400);
    }

    @Step("Then I receive valid HTTP response code 400 Education1")
    public void receiveValidHttp404Education1() {
        restAssuredThat(response -> response.statusCode(400));
    }


    //Positive certifications
    @Step("I set GET api endpoints certifications")
    public String setGetApiEndpointcertifications() {
        return url + "doctors/profile/certifications";
    }

    @Step("I send GET HTTP request certifications")
    public void sendGetHttpRequestcertifications() {
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointcertifications()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 certifications")
    public void receiveValidHttp200certifications() {
        restAssuredThat(response -> response.statusCode(200));
    }


    //negative certifications
    @Step("I set Get api endpoints certifications1")
    public String setGetApiEndpointcertifications1() {
        return url + "doctors/profile/certificationss";
    }

    @Step("I send Get HTTP request certifications1")
    public void sendGetHttpRequestcertifications1() {

        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(setGetApiEndpointcertifications1()).then().statusCode(400);
    }
    @Step("Then I receive valid HTTP response code 400 certifications1")
    public void receiveValidHttp404certifications1() {
        restAssuredThat(response -> response.statusCode(400));
    }
}


