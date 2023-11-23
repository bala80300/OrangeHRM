package org.OrangeHRM_BDD.Pages.Admin.UserManagement;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddUsersPage extends OrangeHRMBase {
    public void selectAdminMenu() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
    }

    public void userRoleDropdown(String userRole) {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
        WebElement userRoleDropdownLocator = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='" + userRole + "']"));
        userRoleDropdownLocator.click();
    }

    public void statusDropdown(String status) {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
        WebElement statusDropdownLocator = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='" + status + "']"));
        statusDropdownLocator.click();
    }

    public void enterEmployeenameForAdd(String employee_name) {
        WebElement employeenameLocator = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        employeenameLocator.sendKeys(employee_name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//div[@role='option']")).click();
    }

    public void enterUsernameForAdd(String username) {
        WebElement usernameLocator = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        usernameLocator.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordLocator = driver.findElement(By.xpath("(//input[@type='password'])[position()=1]"));
        passwordLocator.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        WebElement passwordLocator = driver.findElement(By.xpath("(//input[@type='password'])[position()=2]"));
        passwordLocator.sendKeys(confirmPassword);
    }

    public void saveButton() {
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();
    }

    public void cancelButton() {
        driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
    }
}
