package stepDefinitions.Admin.Jobs;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Admin.Job.PayGradesPage;

public class payGrades extends PayGradesPage {
    //Adding paygrades and currency
    @Given("the user is in Pay Grades page")
    public void the_user_is_in_pay_grades_page() {
    }
    @When("the user clicks on Add button in Pay Grades page")
    public void the_user_clicks_on_add_button_in_pay_grades_page() {
    }
    @Then("the user is in Add Pay Grade Page")
    public void the_user_is_in_add_pay_grade_page() {
    }
    @When("user adds the parameters {string}")
    public void user_adds_the_parameters(String string) {
    }
    @When("the user clicks on Save button in Add Pay Grades Page")
    public void the_user_clicks_on_save_button_in_add_pay_grades_page() {
    }
    @Then("the Edit Pay Grade page and Currencies should be visible")
    public void the_edit_pay_grade_page_and_currencies_should_be_visible() {
    }
    @When("the user clicks on Add button near Currencies")
    public void the_user_clicks_on_add_button_near_currencies() {
    }
    @Then("the Add Currency page should be visible")
    public void the_add_currency_page_should_be_visible() {
    }
    @When("user adds the parameters {string}, {string}, {string}")
    public void user_adds_the_parameters(String string, String string2, String string3) {
    }
    @When("the user clicks on Save button in Add Currency Page")
    public void the_user_clicks_on_save_button_in_add_currency_page() {
    }
    @Then("the newly added {string} is visible")
    public void the_newly_added_is_visible(String string) {
    }
    @When("the user clicks button cancel in Edit Pay Grade page")
    public void the_user_clicks_button_cancel_in_edit_pay_grade_page() {
    }
    @Then("the newly added pay grade {string} is visible")
    public void the_newly_added_pay_grade_is_visible(String string) {
    }
    //editing the paygrade
    @When("the user clicks on Edit button in {string} Pay Grades page")
    public void the_user_clicks_on_edit_button_in_pay_grades_page(String string) {
    }
    @When("user edits the parameters {string}")
    public void user_edits_the_parameters(String string) {
    }
    @When("the user clicks on Save button in Edit Pay Grade Page")
    public void the_user_clicks_on_save_button_in_edit_pay_grade_page() {
    }
    @When("the user clicks cancel button in Edit Pay Grade page")
    public void the_user_clicks_cancel_button_in_edit_pay_grade_page() {
    }
    @Then("the edited Pay Grade Name {string} is updated in the records")
    public void the_edited_pay_grade_name_is_updated_in_the_records(String string) {
    }
    //editing the currency
    @When("user edits the parameters {string},{string}")
    public void user_edits_the_parameters(String string, String string2) {
    }
    @And("the {string} field is not enabled")
    public void the_field_is_not_enabled(String string) {
    }
    @Then("the edited currency salaries {string},<{string}> are updated in the records")
    public void the_edited_currency_salaries_are_updated_in_the_records(String string, String string2) {
    }
    //Deleting paygrades and currency
    @When("the user clicks on Edit button in {string} in Pay Grades page")
    public void the_user_clicks_on_edit_button_in_in_pay_grades_page(String string) {
    }
    @When("the user clicks on delete button on the {string}")
    public void the_user_clicks_on_delete_button_on_the(String string) {
    }
    @When("the user clicks YES on Are you sure Dialog")
    public void the_user_clicks_yes_on_are_you_sure_dialog() {
    }
    @Then("the {string} will be deleted")
    public void the_will_be_deleted(String string) {
    }
    @When("the user clicks on delete button on the {string} in Pay Grades page")
    public void the_user_clicks_on_delete_button_on_the_in_pay_grades_page(String string) {
    }
    @Then("the {string} pay grade is deleted")
    public void the_pay_grade_is_deleted(String string) {
    }
}
