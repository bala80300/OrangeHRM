package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.OrangeHRM_BDD.testBase.OrangeHRMBase;

public class Hooks {
    OrangeHRMBase base = new OrangeHRMBase();

    @Before
    public void setUp() {
        base.initializeBrowser();
        base.maximizeBrowser();
        base.implicitWait();
        base.navigateToURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @After
    public void tearDown() {
        base.quitBrowser();
    }
}

