@usermanagement
Feature: feature to test the user management
  @Background: Given the user logins with the username and password
    Scenario: Verify search and reset functionality in user management
      Given the user is in user management page
      And user notes the total records of the users
      When user searches with search parameters <username>, <user_role>, <employee_name>, <status>
      And clicks on Search button
      Then the searched user is displayed with the <message>
      When the user clicks on Reset button
      Then the values in all of the search parameters should be removed
      And it should show all the records