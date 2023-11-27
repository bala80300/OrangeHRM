package stepDefinitions.Admin.UserManagement.Users;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.UserManagement.Users.SearchUsersPage;
import org.OrangeHRM_BDD.Pages.Modules.Admin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchUsers extends SearchUsersPage {
    Admin adminPage = new Admin();
    @Given("the user is in user management page")
    public void theUserIsInUserManagementPage() {
        adminPage.selectAdminMenu();
        Assert.assertEquals(getSystemUserTitle(),"System Users");
    }

    @And("user notes the total records of the users")
    public void userNotesTheTotalRecordsOfTheUsers() {
        System.out.println("Total records displayed:" + totalRecords());
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
        searchButton();
    }

    @Then("the searched user is displayed with the {string}")
    public void theSearchedUserIsDisplayedWithThe(String message) {
//        System.out.println(searchedUserDisplayMessage()+"\n"+message);
        Assert.assertEquals(searchedUserDisplayMessage(), message);
    }

    @When("the user clicks on Reset button")
    public void theUserClicksOnResetButton() {
        resetButton();
    }

    @Then("the values in all of the search parameters should be removed")
    public void theValuesInAllOfTheSearchParametersShouldBeRemoved() {
        WebElement usernameFieldClear = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        WebElement userRoleDDClear = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
        WebElement employeeNameFieldClear = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        WebElement statusDDClear = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));

        Assert.assertEquals("",usernameFieldClear.getAttribute("value"));

        Assert.assertEquals(null,userRoleDDClear.getAttribute("value"));

        Assert.assertEquals("",employeeNameFieldClear.getAttribute("value"));

        Assert.assertEquals(null,statusDDClear.getAttribute("value"));

    }

    @And("it should show all the records")
    public void itShouldShowAllTheRecords() {
        Assert.assertEquals(totalRecords(), totalRecords());
        //System.out.println(totalRecords());
    }
}
