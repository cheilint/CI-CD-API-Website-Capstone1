package starter.java;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DashboardPage {
    protected static String url = "https://dev.reprohealth.my.id/";

    //Positive GET Count Data For One Month
    @Step("I set GET api endpoints Count Data For One Month")
    public String ISetGETApiEndpointsCountDataForOneMonth(){
        return url + "doctors/dashboard/data-count-one-month";
    }
    @Step("I send GET HTTP request Count Data For One Month")
    public void IsendGETHTTPrequestCountDataForOneMonth(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsCountDataForOneMonth()).then().statusCode(200);
    }
    @Step("I receive valid HTTP response code 200  Count Data")
    public void iReceiveValidHTTPResponseCode200CountData(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative GET Count Data For One Month invalid endpoint
    @Step("I set GET api endpoints Count Data For One MonthNeg1")
    public String ISetGETApiEndpointsCountDataForOneMonthNeg1(){
        return url + "doctors/dashboar/data-count-one-month";
    }
    @Step("I send GET HTTP request Count Data For One MonthNeg1")
    public void IsendGETHTTPrequestCountDataForOneMonthNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsCountDataForOneMonthNeg1()).then().statusCode(400);
    }
    @Step("I receive valid HTTP response code 400  Count Data")
    public void iReceiveValidHTTPResponseCode400CountData(){
        restAssuredThat(response -> response.statusCode(400));
    }


    //Positive GET Count Data For One Week
    @Step("I set GET api endpoints Count Data For One Week")
    public String ISetGETApiEndpointsCountDataForOneWeek(){
        return url + "doctors/dashboard/data-count-one-week";
    }

    @Step("I send GET HTTP request Count Data For One Week")
    public void IsendGETHTTPrequestCountDataForOneWeek(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsCountDataForOneWeek()).then().statusCode(200);
    }


    //Negative GET Count Data For One Week invalid endpoint
    @Step("I set GET api endpoints Count Data For One WeekNeg1")
    public String ISetGETApiEndpointsCountDataForOneWeekNeg1(){
        return url + "doctors/dashboar/data-count-one-week";
    }

    @Step("I send GET HTTP request Count Data For One WeekNeg1")
    public void IsendGETHTTPrequestCountDataForOneWeekNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsCountDataForOneWeekNeg1()).then().statusCode(400);
    }


    //Positive GET Count Data For One Day
    @Step("I set GET api endpoints Count Data For One Day")
    public String ISetGETApiEndpointsCountDataForOneDay(){
        return url + "doctors/dashboard/data-count-one-day";
    }

    @Step("I send GET HTTP request Count Data For One Day")
    public void IsendGETHTTPrequestCountDataForOneDay(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsCountDataForOneDay()).then().statusCode(200);
    }

    //Negative GET Count Data For One Day invalid endpoint
    @Step("I set GET api endpoints Count Data For One DayNeg1")
    public String ISetGETApiEndpointsCountDataForOneDayNeg1(){
        return url + "doctors/dashboar/data-count-one-day";
    }

    @Step("I send GET HTTP request Count Data For One DayNeg1")
    public void IsendGETHTTPrequestCountDataForOneDayNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsCountDataForOneDayNeg1()).then().statusCode(400);
    }


    //Positive GET Graph
    @Step("I set GET api endpoints Graph")
    public String ISetGETApiEndpointsGraph(){
        return url + "doctors/dashboard/graph";
    }

    @Step("I send GET HTTP request Graph")
    public void IsendGETHTTPrequestGraph(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsGraph()).then().statusCode(200);
    }

    @Step("I receive valid HTTP response code 200 Graph")
    public void iReceiveValidHTTPResponseCode200Graph(){
        restAssuredThat(response -> response.statusCode(200));
    }


    //Negative GET Graph invalid endpoint
    @Step("I set GET api endpoints GraphNeg1")
    public String ISetGETApiEndpointsGraphNeg1(){
        return url + "doctors/dashboard/grap";
    }

    @Step("I send GET HTTP request GraphNeg1")
    public void IsendGETHTTPrequestGraphNeg1(){
        SerenityRest.given().header("Authorization", "Bearer " + Token_AuthenticationPage.authToken).get(ISetGETApiEndpointsGraphNeg1()).then().statusCode(400);
    }

    @Step("I receive valid HTTP response code 400 Graph")
    public void iReceiveValidHTTPResponseCode400Graph(){
        restAssuredThat(response -> response.statusCode(400));
    }


}
