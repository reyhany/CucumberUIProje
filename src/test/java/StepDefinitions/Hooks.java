package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Slf4j
public class Hooks {

    public static WebDriver driver;

    @Before
    public void setupAndInitialize(Scenario scenario) {
        // Senaryo bilgilerini yazdır
        System.out.println("===================================");
        System.out.println("Scenario name :: " + scenario.getName());
        System.out.println("Scenario tags :: " + scenario.getSourceTagNames());
        System.out.println(":::::::::::::::::::::::::::::::::::");

        // WebDriver'ı başlat
        log.info("Before Method");
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        log.info("Hash code {}", driver.hashCode());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void teardownAndLog() {
        // Senaryo bitiş bilgilerini yazdır
        System.out.println("====================================");

        // WebDriver'ı kapat
        log.info("After Method");
        if (driver != null) {
            driver.quit();
        }
    }

}
