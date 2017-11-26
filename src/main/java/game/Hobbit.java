package game;

public class Hobbit extends Character {
    static final int HP = 3;
    public Hobbit() {
        setHp(HP);
        setPower(0);
        setName("Hobbit");
    }

    private void toCry(){
    System.out.println("Crying");
    }

    @Override
    void kick(Character c) {
        toCry();
    }
}
