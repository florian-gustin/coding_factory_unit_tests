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

public class HomepageSteps {

	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		// Seems no more working in last Chrome versions
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
//----------------------------------------------------------------------------------------------------

	@Given("^je suis sur la homepage$")
	public void je_suis_sur_la_homepage() throws Throwable {
		driver.get(" https://www.tesla.com/fr_FR/");
	}

	@Then("^le titre doit être \"([^\"]*)\"$")
	public void le_titre_doit_être(String arg1) throws Throwable {
	    assertEquals(driver.getTitle(), arg1);
	}

	@Then("^la description contient \"([^\"]*)\"$")
	public void la_description_doit_être(String arg1) throws Throwable {
		// By CSS Selector
		assertTrue(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content").contains(arg1));
		// By XPATH, si vous préférez...
	    // assertEquals(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), arg1);
	}
//----------------------------------------------------------------------------------------------------

	@Given("^je suis sur homepage_navbar$")
	public void je_suis_sur_homepage_navbar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	@Then("^le titre de la navbar doit être  \"([^\"]*)\"$")
	public void le_titre_de_la_navbar_doit_être(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



//----------------------------------------------------------------------------------------------------

	@Given("^je suis sur homepage_top_navbar$")
	public void je_suis_sur_homepage_top_navbar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^le titre du lien doit être \"([^\"]*)\"$")
	public void le_titre_du_lien_doit_être(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^je clique cela me redirige vers \"([^\"]*)\"$")
	public void je_clique_cela_me_redirige_vers(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

//----------------------------------------------------------------------------------------------------
	@Given("^je suis sur homepage_burger_menu$")
	public void je_suis_sur_homepage_burger_menu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	@Then("^le titre du lien  du menu_burger doit être \"([^\"]*)\"$")
	public void le_titre_du_lien_du_menu_burger_doit_être(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^je clique cela me redirige vers l'url : \"([^\"]*)\"$")
	public void je_clique_cela_me_redirige_vers_l_url(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
//----------------------------------------------------------------------------------------------------


	@After
	public void afterScenario() {
		driver.quit();
	}

}
