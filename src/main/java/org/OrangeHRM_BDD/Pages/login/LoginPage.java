package org.OrangeHRM_BDD.Pages.login;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;

public class LoginPage extends OrangeHRMBase {
    public Boolean loginTextDisplay() {
       return driver.findElement(By.xpath("//div/h5")).isDisplayed();
    }

    /**
     * @param username
     * @return
     * @description - get data from the user and type in the username field
     */
    public void enterUserName(String username) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    }

    /**
     * @param password
     * @return
     * @description - get data from the user and type in the password field
     */
    public void enterPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    /**
     * @return
     * @description - click the login button
     */
    public void clickLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public String errorText() {
        return driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
    }
}
