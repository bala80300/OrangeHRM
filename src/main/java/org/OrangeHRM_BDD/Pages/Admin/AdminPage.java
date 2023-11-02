package org.OrangeHRM_BDD.Pages.Admin;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends OrangeHRMBase {
    public AdminPage selectAdminMenu() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        return this;
    }
    public String totalRecords() {
        return driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]")).getText();
    }

    public AdminPage enterUsernameForSearch(String username) {
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(username);
        return this;
    }
    public AdminPage userrole(String user_Role) {
        WebElement dropdown = driver.findElement(By.className("oxd-select-wrapper"));
        Select userroleDropDown = new Select(dropdown);
        userroleDropDown.selectByVisibleText(user_Role);
        return this;
    }

}
