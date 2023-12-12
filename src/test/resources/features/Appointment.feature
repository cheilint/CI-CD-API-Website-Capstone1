Feature: Appointment

  As a user
  I want to see the Appointment
  So I can see the Appointment


  Scenario: GET - GET all Appointment
    Given I set GET api endpoints consultation schedules
    When I send GET HTTP request consultation schedules
    Then I receive valid HTTP response code 200 consultation schedules

  Scenario: GET - GET all Appointment invalid endpoint
    Given I set GET api endpoints consultation schedulesNeg1
    When I send GET HTTP request consultation schedulesNeg1
    Then I receive valid HTTP response code 400 consultation schedulesNeg1

  Scenario: GET - GET Detail Appointment
    Given I set GET api endpoints Detail Appointment
    When I send GET HTTP request Detail Appointment
    Then I receive valid HTTP response code 200 Detail Appointment

  Scenario: GET - GET Detail Appointment invalid endpoint
    Given I set GET api endpoints Detail AppointmentNeg1
    When I send GET HTTP request Detail AppointmentNeg1
    Then I receive valid HTTP response code 400 Detail AppointmentNeg1

  Scenario: GET - GET Detail Transaction
    Given I set GET api endpoints Detail Transaction
    When I send GET HTTP request Detail Transaction
    Then I receive valid HTTP response code 200 Detail Transaction

  Scenario: GET - GET Detail Transaction invalid endpoint
    Given I set GET api endpoints Detail TransactionNeg1
    When I send GET HTTP request Detail TransactionNeg1
    Then I receive valid HTTP response code 400 Detail TransactionNeg1

  Scenario: PUT - PUT Confirm Consultation
    Given I set PUT api endpoints Confirm Consultation
    When I send PUT HTTP request Confirm Consultation
    Then I receive valid HTTP response code 200 Confirm Consultation

  Scenario: PUT - PUT Confirm Consultation invalid endpoint
    Given I set PUT api endpoints Confirm ConsultationNeg1
    When I send PUT HTTP request Confirm ConsultationNeg1
    Then I receive valid HTTP response code 404 Confirm ConsultationNeg1

  Scenario: PUT - PUT Finish Consultation
    Given I set PUT api endpoints Finish Consultation
    When I send PUT HTTP request Finish Consultation
    Then I receive valid HTTP response code 200 Finish Consultation

  Scenario: PUT - PUT Finish Consultation invalid endpoint
    Given I set PUT api endpoints Finish ConsultationNeg1
    When I send PUT HTTP request Finish ConsultationNeg1
    Then I receive valid HTTP response code 404 Finish ConsultationNeg1

  Scenario: GET - GET Filter all consultation by Name
    Given I set GET api endpoints Filter all consultation by Name
    When I send GET HTTP request Filter all consultation by Name
    Then I receive valid HTTP response code 200 Filter all consultation by Name

  Scenario: GET - GET Filter all consultation by Name invalid endpoint
    Given I set GET api endpoints Filter all consultation by NameNeg1
    When I send GET HTTP request Filter all consultation by NameNeg1
    Then I receive valid HTTP response code 404 Filter all consultation by NameNeg1

  Scenario: GET - GET  Filter all consultation by status
    Given I set GET api endpoints Filter all consultation by status
    When I send GET HTTP request Filter all consultation by status
    Then I receive valid HTTP response code 200 Filter all consultation by status

  Scenario: GET - Get Filter all consultation by status invalid endpoint
    Given I set GET api endpoints Filter all consultation by statusNeg1
    When I send GET HTTP request Filter all consultation by statusNeg1
    Then I receive valid HTTP response code 404 Filter all consultation by statusNeg1

  Scenario: GET - Get Filter all consultation by Name and status
    Given I set GET api endpoints Filter all consultation by Name and status
    When I send GET HTTP request Filter all consultation by Name and status
    Then I receive valid HTTP response code 200 Filter all consultation by Name and status

  Scenario: GET - Get Filter all consultation by Name and status invalid endpoint
    Given I set GET api endpoints Filter all consultation by Name and statusNeg1
    When I send GET HTTP request Filter all consultation by Name and statusNeg1
    Then I receive valid HTTP response code 404 Filter all consultation by Name and statusNeg1
