package org.OrangeHRM_BDD.Pages.Admin.Job;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JobTitlesPage extends OrangeHRMBase {
    public String getjobTitlesTitle() {
        return driver.findElement(By.xpath("//div/h6[text()='Job Titles']")).getText();
    }

    public String totalJobRecords() {
        return driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[position()=1]")).getText();
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

    public void deleteButton(String updatedJobTitle) {
        driver.findElement(By.xpath("(//div[text()='" + updatedJobTitle + "']/following::i)[position() = 1]")).click();
    }

    public void yesInconfirmationDialogButton() {
        driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
    }

    public void noInconfirmationDialogButton() {
        driver.findElement(By.xpath("//button[text()=' No, Cancel ']")).click();
    }

    public void jobTitleField(String jobTitleName) {
        WebElement jobTitleFieldLocator = driver.findElement(By.xpath("(//div/label[text()='Job Title']/following::div/input)[position()=1]"));
        jobTitleFieldLocator.sendKeys(jobTitleName);
    }

    public void jobDescriptionField(String jobDescription) {
        WebElement jobDescriptiontionFieldLocator = driver.findElement(By.xpath("//div/textarea[@placeholder='Type description here']"));
        jobDescriptiontionFieldLocator.sendKeys(jobDescription);
    }

    public void noteField(String note) {
        WebElement noteFieldLocator = driver.findElement(By.xpath("//div/textarea[@placeholder='Add note']"));
        noteFieldLocator.sendKeys(note);
    }

    public void saveButton() {
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();
    }

    public void cancelButton() {
        driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
    }

    public void updatedJobTitleField(String updatedJobTitle) {
        WebElement jobTitleFieldLocator = driver.findElement(By.xpath("(//div/label[text()='Job Title']/following::div/input)[position()=1]"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        jobTitleFieldLocator.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.BACK_SPACE));
        jobTitleFieldLocator.sendKeys(updatedJobTitle);
    }

    public void updatedJobDescriptionField(String updatedJobDescription){
        WebElement jobDescriptiontionFieldLocator = driver.findElement(By.xpath("//div/textarea[@placeholder='Type description here']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        jobDescriptiontionFieldLocator.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.BACK_SPACE));
        jobDescriptiontionFieldLocator.sendKeys(updatedJobDescription);
    }
    public void updatedNoteField(String updatedNote) {
        WebElement noteFieldLocator = driver.findElement(By.xpath("//div/textarea[@placeholder='Add note']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        noteFieldLocator.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.BACK_SPACE));
        noteFieldLocator.sendKeys(updatedNote);
    }


}
