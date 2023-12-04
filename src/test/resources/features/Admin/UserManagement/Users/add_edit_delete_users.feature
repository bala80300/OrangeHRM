@usermanagement
Feature: Feature to test the add, edit and delete options for the user

  Background:
    Given the user logins the page with valid credentials

  @add_user
  Scenario Outline: Verify the add user functionality
    Given the user is in user management page
    When the user clicks on Add button in Search Users page
    Then the user is in Add User Page
    When user adds with parameters "<userRole>", "<status>", "<employeeName>", "<username>", "<password>", "<confirmPassword>"
    And the user clicks on Save button in Add User Page
    Then the user with "<username>" should be saved and added to the user records
    Examples:
      | userRole | status  | employeeName | username | password | confirmPassword |
      | Admin    | Enabled | 123 Collings | Bala S   | Bala@123 | Bala@123        |

  @edit_and_delete_user
  Scenario Outline: Verify the edit user and delete user functionality
    #edit functionality
    Given the user navigates to already created user with "<username>"
    When the user clicks on edit button for the user with "<username>"
    Then the user is in Edit User Page
    When user edits with parameters "<updatedUserRole>", "<updatedStatus>"
    And the user clicks on Save button in Edit user page
    Then the "<username>" should be updated to the user records with "<updatedUserRole>", "<updatedStatus>"
    #delete functionality
    And user notes the total records of the users
    When the user clicks on delete button for the user with "<username>"
    And the user clicks YES on Are you sure? Dialog
    Then the user will be deleted from the user records
    Examples:
      | username | updatedUserRole | updatedStatus |
      | Bala S   | ESS             | Disabled      |