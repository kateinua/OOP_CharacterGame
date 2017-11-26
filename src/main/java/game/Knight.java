package game;

import java.util.Random;

public class Knight extends Character {
    private static final int MIN_POWER = 2;
    private static final int MAX_POWER = 12;
    private static final int MIN_HP = 2;
    private static final int MAX_HP = 21;
    public Knight() {
        super(MIN_POWER, MAX_POWER, MIN_HP, MAX_HP);
        setName("Knight");
    }

    @Override
    void kick(Character c) {
        int strength = new Random().nextInt(this.getPower() - 1) + 1;
        c.setHp(c.getHp() - strength);
    }
}
