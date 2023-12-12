Feature: Profile Admin

  As a admin
  I want to see the Profile
  So that I can make see Profile detail

  Scenario: POST -  POST Doctor Work History Admin
    Given I set POST api endpoints Work History Admin
    When I send POST HTTP request Work History Admin
    Then I receive valid HTTP response code 201 Work History Admin


  Scenario: PUT -  PUT Doctor Work History Admin
    Given I set PUT api endpoints Work History Admin
    When I send PUT HTTP request Work History Admin
    Then I receive valid HTTP response code 200 Work History Admin

  Scenario: DELETE - DELETE Doctor Work History Admin
    Given I set DELETE api endpoints Work History Admin
    When I send DELETE HTTP request Work History Admin
    Then I receive valid HTTP response code 200 Work History Admin

  Scenario: POST -  POST Doctor Education admin
    Given I set POST api endpoints Education admin
    When I send POST HTTP request Education admin
    Then I receive valid HTTP response code 200 Education admin


  Scenario: PUT -  PUT doctor education admin
    Given I set PUT api endpoints Education admin
    When I send PUT HTTP request Education admin
    Then I receive valid HTTP response code 200 Education admin

  Scenario: DELETE - DELETE doctor education Admin
    Given I set DELETE api endpoints Education Admin
    When I send DELETE HTTP request Education Admin
    Then I receive valid HTTP response code 200 Education admin


  Scenario: POST -  Post doctor Certification admin
    Given I set POST api endpoints Certification admin
    When I send POST HTTP request Certification admin
    Then I receive valid HTTP response code 201 Certification admin


  Scenario: PUT -  PUT doctor Certification admin
    Given I set PUT api endpoints Certification admin
    When I send PUT HTTP request Certification admin
    Then I receive valid HTTP response code 200 Certification admin

  Scenario: DELETE - DELETE doctor Certification admin
    Given I set DELETE api endpoints Certification Admin
    When I send DELETE HTTP request Certification Admin
    Then I receive valid HTTP response code 200 Certification admin