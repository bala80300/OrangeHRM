package org.OrangeHRM_BDD.Pages.Dashboard;


import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;

public class DashboardPage extends OrangeHRMBase {
    public boolean dashboardHeader() {
        return driver.findElement(By.xpath("//div/span/h6")).isDisplayed();

    }
}
