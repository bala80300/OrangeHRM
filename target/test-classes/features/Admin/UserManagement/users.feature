@usermanagement
Feature: Feature to test the user management

  Background:
    Given the user logins the page with valid credentials

  @searchuser
  Scenario Outline: Verify search And reset functionality in user management
    Given the user is in user management page
    And user notes the total records of the users
    When user searches with search parameters "<username>", "<userRole>", "<employeeName>", "<status>"
    And clicks on Search button
    Then the searched user is displayed with the "<message>"
    When the user clicks on Reset button
    Then the values in all of the search parameters should be removed
    And it should show all the records
    Examples:
      | username         | userRole       | employeeName | status         | message          |
      | Josephdayanand91 | 'Admin'        | Joseph       | 'Enabled'      | (1) Record Found |
#      | Bala80           | 'Admin'        | Nhung        | 'Enabled'      | No Records Found |