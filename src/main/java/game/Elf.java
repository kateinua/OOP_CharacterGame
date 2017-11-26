package game;

public class Elf extends Character {
    private static final int HP = 10;
    private static final int POWER = 10;
    public Elf() {
        setHp(HP);
        setPower(POWER);
        setName("Elf");
    }

    @Override
    void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        } else {
            c.setHp(c.getHp() - 1);
        }
    }
}
