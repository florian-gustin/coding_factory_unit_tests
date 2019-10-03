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

//	@Given("^je suis sur la homepage$")
//	public void je_suis_sur_la_homepage() throws Throwable {
//		driver.get(" https://www.tesla.com/fr_FR/");
//	}
//
//	@Then("^le titre doit être \"([^\"]*)\"$")
//	public void le_titre_doit_être(String arg1) throws Throwable {
//	    assertEquals(driver.getTitle(), arg1);
//	}
//
//	@Then("^la description contient \"([^\"]*)\"$")
//	public void la_description_doit_être(String arg1) throws Throwable {
//		// By CSS Selector
//		assertTrue(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content").contains(arg1));
//		// By XPATH, si vous préférez...
//	    // assertEquals(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), arg1);
//	}

	//////////

	@Given("^je suis sur homepage_navbar$")
	public void je_suis_sur_homepage_navbar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(" https://www.tesla.com/fr_FR/");
	}

	@Then("^le titre navbar doit être \"([^\"]*)\"$")
	public void le_titre_navbar_doit_être(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switch (arg1) {
			case "Model 3":
				assertThat(driver.findElement(By.cssSelector("#item1-812530015-content > div:nth-child(1) > h1:nth-child(1)")).getText(), containsString(arg1));
				break;
			case "Découvrir Tesla":
				assertThat(driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/div/div/div/section[2]/section/div/div[2]/div[2]/div[1]/header/h1/span")).getText(), containsString(arg1));
				break;
			case "Une alimentation pour tous vos objets":
				assertThat(driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/div/div/div/section[3]/section/div/div/div[2]/div[1]/header/h1/span")).getText(), containsString(arg1));
				break;
			case "Accessoires Tesla":
				assertThat(driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/div/div/div/section[4]/section/div/div/div[2]/div[1]/header/h1/span")).getText(), containsString(arg1));
				break;
			case "Tesla Model Y":
				assertThat(driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/div/div/div/section[5]/section/div/div/div[2]/div[1]/header/h1/span[1]")).getText(), containsString("Tesla"));
				assertThat(driver.findElement(By.xpath("/html/body/div[1]/main/section/section/div/div/div/div/section[5]/section/div/div/div[2]/div[1]/header/h1/span[2]")).getText(), containsString("Model Y"));
				break;
		}

	}

//	@Given("^je suis sur homepage_top_navbar$")
//	public void je_suis_sur_homepage_top_navbar() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		driver.get(" https://www.tesla.com/fr_FR/");
//	}
//
//	@Then("^le titre topnavbar doit être \"([^\"]*)\"$")
//	public void le_titre_topnavbar_doit_être(String arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//
//	}
//
//	@When("^je clique cela me redirige vers les modèles \"([^\"]*)\"$")
//	public void je_clique_cela_me_redirige_vers_les_modèles(String arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//	}
//
//	@Given("^je suis sur homepage_burger_menu$")
//	public void je_suis_sur_homepage_burger_menu() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		driver.get(" https://www.tesla.com/fr_FR/");
//		throw new PendingException();
//	}
//
//	@Then("^le titre burger_menu doit être \"([^\"]*)\"$")
//	public void le_titre_burger_menu_doit_être(String arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}
//
//	@When("^je clique cela me redirige vers les sections \"([^\"]*)\"$")
//	public void je_clique_cela_me_redirige_vers_les_sections(String arg1) throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
//	}




	/////////

	@After
	public void afterScenario() {
		driver.quit();
	}

}
