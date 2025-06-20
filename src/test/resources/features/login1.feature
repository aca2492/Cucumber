Feature: Login Page

  Scenario: Successful login with valid credentials

    Given the user is on the login page

    When the user enters valid username and password

    And the user clicks the login button

    Then the user should be logged in successfully
