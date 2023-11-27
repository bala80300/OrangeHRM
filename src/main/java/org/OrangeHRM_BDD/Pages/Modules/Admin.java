package org.OrangeHRM_BDD.Pages.Modules;

import org.OrangeHRM_BDD.testBase.OrangeHRMBase;
import org.openqa.selenium.By;

public class Admin extends OrangeHRMBase {
    public void selectAdminMenu() {
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
    }
}