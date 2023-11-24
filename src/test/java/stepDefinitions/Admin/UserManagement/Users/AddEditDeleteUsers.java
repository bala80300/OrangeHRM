package stepDefinitions.Admin.UserManagement.Users;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.UserManagement.AddUsersPage;
import org.OrangeHRM_BDD.Pages.Admin.UserManagement.SearchUsersPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEditDeleteUsers extends AddUsersPage {
    SearchUsersPage searchUsersPage = new SearchUsersPage();
    SearchUsers searchUsers = new SearchUsers();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


    @When("the user clicks on Add button")
    public void the_user_clicks_on_add_button() {
        searchUsers.theUserIsInUserManagementPage();
        searchUsersPage.addButton();
    }

    @Then("the user is in Add User Page")
    public void the_user_is_in_add_user_page() {
        Assert.assertEquals("Add User", getAddUsersTitle());
    }

    @When("user adds with parameters {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_adds_with_parameters(String userRole, String status, String employeeName, String username, String password, String confirmPassword) {
        userRoleDropdown(userRole);
        statusDropdown(status);
        enterEmployeenameForAdd(employeeName);
        enterUsernameForAdd(username);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
    }

    @When("the user clicks on Save button in Add User Page")
    public void the_user_clicks_on_save_button_in_add_user_page() {
        saveButton();
    }

    @Then("the user with {string} should be saved and added to the records")
    public void theUserWithShouldBeSavedAndAddedToTheRecords(String username) throws InterruptedException {
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div/h5")));
        Thread.sleep(3000);
        WebElement addeduserLocator = driver.findElement(By.xpath("(//div[text()='" + username + "'])[position() = 1]"));
        js.executeScript("arguments[0].scrollIntoView();", addeduserLocator);
        Thread.sleep(3000);
        Assert.assertEquals(addeduserLocator.getText(),username);
    }

    @Given("the user navigates to already created user with {string}")
    public void theUserNavigatesToAlreadyCreatedUserWith(String username) {
        WebElement addeduserLocator = driver.findElement(By.xpath("(//div[text()='" + username + "'])[position() = 1]"));
        js.executeScript("arguments[0].scrollIntoView();", addeduserLocator);
    }

    @When("the user clicks on edit button for the user with {string}")
    public void theUserClicksOnEditButtonForTheUserWith(String username) {
        WebElement addeduserLocator = driver.findElement(By.xpath("(//div[text()='" + username + "']/following::i)[position() = 2]"));
        addeduserLocator.click();
    }

    @Then("the user is in Edit User Page")
    public void theUserIsInEditUserPage() {
        String editUserTitle = driver.findElement(By.xpath("//div/h6")).getText();
        Assert.assertEquals(editUserTitle,"Edit User");
    }

    @When("user adds with parameters {string}, {string}")
    public void userAddsWithParameters(String userRole, String status) {
        searchUsersPage.userRoleDropdown(userRole);
        searchUsersPage.statusDropdown(status);
    }

    @And("the user clicks on Save button in Edit user page")
    public void theUserClicksOnSaveButtonInEditUserPage() {
        saveButton();
    }

    @Then("the user with {string} should be updated to the records with {string}, {string}")
    public void theUserWithShouldBeEditedAndUpdatedToTheRecordsWith(String username, String userRole, String status) {
        WebElement editedUserRoleLocator = driver.findElement(By.xpath("(//div[text()='"+username+"']/following::div)[position()=2]"));
        WebElement editedStatusLocator = driver.findElement(By.xpath("(//div[text()='"+username+"']/following::div)[position()=6]"));
        Assert.assertEquals(editedUserRoleLocator,userRole);
        Assert.assertEquals(editedStatusLocator,status);
    }
}


