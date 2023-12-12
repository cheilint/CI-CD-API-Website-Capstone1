Feature: Dashboard

  As a user
  I want to see the Dashboard
  So that I can make see Dashboard


  Scenario: GET Count Data For One Month
    Given I set GET api endpoints Count Data For One Month
    When I send GET HTTP request Count Data For One Month
    Then I receive valid HTTP response code 200  Count Data

  Scenario: GET Count Data For One Month invalid endpoint
    Given I set GET api endpoints Count Data For One MonthNeg1
    When I send GET HTTP request Count Data For One MonthNeg1
    Then I receive valid HTTP response code 400  Count Data


  Scenario: GET Count Data For One Week
    Given I set GET api endpoints Count Data For One Week
    When I send GET HTTP request Count Data For One Week
    Then I receive valid HTTP response code 200  Count Data

  Scenario: GET Count Data For One Week invalid endpoint
    Given I set GET api endpoints Count Data For One WeekNeg1
    When I send GET HTTP request Count Data For One WeekNeg1
    Then I receive valid HTTP response code 400  Count Data


  Scenario: GET Count Data For One Day
    Given I set GET api endpoints Count Data For One Day
    When I send GET HTTP request Count Data For One Day
    Then I receive valid HTTP response code 200  Count Data

  Scenario: GET Count Data For One Day invalid endpoint
    Given I set GET api endpoints Count Data For One DayNeg1
    When I send GET HTTP request Count Data For One DayNeg1
    Then I receive valid HTTP response code 400  Count Data


  Scenario: GET Graph
    Given I set GET api endpoints Graph
    When I send GET HTTP request Graph
    Then I receive valid HTTP response code 200 Graph

  Scenario: GET Graph invalid endpoint
    Given I set GET api endpoints GraphNeg1
    When I send GET HTTP request GraphNeg1
    Then I receive valid HTTP response code 400 Graph