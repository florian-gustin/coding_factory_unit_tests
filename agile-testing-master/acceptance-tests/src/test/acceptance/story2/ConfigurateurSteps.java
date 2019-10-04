package test.acceptance;

import java.util.concurrent.TimeUnit;

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

public class ConfigurateurSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver", "/Library/Java/JUNIT/chromedriver");
        driver = new ChromeDriver();
        // Seems no more working in last Chrome versions
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Given("^Je suis sur la page d'accueil$")
    public void je_suis_sur_la_page_d_accueil() throws Throwable {
        driver.get("https://www.tesla.com/fr_FR/");
    }

    @When("^Cliquer sur le bouton de navigation ammenant au modèle S situé en bas$")
    public void cliquer_sur_le_bouton_de_navigation_ammenant_au_modèle_S_situé_en_bas() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@data-activeslide='item0-812530016']")).click();
    }

    @When("^Cliquer sur le bouton Commander$")
    public void cliquer_sur_le_bouton_Commander() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//a[@title='Commander la Model S']")).click();
    }

    @Then("^L'url du configurateur doit être \"([^\"]*)\"$")
    public void l_url_du_configurateur_doit_être(String arg1) throws Throwable {
        driver.get("https://www.tesla.com/fr_FR/");
        driver.findElement(By.xpath("//button[@data-activeslide='item0-812530016']")).click();
        assertEquals(driver.findElement(By.xpath("//a[@title='Commander la Model S']")).getAttribute("href"), arg1);

    }

    @Given("^Je suis sur la page du configurateur$")
    public void je_suis_sur_la_page_du_configurateur() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.tesla.com/fr_FR/models/design#battery");
    }

    @Then("^Le prix affiché est un \"([^\"]*)\" de \"([^\"]*)\"$")
    public void le_prix_affiché_est_un_de(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(driver.findElement(By.xpath("//div[@class='financetype-selector--button']")).getText(), arg1);
        assertEquals(driver.findElement(By.xpath("//p[@class='finance-item--price finance-item--price-before-savings']")).getText(), arg2);
    }

    @When("^je sélectionne le \"([^\"]*)\"$")
    public void je_sélectionne_le(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (arg1 == "Performance") {
            driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div[1]/div/span/p")).click();
        } else {
            driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[2]/div[2]/div/div[3]/div/div[3]/div[1]/div/div")).click();
        }

    }

    @When("^Je sélectionne le mode paiement \"([^\"]*)\"$")
    public void je_sélectionne_le_mode_paiement(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[3]/div/div/div/div[1]/div/div")).click();
        driver.findElement(By.xpath("//li[@data-label='LOA BUSINESS']")).click();
    }

    @Then("^Les mensualités sont de \"([^\"]*)\"$")
    public void les_mensualités_sont_de(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (arg1 == "A partir de 1 115 € /mois*") {
            driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div[1]/div/span/p")).click();
        }
    }

    @Then("^Les économies de carburant estimées sont de \"([^\"]*)\"$")
    public void les_économies_de_carburant_estimées_sont_de(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[3]/div/div/div/div[2]/div[2]/p")).getText(), arg1);
    }

    @Then("^Le montant total au terme du contrat est de \"([^\"]*)\"$")
    public void le_montant_total_au_terme_du_contrat_est_de(String arg1) throws Throwable {
        if (arg1 == "122 068 €") {
            driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div[1]/div/span/p")).click();
        }
        driver.findElement(By.xpath("//a[@class='finance-content--modal']")).click();

        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[2]/div[2]/div/div/div[1]/label[2]")).click();

        assertEquals(driver.findElement(By.xpath("//*[@id='totalLeaseAmount']")).getAttribute("value"), arg1);


    }

    @Given("^Je suis à l'étape \"([^\"]*)\"$")
    public void je_suis_à_l_étape(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.tesla.com/fr_FR/models/design#battery");
    }


    @When("^Je clique sur \"([^\"]*)\"$")
    public void je_clique_sur(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//li[@label='autopilot']")).click();
        
    }

    @When("^Cliquer sur \"([^\"]*)\"$")
    public void cliquer_sur(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div/div/main/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[2]/div[1]/i']")).click();
    }

    @Then("^Le \"([^\"]*)\" passe de \"([^\"]*)\" à \"([^\"]*)\" soit une augmentation de (\\d+)E/mois$")
    public void le_passe_de_à_soit_une_augmentation_de_E_mois(String arg1, String arg2, String arg3, int arg4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Je clique sur le logo TESLA")
    public void je_clique_sur_le_logo_TESLA() throws Throwable {
        driver.findElement(By.xpath("//a[@class='tsla-header-main--logo tds-icon tds-icon-wordmark']")).click();

    }

    @When("^Je vais en bas de page et je clique sur \"([^\"]*)\"$")
    public void je_vais_en_bas_de_page_et_je_clique_sur(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
        driver.findElement(By.xpath("//a[@title='Localisations']")).click();
    }

    @Then("^Cela me redirige sur \"([^\"]*)\"$")
    public void cela_me_redirige_sur(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(driver.getCurrentUrl(), arg1);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

}