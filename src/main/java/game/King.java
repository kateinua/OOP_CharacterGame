package game;

import java.util.Random;

public class King extends Character {
    static final int MIN_POWER = 5;
    static final int MAX_POWER = 15;
    static final int MIN_HP = 5;
    static final int MAX_HP = 15;

    public King() {

        super(MIN_POWER, MAX_POWER, MIN_HP, MAX_HP);
        setName("King");
    }

    @Override
    void kick(Character c) {
        int strength = new Random().nextInt(this.power-1)+1;
        c.hp -= strength;
    }
}
