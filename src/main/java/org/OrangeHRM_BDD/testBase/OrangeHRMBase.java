package org.OrangeHRM_BDD.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMBase {

    public static WebDriver driver = null;

    public void initializeBrowser() {
        driver = new ChromeDriver();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void navigateToURL(String url) {
        driver.get(url);
    }

    public void quitBrowser() {
        driver.quit();
    }
}
