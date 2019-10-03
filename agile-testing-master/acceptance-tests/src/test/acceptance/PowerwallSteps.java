package test.acceptance;

import java.util.concurrent.TimeUnit;
import java.util.*;

import java.lang.*;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class PowerwallSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
        driver = new ChromeDriver();
        // Seems no more working in last Chrome versions
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^je suis sur la page Powerwall$")
    public void je_suis_sur_la_page_Powerwall() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.tesla.com/fr_FR/powerwall");
    }

    @When("^je sélectionne mes critères \"([^\"]*)\"$")
    public void je_sélectionne_mes_critères(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^je dois avoir le bon retour de données \"([^\"]*)\"$")
    public void je_dois_avoir_le_bon_retour_de_données(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //*[@id="react-content"]/div/div/div[4]/div/div[1]/div/div/div/div[3]/p

    @After
    public void afterScenario() {
        driver.quit();
    }

}
