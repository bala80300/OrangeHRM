package org.OrangeHRM_BDD.Pages.Admin.Job;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;

public class JobDropdownsPage extends OrangeHRMBase {
    public void job() {
        driver.findElement(By.xpath("//span[text()='Job ']")).click();
    }
    public void jobTitles() {
        driver.findElement(By.linkText("Job Titles")).click();
    }
    public void payGrades() {
        driver.findElement(By.linkText("Pay Grades")).click();
    }
    public void employmentStatus() {
        driver.findElement(By.linkText("Employment Status")).click();
    }
    public void jobCategories() {
        driver.findElement(By.linkText("Job Categories")).click();
    }
    public void workShifts() {
        driver.findElement(By.linkText("Work Shifts")).click();
    }
}
