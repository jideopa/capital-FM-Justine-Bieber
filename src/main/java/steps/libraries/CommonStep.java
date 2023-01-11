package steps.libraries;

import base.Base;
import lombok.extern.log4j.Log4j2;
import org.awaitility.Awaitility;
import page.HomePage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Log4j2

public class CommonStep extends Base {
    private static HomePage homePage = new HomePage();
    private static Properties properties = new Properties();

    public void OpenPage(String page) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/test/resources/environment.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.get(properties.getProperty(page));
        Awaitility.await().atMost(5, TimeUnit.SECONDS);
        switchToIframe();
        Awaitility.await().atMost(15, TimeUnit.SECONDS).until(homePage.listenIcon::isDisplayed);
    }

    public void switchToIframe() {
        log.info("Switching to iframe");
        driver.switchTo().frame(properties.getProperty("iframe"));
        homePage.cookieAccept.click();
        driver.switchTo().defaultContent();
    }
}
