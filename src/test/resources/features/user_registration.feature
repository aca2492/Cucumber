@smoke
Feature: Registration

  @wip
  Scenario: Successful registration

    Given the user is on the registration web page

    When the user enters the following valid user information
      | Name | D.O.B | Email | Password |
      | Adam Chery | 24/08 | adam@login.com | Password789

    And submits the registration form

    Then the users registration form should be successfully submitted

    And the user should receive a confirmation email

  @regression
  Scenario: Unsuccessful registration

    Given the user is on the registration web page

    When the user enters the following invalid user information
      | Name | D.O.B | Email | Password |
      | 124668 | 52/14 | invalid@login | rbgyehbf

    And submits the registration form

    Then the users registration form should be not be submitted