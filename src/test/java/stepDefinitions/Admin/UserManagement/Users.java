package stepDefinitions.Admin.UserManagement;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.AdminPage;
import org.junit.Assert;

public class Users extends AdminPage {
    AdminPage adminPage = new AdminPage();
    @Given("the user is in user management page")
    public void theUserIsInUserManagementPage() {
        selectAdminMenu();
    }

    @And("user notes the total records of the users")
    public void userNotesTheTotalRecordsOfTheUsers() {
        totalRecords();
    }

    @When("user searches with search parameters {string}, {string}, {string}, {string}")
    public void userSearchesWithSearchParameters(String username, String userRole, String employeeName, String status) {
        enterUsernameForSearch(username);
        userRoleDropdown(userRole);
        enterEmployeenameForSearch(employeeName);
        statusDropdown(status);
    }

    @And("clicks on Search button")
    public void clicksOnSearchButton() {
        submitButton();
    }

    @Then("the searched user is displayed with the {string}")
    public void theSearchedUserIsDisplayedWithThe(String recordsMessage) {
        totalRecords();
        Assert.assertEquals(recordsMessage,"(1) Records Found");
    }

    @When("the user clicks on Reset button")
    public void theUserClicksOnResetButton() {
        resetButton();
    }

    @Then("the values in all of the search parameters should be removed")
    public void theValuesInAllOfTheSearchParametersShouldBeRemoved() {
        enterUsernameForSearch(" ");
        userRoleDropdown(" ");
        enterEmployeenameForSearch(" ");
        userRoleDropdown(" ");
            }

    @And("it should show all the records")
    public void itShouldShowAllTheRecords() {
        totalRecords();
    }
}
