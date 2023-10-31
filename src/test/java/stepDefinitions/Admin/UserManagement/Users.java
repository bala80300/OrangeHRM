package stepDefinitions.Admin.UserManagement;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.AdminPage;

public class Users extends AdminPage {
    @Given("the user is in user management page")
    public void theUserIsInUserManagementPage() {
        AdminPage adminPage = new AdminPage();
        adminPage.selectAdminMenu();
    }

    @And("user notes the total records of the users")
    public void userNotesTheTotalRecordsOfTheUsers() {
    }

    @When("user searches with search parameters <username>, <user_role>, <employee_name>, <status>")
    public void userSearchesWithSearchParametersUsernameUser_roleEmployee_nameStatus() {
    }

    @And("clicks on Search button")
    public void clicksOnSearchButton() {
    }

    @Then("the searched user is displayed with the <message>")
    public void theSearchedUserIsDisplayedWithTheMessage() {
    }

    @When("the user clicks on Reset button")
    public void theUserClicksOnResetButton() {
    }

    @Then("the values in all of the search parameters should be removed")
    public void theValuesInAllOfTheSearchParametersShouldBeRemoved() {
    }

    @And("it should show all the records")
    public void itShouldShowAllTheRecords() {
    }
}
