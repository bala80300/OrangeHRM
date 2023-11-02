package stepDefinitions.Admin.UserManagement;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.AdminPage;

public class Users extends AdminPage {
    AdminPage adminPage = new AdminPage();

    @Given("the user is in user management page")
    public void theUserIsInUserManagementPage() {
        adminPage.selectAdminMenu();
    }

    @And("user notes the total records of the users")
    public void userNotesTheTotalRecordsOfTheUsers() {
        adminPage.totalRecords();
    }

    @When("user searches with search parameters <username> {String}, <user_role>, <employee_name> {String}, <status>")
    public void userSearchesWithSearchParametersUsernameUser_roleEmployee_nameStatus(String username, String employee_name) {
        adminPage.enterUsernameForSearch(username);
        adminPage.userrole();
        adminPage.enterEmployeenameForSearch(employee_name);
        adminPage.status();
    }

    @And("clicks on Search button")
    public void clicksOnSearchButton() {
        adminPage.submitButton();
    }

    @Then("the searched user is displayed with the <message>")
    public void theSearchedUserIsDisplayedWithTheMessage() {
    }

    @When("the user clicks on Reset button")
    public void theUserClicksOnResetButton() {
        adminPage.resetButton();
    }

    @Then("the values in all of the search parameters should be removed")
    public void theValuesInAllOfTheSearchParametersShouldBeRemoved() {
    }

    @And("it should show all the records")
    public void itShouldShowAllTheRecords() {
        adminPage.totalRecords();
    }
}
