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

    @When("^je sélectionne mes critères de \"([^\"]*)\" et \"([^\"]*)\"$")
    public void je_sélectionne_mes_critères_de_et(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        /// set a resolution
        /// coordonate a click to X * Y
        assertThat(driver.findElement(By.xpath("*[@id=\"react-content\"]/div/div/div[4]/div/div[1]/div/div/div/div[3]/p")).getText(), containsString(arg1));
        /// coordonate a click to X * Y
        assertThat(driver.findElement(By.xpath("*[@id=\"react-content\"]/div/div/div[4]/div/div[1]/div/div/div/div[3]/p")).getText(), containsString(arg2));

    }

    @Then("^je dois avoir un retour de données cohérent pour \"([^\"]*)\", (\\d+), (\\d+)kwh/jour$")
    public void je_dois_avoir_un_retour_de_données_cohérent_pour_kwh_jour(String arg1, int arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        // read the result in kwh
        // read the result % autoalimenté
        // read the result conso énergie estimée
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

}
