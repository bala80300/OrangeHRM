Feature: testing the login functionality
@login
  Scenario: testing the login functionality
    Given the user is in login page
    When the user enters <username> and <password>
    And clicks on Login  button
    Then the dashboard page is displayed
