Feature: Login Page

  Background:
    Given the user is on the login page

  Scenario: Successful login with valid credentials

    When the user enters valid username and password

    And the user clicks the login button

    Then the user should be logged in successfully

  Scenario: Attempted login with invalid credentials

    When the user enters invalid username and password

    And the user clicks the login button

    Then the user should be not be able to log in
