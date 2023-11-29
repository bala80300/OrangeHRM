package org.OrangeHRM_BDD.Pages.Admin.Job;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JobTitlesPage extends OrangeHRMBase {
    public String getjobTitlesTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Job Titles']")).getText();
    }

    public void addButton() {
        driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    }
    public String getaddJobTitleTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Add Job Title']")).getText();
    }

    public void editButton(String jobTitleName) {
        driver.findElement(By.xpath("(//div[text()='" + jobTitleName + "']/following::i)[position() = 2]")).click();
    }

    public void deleteButton(String jobTitleName) {
        driver.findElement(By.xpath("(//div[text()='" + jobTitleName + "']/following::i)[position() = 1]")).click();
    }

    public void yesInconfirmationDialogButton() {
        driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
    }

    public void noInconfirmationDialogButton() {
        driver.findElement(By.xpath("//button[text()=' No, Cancel ']")).click();
    }

    public void jobTitleField(String jobTitleName) {
        WebElement jobTitleFieldLocator = driver.findElement(By.xpath("(//div/label[text()='Job Title']/following::div/input)[position()=1]"));
        if(jobTitleFieldLocator.getText()!="") {
         jobTitleFieldLocator.sendKeys(Keys.CONTROL+"a");
         jobTitleFieldLocator.sendKeys(Keys.DELETE);
         jobTitleFieldLocator.sendKeys(jobTitleName);
        }
        else {
            jobTitleFieldLocator.sendKeys(jobTitleName);
        }
    }
    public void jobDescriptionField(String jobDescription) {
        WebElement jobDescriptiontionFieldLocator = driver.findElement(By.xpath("//div/textarea[@placeholder='Type description here']"));
        if(jobDescriptiontionFieldLocator.getText()!="") {
            jobDescriptiontionFieldLocator.sendKeys(Keys.CONTROL+"a");
            jobDescriptiontionFieldLocator.sendKeys(Keys.DELETE);
            jobDescriptiontionFieldLocator.sendKeys(jobDescription);
        }
        else {
            jobDescriptiontionFieldLocator.sendKeys(jobDescription);
        }
    }
    public void noteField(String note) {
        WebElement noteFieldLocator = driver.findElement(By.xpath("//div/textarea[@placeholder='Add note']"));
        if(noteFieldLocator.getText()!="") {
            noteFieldLocator.sendKeys(Keys.CONTROL+"a");
            noteFieldLocator.sendKeys(Keys.DELETE);
            noteFieldLocator.sendKeys(note);
        }
        else {
            noteFieldLocator.sendKeys(note);
        }
    }
    public void saveButton() {
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();
    }
    public void cancelButton() {
        driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
    }
}
