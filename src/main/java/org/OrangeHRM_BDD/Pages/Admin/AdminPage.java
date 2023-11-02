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

    public String totalRecords() {
        return driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]")).getText();
    }

    public AdminPage enterUsernameForSearch(String username) {
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys(username);
        return this;
    }

    public AdminPage userrole() {
        WebElement userroleDropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
        userroleDropdown.sendKeys(Keys.DOWN, Keys.RETURN);
        return this;
    }

    public AdminPage enterEmployeenameForSearch(String employee_name) throws InterruptedException {
        WebElement employeenameElement = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        employeenameElement.sendKeys(employee_name);
        Thread.sleep(2000);
        employeenameElement.sendKeys(Keys.DOWN, Keys.RETURN);
        return this;
    }

    public AdminPage status() {
        WebElement statusDropdown = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
        statusDropdown.sendKeys(Keys.DOWN, Keys.RETURN);
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
