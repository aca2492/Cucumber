Feature: Login Functionality

  Background:
    Given the user is on the login page

  @smoke
  Scenario Outline: Attempt to Login with invalid credentials

    When the user enters "<username>" and "<password>"

    And the user clicks the login button

    Then the system should display a login error message

    And the user should not be logged in


  Examples:
      | username | password |
      | invalid1 | wrongPass |
      | validUser | wrongPass |
      | invalid2 | correctPass |