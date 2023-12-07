@jobtitle
Feature: Feature to test the add, edit and delete options for the job titles

  Background:
    Given the user logins the page with valid credentials

  @add_job_title
  Scenario Outline: Verify the add job title functionality
    Given the user is in job titles page
    When the user clicks on Add button in job Titles page
    Then the user is in Add Job Title Page
    When user adds with parameters "<jobTitle>", "<jobDescription>", "<note>"
    And the user clicks on Save button in Add Job Title Page
    Then the newly added "<jobTitle>" and "<jobDescription>" should be saved and added to the Job Titles records
    Examples:
      | jobTitle     | jobDescription                  | note                            |
      | Data Analyst | Analysing the data for projects | Analysing the data for projects |

  @edit_and_delete_jobtitle
  Scenario Outline: Verify the edit user and delete job titles functionality
    #edit functionality
    Given the user navigates to already created job title with "<jobTitle>"
    When the user clicks on edit button for the user with "<jobTitle>"
    Then the user is in Edit Job Title page
    When user edits with parameters "<updatedJobTitle>", "<updatedJobDescription>", "<updatedNote>"
    And the user clicks on Save button in Edit Job Title page
    Then the records should be updated as "<updatedJobTitle>", "<updatedJobDescription>"
    #delete functionality
    And user notes the total records of the Job Titles
    When the user clicks on delete button for the user with "<jobTitle>"
    And the user clicks YES on Are you sure? Dialog
    Then the job Title "<jobTitle>" will be deleted from the records
    Examples:
      | jobTitle     | updatedJobTitle | updatedJobDescription             | updatedNote                       |
      | Data Analyst | Data Scientist  | Making decisions on analysed data | Making decisions on analysed data |