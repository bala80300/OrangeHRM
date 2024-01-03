package stepDefinitions.Admin.Jobs;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.Job.JobDropdownsPage;
import org.OrangeHRM_BDD.Pages.Admin.Job.PayGradesPage;
import org.OrangeHRM_BDD.Pages.Modules.Admin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayGrades extends PayGradesPage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    JobDropdownsPage jobDropdownsPage = new JobDropdownsPage();
    Admin admin = new Admin();

    //Adding paygrades and currency
    @Given("the user is in Pay Grades page")
    public void the_user_is_in_pay_grades_page() {
        admin.selectAdminMenu();
        jobDropdownsPage.job();
        jobDropdownsPage.payGrades();
        Assert.assertEquals("Pay Grades", getPayGradesTitle());
    }

    @When("the user clicks on Add button in Pay Grades page")
    public void the_user_clicks_on_add_button_in_pay_grades_page() {
        addButton();
    }

    @Then("the user is in Add Pay Grade Page")
    public void the_user_is_in_add_pay_grade_page() {
        Assert.assertEquals("Add Pay Grade", getAddPayGradeTitle());
    }

    @When("user adds the parameters {string}")
    public void user_adds_the_parameters(String name) {
        nameField(name);
    }

    @When("the user clicks on Save button in Add Pay Grades Page")
    public void the_user_clicks_on_save_button_in_add_pay_grades_page() {
        saveButton();
    }

    @Then("the Edit Pay Grade page and Currencies should be visible")
    public void the_edit_pay_grade_page_and_currencies_should_be_visible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h6[text()='Edit Pay Grade']")));
        Assert.assertEquals("Edit Pay Grade", getEditPayGradeTitle());
        Assert.assertEquals("Currencies", getCurrenciesTitle());
    }

    @When("the user clicks on Add button near Currencies")
    public void the_user_clicks_on_add_button_near_currencies() {
        addButtonInCurrency();
    }

    @Then("the Add Currency page should be visible")
    public void the_add_currency_page_should_be_visible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h6[text()='Add Currency']")));
        Assert.assertEquals("Add Currency", getAddCurrencyTitle());
    }

    @When("user adds the parameters {string}, {string}, {string}")
    public void user_adds_the_parameters(String currency, String minimumSalary, String maximumSalary) {
        currencyDropdown(currency);
        minimumSalaryField(minimumSalary);
        maximumSalaryField(maximumSalary);
    }

    @When("the user clicks on Save button in Add Currency Page")
    public void the_user_clicks_on_save_button_in_add_currency_page() {
        saveButtonInAddCurrency();
    }

    @Then("the newly added parameters {string}, {string}, {string} are visible")
    public void theNewlyAddedparametersAreVisible(String currencyInRecords, String minimumSalary, String maximumSalary) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h6[text()='Currencies']")));
        Assert.assertEquals("Currencies", getCurrenciesTitle());

        WebElement currencyInRecordsLocator = driver.findElement(By.xpath("//div[text()='" + currencyInRecords + "']"));
        WebElement minimumSalaryInRecordsLocator = driver.findElement(By.xpath("//div[text()='" + currencyInRecords + "']/following::div[position()=2]"));
        WebElement maximumSalaryInRecordsLocator = driver.findElement(By.xpath("//div[text()='" + currencyInRecords + "']/following::div[position()=4]"));

        Assert.assertEquals(currencyInRecords, currencyInRecordsLocator.getText());
        Assert.assertEquals(minimumSalary, minimumSalaryInRecordsLocator.getText());
        Assert.assertEquals(maximumSalary, maximumSalaryInRecordsLocator.getText());
    }

    @When("the user clicks button cancel in Edit Pay Grade page")
    public void the_user_clicks_button_cancel_in_edit_pay_grade_page() {
        cancelButton();
    }

    @Then("the newly added pay grade {string} and currency {string} is visible")
    public void the_newly_added_pay_grade_and_currency_is_visible(String name, String currencyInRecords) {
        Assert.assertEquals("Pay Grades", getPayGradesTitle());
        Assert.assertEquals(name, nameLocatorInPayGrades(name));
        Assert.assertEquals(currencyInRecords, currencyLocatorInPayGrades(name));
    }

    //editing the paygrade
    @When("the user clicks on Edit button in {string} Pay Grades page")
    public void the_user_clicks_on_edit_button_in_pay_grades_page(String name) {
        editButton(name);
    }

    @When("user updates the name parameter to {string}")
    public void user_edits_the_parameters(String updatedName) {
        updatedNameField(updatedName);
    }

    @When("the user clicks on Save button in Edit Pay Grade Page")
    public void the_user_clicks_on_save_button_in_edit_pay_grade_page() {
        saveButton();
    }

    @When("the user clicks cancel button in Edit Pay Grade page")
    public void the_user_clicks_cancel_button_in_edit_pay_grade_page() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cancelButton();
    }

    @Then("the edited Pay Grade Name {string} is updated in the records")
    public void the_edited_pay_grade_name_is_updated_in_the_records(String updatedName) {
        WebElement updatedNameLocator = driver.findElement(By.xpath("//div[text()='" + updatedName + "']"));
        Assert.assertEquals(updatedName, updatedNameLocator.getText());
    }

    //editing the currency
    @And("the user clicks on Edit button in {string}")
    public void theUserClicksOnEditButtonIn(String currency) {
        editButton(currency);
    }

    @When("user edits the parameters {string},{string}")
    public void user_edits_the_parameters(String updatedMinimumSalary, String updatedMaximumSalary) {
        Assert.assertEquals("Edit Currency", getEditCurrencyTitle());
        updatedMinimumSalaryField(updatedMinimumSalary);
        updatedMaximumSalaryField(updatedMaximumSalary);
    }

    @And("the currency dropdown is not enabled")
    public void the_field_is_not_enabled() {
        Assert.assertFalse(currencyDropdownVisibility());
    }

    @Then("the edited currency salaries {string},{string} are updated in the records")
    public void theEditedCurrencySalariesAreUpdatedInTheRecords(String updatedMinimumSalary, String updatedMaximumSalary) {
        WebElement updatedMinSalInRecord = driver.findElement(By.xpath("//div[text()='" + updatedMinimumSalary + "']"));
        WebElement updatedMaxSalInRecord = driver.findElement(By.xpath("//div[text()='" + updatedMaximumSalary + "']"));

        Assert.assertEquals(updatedMinimumSalary, updatedMinSalInRecord.getText());
        Assert.assertEquals(updatedMaximumSalary, updatedMaxSalInRecord.getText());
    }

    //Deleting paygrades and currency
    @When("the user clicks on Edit button in {string} in Pay Grades page")
    public void the_user_clicks_on_edit_button_in_in_pay_grades_page(String updatedName) {
        editButton(updatedName);
    }

    @When("the user clicks on delete button on the {string}")
    public void the_user_clicks_on_delete_button_on_the(String currency) {
        deleteButton(currency);
    }

    @And("the user clicks YES on Are you sure Dialog")
    public void the_user_clicks_yes_on_are_you_sure_dialog() {
        yesInconfirmationDialogButton();
    }

    @Then("the {string} will be deleted")
    public void the_will_be_deleted(String currency) {
        try {
            driver.findElement(By.xpath("//div[text()='" + currency + "']//following::div[position()=1]"));
        } catch (NoSuchElementException e) {
            System.out.println("The currency " + currency + " is deleted from the records");
        }
    }

    @When("the user clicks on delete button on the {string} in Pay Grades page")
    public void the_user_clicks_on_delete_button_on_the_in_pay_grades_page(String updatedName) {
        deleteButton(updatedName);
    }

    @Then("the {string} pay grade is deleted")
    public void the_pay_grade_is_deleted(String updatedName) {
        try {
            driver.findElement(By.xpath("//div[text()='" + updatedName + "'][position()=1]"));
        }
        catch (NoSuchElementException e) {
            System.out.println("The paygrade " + updatedName + " is deleted from the records");
        }
    }
}
