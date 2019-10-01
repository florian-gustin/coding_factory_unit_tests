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
import codingfactory.rpgconsole.game.Game;

import java.lang.reflect.Method;

public class GameTest {

    Game testGame;

    String newHeroName;
    String newEnemyName;

    @Before
	public void setUp() throws Exception {
        this.testGame = new Game();
		this.newHeroName = "Gentil Gentil";
        this.newEnemyName = "Mechant Mechant" ;
		System.out.println("Avant un test");
	}

    @Test
    public void testCreateNewHero() throws Exception {
        // String newHeroName = this.newHeroName;
        // Hero newHero = Game.createNewHero();
        // Assert.assertNotNull(newHero);

        Game testGame = new Game();
        Method method = Game.class.getDeclaredMethod("createNewHero");
        method.setAccessible(true);
        Hero newHero = (Hero) method.invoke(testGame);
        assertNotNull(newHero);

        
    }

    @Test
    public void testCreateNewEnemy() throws Exception {

    }
}