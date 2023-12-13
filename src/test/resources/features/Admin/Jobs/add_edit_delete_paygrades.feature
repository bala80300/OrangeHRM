@paygrades @demo
Feature: Feature to test the add, edit and delete options for the pay grades

  Background:
    Given the user logins the page with valid credentials

  @add_paygrade_and_currency
  Scenario Outline: Verify the add pay grade and add currency functionality
    Given the user is in Pay Grades page
    When the user clicks on Add button in Pay Grades page
    Then the user is in Add Pay Grade Page
    When user adds the parameters "<name>"
    And the user clicks on Save button in Add Pay Grades Page
    Then the Edit Pay Grade page and Currencies should be visible
    When the user clicks on Add button near Currencies
    Then the Add Currency page should be visible
    When user adds the parameters "<currency>"
    And the user clicks on Save button in Add Currency Page
    Then the newly added "<currency>" is visible
    When the user clicks cancel in Edit Pay Grade page
    Then the newly added pay grade "<name>" is visible

    Examples:
      | name       | currency           |
      | Grade_Bala | INR - Indian Rupee |