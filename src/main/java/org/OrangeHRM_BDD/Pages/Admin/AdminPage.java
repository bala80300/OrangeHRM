package org.OrangeHRM_BDD.Pages.Admin;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AdminPage extends OrangeHRMBase {
    public AdminPage selectAdminMenu() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
        return this;
    }

    public AdminPage totalRecords() {
        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]")).getText();
        return this;
    }

    public AdminPage enterUsernameForSearch(String username) {
        WebElement usernameLocator = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        usernameLocator.sendKeys(username);
        return this;
    }

    public AdminPage userRoleDropdown(String user_role) {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
        WebElement userRoleDropdownLocator = driver.findElement(By.xpath("//*[@role='listbox']//*[text()="+user_role+"]"));
        userRoleDropdownLocator.click();
        return this;
    }

    public AdminPage enterEmployeenameForSearch(String employee_name) {
        WebElement employeenameLocator = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        employeenameLocator.sendKeys(employee_name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        employeenameLocator.sendKeys(Keys.DOWN, Keys.RETURN);
        return this;
    }

    public AdminPage statusDropdown(String status) {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
        WebElement statusDropdownLocator = driver.findElement(By.xpath("//*[@role='option']//*[text()="+status+"]"));
        statusDropdownLocator.click();
        return this;
    }

    public AdminPage submitButton() {
        driver.findElement(By.xpath("//button[text()=' Search ']")).click();
        return this;
    }

    public AdminPage resetButton() {
        driver.findElement(By.xpath("//button[text()=' Reset ']")).click();
        return this;
    }

}
