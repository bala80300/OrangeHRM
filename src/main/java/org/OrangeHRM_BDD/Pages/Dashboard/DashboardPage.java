package org.OrangeHRM_BDD.Pages.Dashboard;


import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;

public class DashboardPage extends OrangeHRMBase {
    public boolean dashboardHeader() {
        return driver.findElement(By.xpath("//div/span/h6[text()='Dashboard']")).isDisplayed();
    }
    public void profileDropdown() {
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
    }
    public void logoutLink() {
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
}
