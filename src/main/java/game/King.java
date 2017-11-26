package game;

import java.util.Random;

public class King extends Character {
    private static final int MIN_POWER = 5;
    private static final int MAX_POWER = 15;
    private static final int MIN_HP = 5;
    private static final int MAX_HP = 15;

    public King() {

        super(MIN_POWER, MAX_POWER, MIN_HP, MAX_HP);
        setName("King");
    }

    @Override
    void kick(Character c) {
        int strength = new Random().nextInt(this.getPower() - 1) + 1;
        c.setHp(c.getHp() - strength);
    }
}
