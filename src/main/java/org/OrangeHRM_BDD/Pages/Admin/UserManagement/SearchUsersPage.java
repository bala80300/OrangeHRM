package org.OrangeHRM_BDD.Pages.Admin.UserManagement;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchUsersPage extends OrangeHRMBase {
    public void selectAdminMenu() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
    }
    public String getSystemUserTitle() {
        return driver.findElement(By.xpath("//div/h5")).getText();
    }

    public String totalRecords() {
        WebElement recordMessage = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]"));
        return recordMessage.getText();
    }

    public String searchedUserDisplayMessage() {
        return driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]")).getText();
    }

    public void enterUsernameForSearch(String username) {
        WebElement usernameLocator = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        usernameLocator.sendKeys(username);
    }

    public void userRoleDropdown(String userRole) {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
        WebElement userRoleDropdownLocator = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='" + userRole + "']"));
        userRoleDropdownLocator.click();
    }

    public void enterEmployeenameForSearch(String employee_name) {
        WebElement employeenameLocator = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        employeenameLocator.sendKeys(employee_name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//div[@role='option']")).click();
    }

    public void statusDropdown(String status) {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
        WebElement statusDropdownLocator = driver.findElement(By.xpath("//*[@role='listbox']//*[text()='" + status + "']"));
        statusDropdownLocator.click();
    }

    public void searchButton() {
        driver.findElement(By.xpath("//button[text()=' Search ']")).click();
    }

    public void resetButton() {
        driver.findElement(By.xpath("//button[text()=' Reset ']")).click();
    }

    public void addButton() {
        driver.findElement(By.xpath(" //button[text()=' Add ']")).click();
    }

}
