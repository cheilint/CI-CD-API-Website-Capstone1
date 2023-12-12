Feature: Article

  As a user
  I want to see the Article
  So that I can make see Article


  Scenario: GET Article
    Given I set GET api endpoints Article
    When I send GET HTTP request Article
    Then I receive valid HTTP response code 200 Article


  Scenario: GET articles invalid endpoint
    Given I set GET api endpoints ArticleNeg1
    When I send GET HTTP request ArticleNeg1
    Then I receive valid HTTP response code 400 ArticleNeg1


  Scenario:   GET articles with ID
    Given I set GET api endpoints Article with ID
    When I send GET HTTP request Article with ID
    Then I receive valid HTTP response code 200 Article


  Scenario: GET article by ID invalid endpoint
    Given I set GET api endpoints Article with ID Neg1
    When I send GET HTTP request Article with ID Neg1
    Then I receive valid HTTP response code 400 ArticleNeg1


  Scenario: POST Articles
    Given I set POST api endpoints Articles
    When I send POST HTTP request Articles
    Then I receive valid HTTP response code 201 Articles

  Scenario: POST Articles invalid endpoint
    Given I set POST api endpoints ArticlesNeg1
    When I send POST HTTP request ArticlesNeg1
    Then I receive valid HTTP response code 404 ArticleNeg1

  Scenario:   PUT Articles with ID
    Given I set PUT api endpoints Article with ID
    When I send PUT HTTP request Article with ID
    Then I receive valid HTTP response code 200 Article

  Scenario:   PUT Articles with ID invalid endpoint
    Given I set PUT api endpoints Article with IDNeg1
    When I send PUT HTTP request Article with IDNeg1
    Then I receive valid HTTP response code 404 ArticleNeg1

  Scenario:   PUT doctors Published Articles
    Given I set PUT api endpoints Published Articles
    When I send PUT HTTP request Published Articles
    Then I receive valid HTTP response code 200 Article

  Scenario:   PUT doctors Published Articles invalid endpoint
    Given I set PUT api endpoints Published ArticlesNeg1
    When I send PUT HTTP request Published ArticlesNeg1
    Then I receive valid HTTP response code 404 ArticleNeg1

  Scenario:   DELETE Articles with ID
    Given I set DELETE api endpoints Article with ID
    When I send DELETE HTTP request Article with ID
    Then I receive valid HTTP response code 200 Article

  Scenario:   DELETE Articles with ID invalid endpoint
    Given I set DELETE api endpoints Article with ID Neg1
    When I send DELETE HTTP request Article with ID Neg1
    Then I receive valid HTTP response code 404 ArticleNeg1