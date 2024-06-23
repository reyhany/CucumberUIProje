package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    WebDriver driver;
    LoginPage loginPage;



    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        //loginPage = new LoginPage(driver);
    }
    @When("The user enters valid credential")
    public void the_user_enters_valid_credential() {
       // loginPage.enterUsername("validUser");
       // loginPage.enterPassword("validPassword");
       // loginPage.clickLoginButton();
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("Clicked on submit");
    }
    @Then("The user should be logged in successfully")
    public void the_user_should_be_logged_in_succesfully() {
        System.out.println("I am logged in");
    }


}
