Feature: Login Page

  Scenario Outline:  Login with invalid credentials

    Given the user is on the login page

    When the user enters "<username>" and "<password>"

    And the user clicks the login button

    Then the user should be not be able to log in

    Examples:
    | username | password |
    | cheese | chicken123 |
    | adam | Password789 |
    | house | mouse456 |