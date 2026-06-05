Feature: Login functionality

  Scenario: Successful login
    Given user opens login page
    When user enters username and password
    And click login button
    Then verify Logged in url and success message