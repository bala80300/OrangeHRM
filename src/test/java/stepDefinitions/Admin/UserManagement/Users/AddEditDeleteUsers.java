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

    @When("the user clicks on Save button")
    public void the_user_clicks_on_save_button() {
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
}

