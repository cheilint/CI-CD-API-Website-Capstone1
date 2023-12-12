package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.java.DashboardPage;

public class DashboardSteps {

    @Steps
    DashboardPage dashboardPage;

    @Given("I set GET api endpoints Count Data For One Month")
    public void ISetGETApiEndpointsCountDataForOneMonth() {
        dashboardPage.ISetGETApiEndpointsCountDataForOneMonth();
    }

    @When("I send GET HTTP request Count Data For One Month")
    public void IsendGETHTTPrequestCountDataForOneMonth() {
        dashboardPage.IsendGETHTTPrequestCountDataForOneMonth();
    }

    @Then("I receive valid HTTP response code 200  Count Data")
    public void iReceiveValidHTTPResponseCode200CountData() {
        dashboardPage.iReceiveValidHTTPResponseCode200CountData();
    }

    //Negative GET Count Data For One Month invalid endpoint
    @Given("I set GET api endpoints Count Data For One MonthNeg1")
    public void ISetGETApiEndpointsCountDataForOneMonthNeg1() {
        dashboardPage.ISetGETApiEndpointsCountDataForOneMonthNeg1();
    }

    @When("I send GET HTTP request Count Data For One MonthNeg1")
    public void IsendGETHTTPrequestCountDataForOneMonthNeg1() {
        dashboardPage.IsendGETHTTPrequestCountDataForOneMonthNeg1();
    }

    @Then("I receive valid HTTP response code 400  Count Data")
    public void iReceiveValidHTTPResponseCode400CountData() {
        dashboardPage.iReceiveValidHTTPResponseCode400CountData();
    }

    //Positive GET Count Data For One Week
    @Given("I set GET api endpoints Count Data For One Week")
    public void ISetGETApiEndpointsCountDataForOneWeek() {
        dashboardPage.ISetGETApiEndpointsCountDataForOneWeek();
    }

    @When("I send GET HTTP request Count Data For One Week")
    public void IsendGETHTTPrequestCountDataForOneWeek() {
        dashboardPage.IsendGETHTTPrequestCountDataForOneWeek();
    }


    //Negative GET Count Data For One Week invalid endpoint
    @Given("I set GET api endpoints Count Data For One WeekNeg1")
    public void ISetGETApiEndpointsCountDataForOneWeekNeg1() {
        dashboardPage.ISetGETApiEndpointsCountDataForOneWeekNeg1();
    }

    @When("I send GET HTTP request Count Data For One WeekNeg1")
    public void IsendGETHTTPrequestCountDataForOneWeekNeg1() {
        dashboardPage.IsendGETHTTPrequestCountDataForOneWeekNeg1();
    }


    //Positive GET Count Data For One Day
    @Given("I set GET api endpoints Count Data For One Day")
    public void ISetGETApiEndpointsCountDataForOneDay() {
        dashboardPage.ISetGETApiEndpointsCountDataForOneDay();
    }

    @When("I send GET HTTP request Count Data For One Day")
    public void IsendGETHTTPrequestCountDataForOneDay() {
        dashboardPage.IsendGETHTTPrequestCountDataForOneDay();
    }


    //Negative GET Count Data For One Day invalid endpoint
    @Given("I set GET api endpoints Count Data For One DayNeg1")
    public void ISetGETApiEndpointsCountDataForOneDayNeg1() {
        dashboardPage.ISetGETApiEndpointsCountDataForOneDayNeg1();
    }

    @When("I send GET HTTP request Count Data For One DayNeg1")
    public void IsendGETHTTPrequestCountDataForOneDayNeg1() {
        dashboardPage.IsendGETHTTPrequestCountDataForOneDayNeg1();
    }

    //Positive GET Graph
    @Given("I set GET api endpoints Graph")
    public void ISetGETApiEndpointsGraph() {
        dashboardPage.ISetGETApiEndpointsGraph();
    }

    @When("I send GET HTTP request Graph")
    public void IsendGETHTTPrequestGraph() {
        dashboardPage.IsendGETHTTPrequestGraph();
    }

    @Then("I receive valid HTTP response code 200 Graph")
    public void iReceiveValidHTTPResponseCode200Graph() {
        dashboardPage.iReceiveValidHTTPResponseCode200Graph();
    }


    //Negative GET Graph invalid endpoint
    @Given("I set GET api endpoints GraphNeg1")
    public void ISetGETApiEndpointsGraphNeg1() {
        dashboardPage.ISetGETApiEndpointsGraphNeg1();
    }

    @When("I send GET HTTP request GraphNeg1")
    public void IsendGETHTTPrequestGraphNeg1() {
        dashboardPage.IsendGETHTTPrequestGraphNeg1();
    }

    @Then("I receive valid HTTP response code 400 Graph")
    public void iReceiveValidHTTPResponseCode400Graph() {
        dashboardPage.iReceiveValidHTTPResponseCode400Graph();
    }
}
