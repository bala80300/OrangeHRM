package org.OrangeHRM_BDD.Pages.Admin;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;

public class AdminPage extends OrangeHRMBase {
    public void selectAdminMenu() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
    }
}
