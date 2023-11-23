@usermanagement
Feature: Feature to test the add, edit and delete options for the user

  Background:
    Given the user logins the page with valid credentials

  Scenario Outline: Verify the add user functionality
    Given the user is in user management page
    When the user clicks on Add button
    Then the user is in Add User Page
    When user adds with parameters "<userRole>", "<status>", "<employeeName>", "<username>", "<password>", "<confirmPassword>"
    And the user clicks on Save button
    Then the user with "<username>" should be saved and added to the records
    Examples:
      | userRole | status  | employeeName | username    | password | confirmPassword |
      | Admin    | Enabled | Virat Kohli  | Virat Kohli | Bala@123 | Bala@123        |
