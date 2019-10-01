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

public class EnemyTest {

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
    public void testEnemyProperties() throws Exception {
        Enemy enemyTest = new Enemy("Sylvannas", 1);

        assertThat(enemyTest, hasProperty("name"));
        assertThat(enemyTest, hasProperty("hp"));
        assertThat(enemyTest, hasProperty("level"));
        assertThat(enemyTest, hasProperty("atk"));
    }

    @Test
    public void testEnemyTakeDamage() throws Exception {
        Enemy enemyTest = new Enemy("Sylvannas", 1);
        Integer hpStart = enemyTest.getHp();
        enemyTest.takeDamage(5);
        assertNotEquals(enemyTest.getHp(), hpStart);
    }

    @Test
    public void testEnnemyAttack() throws  Exception {
        Hero hero = new Hero("Doryan");
        Enemy monster = new Enemy("Cedric", 1);
        Integer hpHero = hero.getHp();
        monster.attack(hero);
        assertNotEquals(hero.getHp(), hpHero);
    }

}