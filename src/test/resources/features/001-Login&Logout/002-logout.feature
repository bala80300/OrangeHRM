@logout @demo
Feature: Testing the logout functionality

  Background:
    Given the user logins the page with valid credentials

  Scenario: Logging out the application
    Given the user is in dashboard page
    When the user clicks on profile button
    And a dropdown is opened and click on Logout
    Then the user logged out and login page is displayed