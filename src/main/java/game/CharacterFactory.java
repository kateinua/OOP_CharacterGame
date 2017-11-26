package game;

import java.util.Random;

public class CharacterFactory {
    static final int NUM = 4;
    public CharacterFactory() {}
    static Character createCharacter() {
        int code = new Random().nextInt(NUM);
        Character ch;
        switch (code) {
            case 0:
                ch = new Hobbit();
                break;
            case 1:
                ch = new Elf();
                break;
            case 2:
                ch = new King();
                break;
            default:
                ch = new Knight();
                break;
        } return ch;
    }
}
