package Pages;


import Utilities.Driver;
import Utilities.Environments;
import Utilities.PropManager;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


@Slf4j
public abstract class BasePage {
    public static final String env = Environments.PRODUCTION.name();
    public static final WebDriver driver = Driver.get(env);

    public static final Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofMillis(Long.parseLong(PropManager.getProperties(env,"duration"))))
            .pollingEvery(Duration.ofMillis(1000))
            .ignoring(NoSuchElementException.class);
    public BasePage(){
        PageFactory.initElements(driver,this);
        //ortak kullanilan locate ler de buraya yazilacak
    }

    public Actions actions=new Actions(Driver.get(env));
    public Faker faker=new Faker();
    public final SoftAssert softAssert=new SoftAssert();


    public void waitAndClick(WebElement element){
        long start = System.currentTimeMillis();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        log.info("Clicked in {}ms", System.currentTimeMillis() - start);
    }


}