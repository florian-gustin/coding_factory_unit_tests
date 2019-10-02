package test.functional;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.hamcrest.core.StringContains;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {

	private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
	    	// Seems no more working in last Chrome versions
		// driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }

    // Test de la Story #1-homepage (https://trello.com/c/WKTneu9o/1-homepage)
	@Test
    public void testHomepage() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/");
//		assertEquals(driver.getTitle(), "Partagez vos passions | Meetup");
//        assertThat(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), not("Partagez vos passions et faites bouger votre ville ! Meetup vous aide à rencontrer des personnes près de chez vous, autour de vos centres d'intérêt."));
        assertThat(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), containsString("Partagez vos passions et faites bouger votre ville"));
        assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Le monde vous tend les bras");
        assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[3]/main/div[1]/div/section/div/div[2]/p/span")).getText(), "Rejoignez un groupe local pour rencontrer du monde, tester une nouvelle activité ou partager vos passions.");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"joinMeetupButton\"]")).getAttribute("href"), "https://www.meetup.com/fr-FR/register/");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"joinMeetupButton\"]")).getText(), "Rejoindre Meetup");
    }

    @Test
    public void testSearchPage() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/find/outdoors-adventure/");
        assertThat(driver.getTitle(), containsString("Nature et aventure"));
        assertThat(driver.findElement(By.xpath("//h1")).getText(), containsString("Nature et aventure"));
    }



    // Test de la Story n ...
    // TODO
    // To Be Completed By Coders From Coding Factory

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
