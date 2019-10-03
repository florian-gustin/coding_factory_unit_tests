package test;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import codingfactory.rpgconsole.hero.Hero;
import codingfactory.rpgconsole.enemy.Enemy;

public class HeroTest {

	Hero hero;
	Enemy enemy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Avant le démarrage");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Après tous les tests");
	}

	@Before
	public void setUp() throws Exception {
		hero = new Hero("Jaina Portvaillant");
		System.out.println("Avant un test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Après un test");
	}

	@Test
	public void testHeroLevelUp() throws Exception {
		hero.levelUp();
		assertThat(hero, hasProperty("level", is(2)));
	}

	@Test
	public void testHeroProperties() throws Exception {
		assertThat(hero, hasProperty("name"));
        assertThat(hero, hasProperty("name", is("Jaina Portvaillant")));
		assertThat(hero, hasProperty("level"));
		assertThat(hero, hasProperty("hp"));
		assertThat(hero, hasProperty("atk"));
	}

	@Test
	public void testHeroHpChanges() throws Exception {
		Hero heroTest = new Hero("Goku");
		Integer hpStart = heroTest.getHp();
		heroTest.takeDamage(5);
		assertNotEquals(heroTest.getHp(), hpStart);
	}

	@Test
	public void testHeroAtk() throws Exception {
		Enemy enemyTest = new Enemy("Rondoudou", 1);
		Integer hpStart = enemyTest.getHp();
		hero.attack(enemyTest);
		assertNotEquals(enemyTest, hpStart);
	}


}
