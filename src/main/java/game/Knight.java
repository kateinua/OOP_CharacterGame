package game;

import java.util.Random;

public class Knight extends Character {
    static final int MIN_POWER = 2;
    static final int MAX_POWER = 12;
    static final int MIN_HP = 2;
    static final int MAX_HP = 21;
    public Knight() {
        super(MIN_POWER, MAX_POWER, MIN_HP, MAX_HP);
        setName("Knight");
    }

    @Override
    void kick(Character c) {
        int strength = new Random().nextInt(this.power-1)+1;
        c.hp -= strength;
    }
}
