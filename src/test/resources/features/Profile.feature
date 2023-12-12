Feature: Profile

  As a user
  I want to see the Profile
  So that I can make see Profile detail


    Scenario: GET Profile
    Given I set GET api endpoints Profile
    When I send GET HTTP request Profile
    Then I receive valid HTTP response code 200 Profile

  Scenario: GET Profile using invalid endpoint
    Given I set Get api endpoints Profile1
    When I send Get HTTP request Profile1
    Then I receive valid HTTP response code 404 Profile

  Scenario: GET work histories
    Given I set GET api endpoints work histories
    When I send GET HTTP request work histories
    Then I receive valid HTTP response code 200 work histories

  Scenario: GET work histories using invalid endpoint
    Given I set Get api endpoints work histories1
    When I send Get HTTP request work histories1
    Then I receive valid HTTP response code 400 work histories1

  Scenario: GET Education
    Given I set GET api endpoints Education
    When I send GET HTTP request Education
    Then I receive valid HTTP response code 200 Education

  Scenario: GET Education using invalid endpoint
    Given I set Get api endpoints Education1
    When I send Get HTTP request Education1
    Then I receive valid HTTP response code 400 Education1

  Scenario: Get certifications
    Given I set GET api endpoints certifications
    When I send GET HTTP request certifications
    Then I receive valid HTTP response code 200 certifications

  Scenario: Get certifications using invalid endpoint
    Given I set Get api endpoints certifications1
    When I send Get HTTP request certifications1
    Then I receive valid HTTP response code 400 certifications1