Feature: Forums

  As a user
  I want to see the Forums
  So that I can make see Forums


  Scenario: GET Forums
    Given I set GET api endpoints Forums
    When I send GET HTTP request Forums
    Then I receive valid HTTP response code 200 Forums

  Scenario: GET forum invalid endpoint
    Given I set GET api endpoints ForumsNeg1
    When I send GET HTTP request ForumsNeg1
    Then I receive valid HTTP response code 400 ForumsNeg1

  Scenario: Get all forums by search
    Given I set GET api endpoints Forums by search
    When I send GET HTTP request Forums by search
    Then I receive valid HTTP response code 200 Forums by search

  Scenario: Get all forums by search invalid endpoint
    Given I set GET api endpoints Forums by searchNeg1
    When I send GET HTTP request Forums by searchNeg1
    Then I receive valid HTTP response code 400 Forums by searchNeg1

  Scenario: Get Detail forums
    Given I set GET api endpoints Detail forums
    When I send GET HTTP request Detail forums
    Then I receive valid HTTP response code 200 Detail forums

  Scenario: Get Detail forums invalid endpoint
    Given I set GET api endpoints Detail forumsNeg1
    When I send GET HTTP request Detail forumsNeg1
    Then I receive valid HTTP response code 400 Detail forumsNeg1

  Scenario: POST forum replies
    Given I set POST endpoints Forum Replies
    When I send POST HTTP request Forum Replies
    Then I receive valid HTTP response code 200 Forum Replies

  Scenario: POST forum replies invalid endpoint
    Given I set POST endpoints Forum RepliesNeg1
    When I send POST HTTP request Forum RepliesNeg1
    Then I receive valid HTTP response code 404 Forum RepliesNeg1

  Scenario: PUT forum replies
    Given I set PUT endpoints Forum Replies
    When I send PUT HTTP request Forum Replies
    Then I receive valid HTTP response code 200 Forum Replies

  Scenario: PUT forum replies invalid endpoint
    Given I set PUT endpoints Forum RepliesNeg1
    When I send PUT HTTP request Forum RepliesNeg1
    Then I receive valid HTTP response code 404 Forum RepliesNeg1

  Scenario: DELETE forum replies
    Given I set DELETE endpoints Forum Replies
    When I send DELETE HTTP request Forum Replies
    Then I receive valid HTTP response code 200 Forum Replies

  Scenario: DELETE forum replies invalid endpoint
    Given I set DELETE endpoints Forum RepliesNeg1
    When I send DELETE HTTP request Forum RepliesNeg1
    Then I receive valid HTTP response code 404 Forum RepliesNeg1