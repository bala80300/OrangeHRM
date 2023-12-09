package stepDefinitions.Admin.Jobs;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.Job.JobDropdownsPage;
import org.OrangeHRM_BDD.Pages.Admin.Job.JobTitlesPage;
import org.OrangeHRM_BDD.Pages.Modules.Admin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class JobTitles extends JobTitlesPage {
    JobDropdownsPage jobDropdownsPage = new JobDropdownsPage();
    Admin admin = new Admin();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    //Adding the job title
    @Given("the user is in job titles page")
    public void the_user_is_in_job_titles_page() {
        admin.selectAdminMenu();
        jobDropdownsPage.job();
        jobDropdownsPage.jobTitles();
        Assert.assertEquals("Job Titles", getjobTitlesTitle());
    }

    @When("the user clicks on Add button in job Titles page")
    public void the_user_clicks_on_add_button_in_job_titles_page() {
        addButton();
    }

    @Then("the user is in Add Job Title Page")
    public void the_user_is_in_add_job_title_page() {
        getaddJobTitleTitle();
        Assert.assertEquals("Add Job Title", getaddJobTitleTitle());
    }

    @When("user adds with parameters {string}, {string}, {string}")
    public void user_adds_with_parameters(String jobTitleName, String jobDescription, String note) {
        jobTitleField(jobTitleName);
        jobDescriptionField(jobDescription);
        noteField(note);
    }

    @And("the user clicks on Save button in Add Job Title Page")
    public void the_user_clicks_on_save_button_in_add_job_title_page() {
        saveButton();
    }

    @Then("the newly added {string} and {string} should be saved and added to the Job Titles records")
    public void theNewlyAddedAndShouldBeSavedAndAddedToTheJobTitlesRecords(String jobTitleName, String jobDescription) {
        WebElement jobTitleFieldLocator = driver.findElement(By.xpath("//div[text()='" + jobTitleName + "']"));
        WebElement jobDescriptiontionFieldLocator = driver.findElement(By.xpath("//div[text()='" + jobTitleName + "']//following::span[text()='" + jobDescription + "']"));

        Assert.assertEquals(jobTitleName, jobTitleFieldLocator.getText());
        Assert.assertEquals(jobDescription, jobDescriptiontionFieldLocator.getText());
    }

    // Editing and deleting the users
    @Given("the user navigates to already created job title with {string}")
    public void the_user_navigates_to_already_created_job_title_with(String jobTitleName) {
        admin.selectAdminMenu();
        jobDropdownsPage.job();
        jobDropdownsPage.jobTitles();
        getjobTitlesTitle();
        WebElement jobTitleFieldLocator = driver.findElement(By.xpath("//div[text()='" + jobTitleName + "']"));
        Assert.assertEquals(jobTitleName, jobTitleFieldLocator.getText());
    }

    @Then("the user is in Edit Job Title page")
    public void the_user_is_in_edit_job_title_page() {
        String editJobTitleLocator = driver.findElement(By.xpath("//div/h6[text()='Edit Job Title']")).getText();
        Assert.assertEquals("Edit Job Title", editJobTitleLocator);
    }

    @When("user edits with parameters {string}, {string}, {string}")
    public void user_edits_with_parameters(String updatedJobTitle, String updatedJobDescription, String updatedNote) {
        updatedJobTitleField(updatedJobTitle);
        updatedJobDescriptionField(updatedJobDescription);
        updatedNoteField(updatedNote);

    }

    @And("the user clicks on Save button in Edit Job Title page")
    public void the_user_clicks_on_save_button_in_edit_job_title_page() {
        saveButton();
    }

    @Then("the records should be updated as {string}, {string}")
    public void the_records_should_be_updated_as(String updatedJobTitle, String updatedJobDescription) {
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div/h6[text()='Job Titles']"))));

        WebElement updatedJobTitleField = driver.findElement(By.xpath("//div[text()='" + updatedJobTitle + "']"));
        WebElement updatedJobDescriptionField = driver.findElement(By.xpath("//div[text()='" + updatedJobTitle + "']/following::span[text()[contains(.,'" + updatedJobDescription + "')]]"));

        Assert.assertEquals(updatedJobTitle, updatedJobTitleField.getText());
        Assert.assertEquals(updatedJobDescription, updatedJobDescriptionField.getText());
    }

    //deleting the job
    @And("user notes the total records of the Job Titles")
    public void user_notes_the_total_records_of_the_job_titles() {
        System.out.println("Jobs before deletion :" + totalJobRecords());
    }

    @When("the user clicks on delete button for the user with {string} in Job Titles page")
    public void theUserClicksOnDeleteButtonForTheUserWithInJobTitlesPage(String updatedJobTitle) {
        deleteButton(updatedJobTitle);
    }

    @And("the user clicks YES on Are you sure Dialog in Job Titles page")
    public void theUserClicksYESOnAreYouSureDialogInJobTitlesPage() {
        yesInconfirmationDialogButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div/h6[text()='Job Titles']"))));
    }

    @Then("the job Title {string} will be deleted from the records")
    public void theJobTitleWillBeDeletedFromTheRecords(String updatedJobTitle) {
        System.out.println("Jobs After deletion :" + totalJobRecords());
        try {
            driver.findElement(By.xpath("//div[text()='" + updatedJobTitle + "']"));
        } catch (NoSuchElementException e) {
            System.out.println("The newly updated job title " + updatedJobTitle + "with its details are deleted successfully as expected");
        }
    }


}
