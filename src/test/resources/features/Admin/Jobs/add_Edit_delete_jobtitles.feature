@jobtitle
Feature: Feature to test the add, edit and delete options for the job titles

  Background:
    Given the user logins the page with valid credentials

  Scenario Outline: Verify the add job title functionality
    Given the user is in job titles page
    When the user clicks on Add button in job Titles page
    Then the user is in Add Job Title Page
    When user adds with parameters "<jobTitle>", "<jobDescription>", "<note>"
    And the user clicks on Save button in Add Job Title Page
    Then the "<jobTitle>" should be saved and added to the Job Titles records
    Examples:
      | jobTitle     | jobDescription                  | note                            |
      | Data Analyst | Analysing the data for projects | Analysing the data for projects |

  Scenario Outline: Verify the edit user and delete job titles functionality
    #edit functionality
    Given the user navigates to already created user with "<username>"
    When the user clicks on edit button for the user with "<username>"
    Then the user is in Edit User Page
    When user edits with parameters "<updatedUserRole>", "<updatedStatus>"
    And the user clicks on Save button in Edit user page
    Then the user "<username>" should be updated to the records with "<updatedUserRole>", "<updatedStatus>"
    #delete functionality
    And user notes the total records of the users
    When the user clicks on delete button for the user with "<username>"
    And the user clicks YES on Are you sure? Dialog
    Then the user will be deleted from the records
    Examples:
      | username | updatedUserRole | updatedStatus |
      | Bala S   | ESS             | Disabled      |