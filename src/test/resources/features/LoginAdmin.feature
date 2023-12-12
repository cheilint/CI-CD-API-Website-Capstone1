Feature: Login Admin

  As a Admin
  I want to see the homepage
  So that I can request to the api endpoints to login

  Scenario: POST - Login with valid data Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdmin
    Then I receive valid HTTP response code 200 loginAdmin


  Scenario: POST - Login with empty email Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdminNeg1
    Then I receive valid HTTP response code 400 loginAdmin


  Scenario: POST - Login empty password Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdminNeg2
    Then I receive valid HTTP response code 400 loginAdmin


  Scenario: POST - Login with empty body parameter Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdminNeg3
    Then I receive valid HTTP response code 400 loginAdmin


  Scenario: POST - Login wrong password Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdminNeg4
    Then I receive valid HTTP response code 404 loginAdmin



  Scenario: POST - Login using an incorrectly formatted email Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdminNeg5
    Then I receive valid HTTP response code 404 login


  Scenario: POST - User login using invalid Email and invalid Password Admin
    Given I set POST api endpoints loginAdmin
    When I send POST HTTP request loginAdminNeg6
    Then I receive valid HTTP response code 404 loginAdmin

