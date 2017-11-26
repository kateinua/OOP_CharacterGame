package game;

public class GameManager {
    Character c1 = CharacterFactory.createCharacter();
    Character c2 = CharacterFactory.createCharacter();
    public static int fight(Character c1, Character c2) {
        if (c1.getName().equals(c2.getName())) {
            if (c1.getName().equals("Hobbit") && c2.getName().equals("Hobbit")) {
                System.out.println("Hobbits can't fight each other");
                return 1;
            }
            c1.setName("Hobbit_one");
            c2.setName("Hobbit_two");
        }
        System.out.println("First fighter: " + c1.getName());
        System.out.println("First fighter: " + c2.getName());
        while (c1.isAlive() && c2.isAlive()) {
            System.out.format("%s power and hp: %d, %d %n", c1.getName(), c1.getPower(), c1.getHp());
            System.out.format("%s power and hp: %d, %d %n", c2.getName(), c2.getPower(), c2.getHp());

            c1.kick(c2);
            System.out.format("%s power and hp: %d, %d %n", c2.getName(), c2.getPower(), c2.getHp());
            if (!c2.isAlive()) {
                System.out.format("%s is dead %n", c2.getName());
            }
            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.format("%s power and hp: %d, %d %n", c1.getName(), c1.getPower(), c1.getHp());
                if (!c1.isAlive()) {
                    System.out.format("%s is dead %n", c1.getName());
                }
            }
        }
        if (c1.isAlive()) {
            System.out.format("%s won", c1.getName());
        } else {
            System.out.format("%s won", c2.getName());
        } return 1;
    }
}
