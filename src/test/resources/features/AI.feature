Feature: AI Chatbot

  As a user
  I want to see the AI Chatbot
  So that I can make see AI Chatbot


  Scenario: POST  Doctor Chat
    Given I set POST api endpoints Doctor Chatbot
    When I send POST HTTP request Doctor Chatbot
    Then I receive valid HTTP response code 200 Chatbot


  Scenario: GET Chatbot History From Doctor ID
    Given I set GET api endpoints Chatbot History From Doctor ID
    When I send GET HTTP request Chatbot History From Doctor ID
    Then I receive valid HTTP response code 200 Chatbot


  Scenario: GET Chatbot History From Doctor ID invalid endpoint
    Given I set GET api endpoints Chatbot History From Doctor ID Neg1
    When I send GET HTTP request Chatbot History From Doctor ID Neg1
    Then I receive valid HTTP response code 400 ChatbotNeg1


  Scenario: GET Chatbot History From Session ID
    Given I set GET api endpoints Chatbot History From Session ID
    When I send GET HTTP request Chatbot History From Session ID
    Then I receive valid HTTP response code 200 Chatbot


  Scenario: GET Chatbot History From Session ID invalid endpoint
    Given I set GET api endpoints Chatbot History From Session ID Neg1
    When I send GET HTTP request Chatbot History From Session ID Neg1
    Then I receive valid HTTP response code 400 ChatbotNeg1