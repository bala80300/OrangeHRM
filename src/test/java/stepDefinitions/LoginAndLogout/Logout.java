package stepDefinitions.LoginAndLogout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.OrangeHRM_BDD.Pages.Dashboard.DashboardPage;
import org.OrangeHRM_BDD.Pages.login.LoginPage;
import org.junit.Assert;

public class Logout extends DashboardPage {
    LoginPage loginPage = new LoginPage();
    @Given("the user is in dashboard page")
    public void theUserIsInDashboardPage() {
        Assert.assertTrue(dashboardHeader());
    }

    @When("the user clicks on profile button")
    public void theUserClicksOnProfileButton() {
        profileDropdown();
    }

    @And("a dropdown is opened and click on Logout")
    public void aDropdownIsOpenedAndClickOnLogout() {
        logoutLink();
    }

    @Then("the user logged out and login page is displayed")
    public void theUserLoggedOutAndLoginPageIsDisplayed() {
        Assert.assertTrue(loginPage.loginTextDisplay());
    }
}
