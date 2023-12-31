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
    When user adds the parameters "<currency>", "<minimumSalary>", "<maximumSalary>"
    And the user clicks on Save button in Add Currency Page
    Then the newly added parameters "<currencyInRecords>", "<minimumSalary>", "<maximumSalary>" are visible
    When the user clicks button cancel in Edit Pay Grade page
    Then the newly added pay grade "<name>" and currency "<currencyInRecords>" is visible

    Examples:
      | name       | currency           | minimumSalary | maximumSalary | currencyInRecords |
      | Grade_Bala | INR - Indian Rupee | 10000.00      | 25000.00      | Indian Rupee      |

  @edit_paygrade
  Scenario Outline: Verify the edit pay grade functionality
    Given the user is in Pay Grades page
    When the user clicks on Edit button in "<name>" Pay Grades page
    When user updates the name parameter to "<updatedName>"
    And the user clicks on Save button in Edit Pay Grade Page
    When the user clicks cancel button in Edit Pay Grade page
    Then the edited Pay Grade Name "<updatedName>" is updated in the records

    Examples:
      | name       | updatedName |
      | Grade_Bala | Bala_Grade  |

  @edit_currency
  Scenario Outline: Verify the edit currency functionality
    Given the user is in Pay Grades page
    When the user clicks on Edit button in "<updatedName>" Pay Grades page
    And the user clicks on Edit button in "<currency>"
    When user edits the parameters "<updatedMinimumSalary>","<updatedMaximumSalary>"
    And the currency dropdown is not enabled
    And the user clicks on Save button in Add Currency Page
    Then the edited currency salaries "<updatedMinimumSalary>","<updatedMaximumSalary>" are updated in the records

    Examples:
      | updatedName | updatedMinimumSalary | updatedMaximumSalary | currency     |
      | Bala_Grade  | 20000.00             | 30000.00             | Indian Rupee |

  @delete_paygrade_and_currency
  Scenario Outline: Verify the delete pay grade and delete currency functionality
    Given the user is in Pay Grades page
    When the user clicks on Edit button in "<updatedName>" in Pay Grades page
    When the user clicks on delete button on the "<currency>"
    And the user clicks YES on Are you sure Dialog
    Then the "<currency>" will be deleted
    When the user clicks cancel button in Edit Pay Grade page
    When the user clicks on delete button on the "<updatedName>" in Pay Grades page
    And the user clicks YES on Are you sure Dialog
    Then the "<updatedName>" pay grade is deleted

    Examples:
      | updatedName | currency     |
      | Bala_Grade  | Indian Rupee |