@usermanagement
Feature: Feature to test the add, edit and delete options for the user

  Background:
    Given the user logins the page with valid credentials

  Scenario Outline: Verify the add user functionality
    Given the user is in user management page
    When the user clicks on Add button
    Then the user is in Add User Page
    When user adds with parameters "<userRole>", "<status>", "<employeeName>", "<username>", "<password>", "<confirmPassword>"
    And the user clicks on Save button in Add User Page
    Then the user with "<username>" should be saved and added to the records
    Examples:
      | userRole | status  | employeeName | username | password | confirmPassword |
      | Admin    | Enabled | Virat Kohli  | Bala S   | Bala@123 | Bala@123        |

  Scenario Outline: Verify the edit user functionality
    Given the user navigates to already created user with "<username>"
    When the user clicks on edit button for the user with "<username>"
    Then the user is in Edit User Page
    When user adds with parameters "<userRole>", "<status>"
    And the user clicks on Save button in Edit user page
    Then the user with "<username>" should be updated to the records with "<userRole>", "<status>"
    Examples:
      | username | userRole | status   |
      | Bala S   | ESS      | Disabled |