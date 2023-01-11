package steps.definition;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.chrome.ChromeDriver;

@Log4j2
public class Hooks extends Base {
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        log.info("Setup Completed");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
