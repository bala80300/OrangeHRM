package stepDefinitions.Admin.Jobs;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.Job.JobDropdownsPage;
import org.OrangeHRM_BDD.Pages.Admin.Job.JobTitlesPage;
import org.OrangeHRM_BDD.Pages.Modules.Admin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class JobTitles extends JobTitlesPage {
    JobDropdownsPage jobDropdownsPage = new JobDropdownsPage();
    Admin admin = new Admin();

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

    @When("the user clicks on Save button in Add Job Title Page")
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
        getjobTitlesTitle();
        jobTitleField(jobTitleName);
        WebElement jobTitleFieldLocator = driver.findElement(By.xpath("(//div/label[text()='" + jobTitleName + "']/following::div/input)[position()=1]"));
        Assert.assertEquals(jobTitleName,jobTitleFieldLocator.getText());
    }

    @Then("the user is in Edit Job Title page")
    public void the_user_is_in_edit_job_title_page() {

    }

    @When("user edits with parameters {string}, {string}, {string}")
    public void user_edits_with_parameters(String string, String string2, String string3) {

    }

    @When("the user clicks on Save button in Edit Job Title page")
    public void the_user_clicks_on_save_button_in_edit_job_title_page() {

    }

    @Then("the records should be updated as {string}, {string}")
    public void the_records_should_be_updated_as(String string, String string2) {

    }

    @Then("user notes the total records of the Job Titles")
    public void user_notes_the_total_records_of_the_job_titles() {

    }

    @Then("the job Title will be deleted from the records")
    public void the_job_title_will_be_deleted_from_the_records() {

    }

}