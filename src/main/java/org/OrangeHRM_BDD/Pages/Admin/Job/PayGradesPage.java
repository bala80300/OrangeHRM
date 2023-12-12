package org.OrangeHRM_BDD.Pages.Admin.Job;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayGradesPage extends OrangeHRMBase {
    public void addButton() {
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    }

    public void editButton(String name) {
        driver.findElement(By.xpath("(//div[text()='" + name + "']/following::i)[position() = 2]")).click();
    }

    public void deleteButton(String name) {
        driver.findElement(By.xpath("(//div[text()='" + name + "']/following::i)[position() = 1]")).click();
    }

    public void nameLocator(String name) {
        driver.findElement(By.xpath("//div[text()='" + name + "'][position()=1]")).getText();
    }

    //elements in Add & edit Pay Grade
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
    public void addButtonInCurrency() {
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    }
    //elements in Add Currency
    public void currencyDropdown(String currency) {
        driver.findElement(By.xpath("//*[@role='listbox']//*[text()='" + currency + "']")).click();
    }


}
