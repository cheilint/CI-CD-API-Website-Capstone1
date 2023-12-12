Feature: Specialists Doctors

  As a Admin
  I want to see the Specialists Doctors
  So that I can make see Specialists Doctors


  Scenario: GET All Specialists (Admin)
    Given I set GET api endpoints Specialists
    When I send GET HTTP request Specialists
    Then I receive valid HTTP response code 200 Specialists


  Scenario: GET All Specialists invalid endpoint (Admin)
    Given I set GET api endpoints SpecialistsNeg1
    When I send GET HTTP request SpecialistsNeg1
    Then I receive valid HTTP response code 404 SpecialistsNeg1


  Scenario: POST new Specialists (Admin)
    Given I set POST api endpoints Specialists
    When I send POST HTTP request Specialists
    Then I receive valid HTTP response code 201 Specialists

  Scenario: POST new Specialists invalid endpoint (Admin)
    Given I set POST api endpoints SpecialistsNeg1
    When I send POST HTTP request SpecialistsNeg1
    Then I receive valid HTTP response code 404 SpecialistsNeg1


  Scenario:  PUT Specialists Data (Admin)
    Given I set PUT api endpoints Specialists
    When I send PUT HTTP request Specialists
    Then I receive valid HTTP response code 200 Specialists

  Scenario:  PUT Specialists Data  invalid endpoint  (Admin)
    Given I set PUT api endpoints SpecialistsNeg1
    When I send PUT HTTP request SpecialistsNeg1
    Then I receive valid HTTP response code 404 SpecialistsNeg1


  Scenario:   DELETE Specialists Data With ID (Admin)
    Given I set DELETE api endpoints Specialists
    When I send DELETE HTTP request Specialists
    Then I receive valid HTTP response code 200 Specialists

  Scenario:   DELETE Specialists Data With ID invalid endpoint (Admin)
    Given I set DELETE api endpoints SpecialistsNeg1
    When I send DELETE HTTP request SpecialistsNeg1
    Then I receive valid HTTP response code 404 SpecialistsNeg1