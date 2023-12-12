Feature: Login

  As a user
  I want to see the homepage
  So that I can request to the api endpoints to login



  Scenario: POST - Login with valid data
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200 login


  Scenario: POST - Login with empty email
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg1
    Then I receive valid HTTP response code 400 login


  Scenario: POST - Login empty password
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg2
    Then I receive valid HTTP response code 400 login


  Scenario: POST - Login with empty body parameter
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg3
    Then I receive valid HTTP response code 400 login

  Scenario: POST - Login wrong password
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg4
    Then I receive valid HTTP response code 404 login


  Scenario: POST - Login using an incorrectly formatted email.
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg5
    Then I receive valid HTTP response code 404 login


  Scenario: POST - User login using invalid Email and invalid Password
    Given I set POST api endpoints login
    When I send POST HTTP request loginNeg6
    Then I receive valid HTTP response code 404 login

