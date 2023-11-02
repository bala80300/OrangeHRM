package org.OrangeHRM_BDD.Pages.login;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.OrangeHRM_BDD.Pages.Dashboard.DashboardPage;
import org.openqa.selenium.By;

public class LoginPage extends OrangeHRMBase {
    public LoginPage loginTextDisplay() {
        driver.findElement(By.xpath("//div/h5")).isDisplayed();
        return this;
    }

    /**
     * @param username
     * @return
     * @description - get data from the user and type in the username field
     */
    public LoginPage enterUserName(String username) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        return this;
    }

    /**
     * @param password
     * @return
     * @description - get data from the user and type in the password field
     */
    public LoginPage enterPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        return this;
    }

    /**
     * @return
     * @description - click the login button
     */
    public DashboardPage clickLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new DashboardPage();
    }

    public LoginPage errorText() {
        driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
        return this;
    }
}
