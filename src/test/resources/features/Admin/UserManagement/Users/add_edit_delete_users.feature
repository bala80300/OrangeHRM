@usermanagement
Feature: Feature to test the add, edit and delete options for the user

  Background:
    Given the user logins the page with valid credentials

  Scenario: Verify the add user functionality
    Given the user is in user management page
    When the user clicks on Add button
    Then the user is in Add User Page
    When user adds with parameters "<userRole>", "<status>", "<employeeName>", "<username>", "<password>", "<confirmPassword>"
    And the user clicks on Save button
    Then the user should be saved
    And added to the records
