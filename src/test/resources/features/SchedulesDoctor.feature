Feature: Schedules Doctor

  As a user
  I want to see the Schedules Doctor
  So that I can make see Schedules Doctor

  Scenario: GET all Schedules
    Given I set GET api endpoints Schedules
    When I send GET HTTP request Schedules
    Then I receive valid HTTP response code 200 Schedules


  Scenario: GET all Schedules invalid endpoint
    Given I set GET api endpoints SchedulesNeg1
    When I send GET HTTP request SchedulesNeg1
    Then I receive valid HTTP response code 400 SchedulesNeg1


  Scenario: PUT Doctor Inactive
    Given I set PUT endpoints Doctor Inactive
    When I send PUT HTTP request Doctor Inactive
    Then I receive valid HTTP response code 200 Doctor Inactive

  Scenario: PUT Doctor Inactive invalid endpoint
    Given I set PUT endpoints Doctor InactiveNeg1
    When I send PUT HTTP request Doctor InactiveNeg1
    Then I receive valid HTTP response code 404 Doctor

  Scenario: PUT Doctor Active
    Given I set PUT endpoints Doctor Active
    When I send PUT HTTP request Doctor Active
    Then I receive valid HTTP response code 200 Doctor Active


  Scenario: PUT Doctor Active invalid endpoint
    Given I set PUT endpoints Doctor ActiveNeg1
    When I send PUT HTTP request Doctor ActiveNeg1
    Then I receive valid HTTP response code 404 Doctor