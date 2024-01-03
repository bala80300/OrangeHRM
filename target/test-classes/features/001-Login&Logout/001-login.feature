@login @demo
Feature: Testing the login functionality

  Scenario: Login the application with valid username and password
    Given the user is in login page
    When the user enters username "Admin" and password "admin123"
    And clicks on Login button
    Then the dashboard page is displayed

  Scenario: Login the application with invalid username and password
    Given the user is in login page
    When the user enters username "Admin" and password "admin1234"
    And clicks on Login button
    Then the error message should be displayed and it should not login
