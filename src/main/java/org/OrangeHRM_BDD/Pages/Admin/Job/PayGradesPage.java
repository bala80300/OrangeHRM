package org.OrangeHRM_BDD.Pages.Admin.Job;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class PayGradesPage extends OrangeHRMBase {
    //elements in pay grade page
    public String getPayGradesTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Pay Grades']")).getText();
    }

    public void addButton() {
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    }

    public void editButton(String name) {
        driver.findElement(By.xpath("(//div[text()='" + name + "']/following::i)[position() = 2]")).click();
    }

    public void deleteButton(String name) {
        driver.findElement(By.xpath("(//div[text()='" + name + "']/following::i)[position() = 1]")).click();
    }

    public String nameLocatorInPayGrades(String name) {
        return driver.findElement(By.xpath("//div[text()='" + name + "'][position()=1]")).getText();
    }
    public String currencyLocatorInPayGrades(String name) {
        return driver.findElement(By.xpath("//div[text()='" + name + "']//following::div[position()=1]")).getText();
    }

    //elements in Add & edit Pay Grade
    public String getAddPayGradeTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Add Pay Grade']")).getText();
    }

    public String getEditPayGradeTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Edit Pay Grade']")).getText();
    }

    public void nameField(String name) {
        driver.findElement(By.xpath("//div/label[text()='Name']/following::input")).sendKeys(name);
    }

    public void saveButton() {
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();
    }

    public void cancelButton() {
        driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
    }
    public void updatedNameField(String updatedName) {
        WebElement nameFieldLocator = driver.findElement(By.xpath("//div/label[text()='Name']/following::input"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nameFieldLocator.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        nameFieldLocator.sendKeys(updatedName);
    }

    //elements in currencies
    public String getCurrenciesTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Currencies']")).getText();
    }

    public void addButtonInCurrency() {
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    }

    //elements in Add Currency
    public String getAddCurrencyTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Add Currency']")).getText();
    }

    public void currencyDropdown(String currency) {
        driver.findElement(By.xpath("//div/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
        driver.findElement(By.xpath("//div[@role='listbox']//span[text()='" + currency + "']")).click();
    }

    public void minimumSalaryField(String minimumSalary) {
        driver.findElement(By.xpath("//div/label[text()='Minimum Salary']//following::input[position()=1]")).sendKeys(minimumSalary);
    }

    public void maximumSalaryField(String maximumSalary) {
        driver.findElement(By.xpath("//div/label[text()='Maximum Salary']//following::input[position()=1]")).sendKeys(maximumSalary);
    }
    public void saveButtonInAddCurrency() {
        driver.findElement(By.xpath("(//button[text()=' Save '])[position()=2]")).click();
    }


    //elements in Edit currency
    public String getEditCurrencyTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Edit Currency']")).getText();
    }
    public void updatedMinimumSalaryField(String updatedMinimumSalary) {
        WebElement minimumSalaryFieldLocator = driver.findElement(By.xpath("//div/label[text()='Minimum Salary']//following::input[position()=1]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        minimumSalaryFieldLocator.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        minimumSalaryFieldLocator.sendKeys(updatedMinimumSalary);
    }
    public void updatedMaximumSalaryField(String updatedMaximumSalary) {
        WebElement maximumSalaryFieldLocator = driver.findElement(By.xpath("//div/label[text()='Maximum Salary']//following::input[position()=1]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        maximumSalaryFieldLocator.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        maximumSalaryFieldLocator.sendKeys(updatedMaximumSalary);
    }
    public boolean currencyDropdownVisibility() {
        return driver.findElement(By.xpath("//label[text()='Currency']/following::input[position()=1]")).isEnabled();
    }
}
