package stepDefinitions.Login;

import io.cucumber.java.en.*;
import org.OrangeHRM_BDD.Pages.Dashboard.DashboardPage;
import org.OrangeHRM_BDD.Pages.login.LoginPage;

public class Login {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

//    @Given("the user logins the page with username and password")
//    public void the_user_logins_the_page_with_username_and_password (){
//        loginPage.login("Admin","admin123");
//    }

    @Given("the user is in login page")
    public void theUserIsInLoginPage() {
        loginPage.loginTextDisplay();
    }

    @When("the user enters <username> and <password>")
    public void theUserEntersUsernameAndPassword() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");

    }

    @And("clicks on Login  button")
    public void clicksOnLoginButton() {
        loginPage.clickLogin();
    }


    @Then("the dashboard page is displayed")
    public void theDashboardPageIsDisplayed() {
        dashboardPage.dashboardHeader();
    }
}