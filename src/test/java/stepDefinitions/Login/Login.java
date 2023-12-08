package stepDefinitions.Login;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Dashboard.DashboardPage;
import org.OrangeHRM_BDD.Pages.login.LoginPage;
import org.junit.Assert;

public class Login {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user is in login page")
    public void theUserIsInLoginPage() {
        loginPage.loginTextDisplay();
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
    }

    @And("clicks on Login button")
    public void clicksOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("the dashboard page is displayed")
    public void theDashboardPageIsDisplayed() {
        dashboardPage.dashboardHeader();
    }

    @Then("the error message should be displayed and it should not login")
    public void theErrorMessageShouldBeDisplayedAndItShouldNotLogin() {
        Assert.assertEquals(loginPage.errorText(),"Invalid credentials");
    }

    @Given("the user logins the page with valid credentials")
    public void theUserLoginsThePageWithValidCredentials() {
        theUserIsInLoginPage();
        the_user_enters_username_and_password("Admin", "admin123");
        clicksOnLoginButton();
        theDashboardPageIsDisplayed();
    }
}