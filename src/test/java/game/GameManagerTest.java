package game;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {
    @Test
    public void fight() throws Exception {

        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        new GameManager().fight(c1, c2);
        if (!(c1.name.equals("Hobbit") && c2.name.equals("Hobbit"))){
            assertFalse(c1.isAlive() && c2.isAlive());
        }
    }

    public void testHobbits() {
        Hobbit h1 = new Hobbit();
        Hobbit h2 = new Hobbit();
        new GameManager().fight(h1, h2);
        assertTrue(h1.isAlive());
        assertTrue(h2.isAlive());
    }
}