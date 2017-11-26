package game;

public class Elf extends Character {
    static final int HP = 10;
    static final int POWER = 10;
    public Elf() {
        setHp(HP);
        setPower(POWER);
        setName("Elf");
    }

    @Override
    void kick(Character c) {
        if (c.power < this.power) {
            c.hp = 0;
        } else {
            c.hp -= 1;
        }
    }
}
