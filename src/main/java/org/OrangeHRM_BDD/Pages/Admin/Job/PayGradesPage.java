package org.OrangeHRM_BDD.Pages.Admin.Job;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;


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

    //elements in currencies
    public String getCurrenciesTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Currencies']")).getText();
    }

    public void addButtonInCurrency() {
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    }

    public String currencyEntryInRecords(String currency) {
        return driver.findElement(By.xpath("//div[text()='" + currency + "']")).getText();
    }
    public String minimumSalaryEntryInRecords(String currency) {
        return driver.findElement(By.xpath("//div[text()='"+currency+"']/following::div[position()=2]")).getText();
    }
    public String maximumSalaryEntryInRecords(String currency) {
        return driver.findElement(By.xpath("//div[text()='"+currency+"']/following::div[position()=4]")).getText();
    }

    //elements in Add Currency
    public String getAddCurrencyTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Add Currency']")).getText();
    }

    public void currencyDropdown(String currency) {
        driver.findElement(By.xpath("//*[@role='listbox']//*[text()='" + currency + "']")).click();
    }

    public void minimumSalaryField(String minimumSalary) {
        driver.findElement(By.xpath("//div/label[text()='Minimum Salary']//following::input[position()=1]")).sendKeys(minimumSalary);
    }

    public void maximumSalaryField(String maximumSalary) {
        driver.findElement(By.xpath("//div/label[text()='Maximum Salary']//following::input[position()=1]")).sendKeys(maximumSalary);
    }

    //elements in Edit currency
    public String getEditCurrencyTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Edit Currency']")).getText();
    }
}
