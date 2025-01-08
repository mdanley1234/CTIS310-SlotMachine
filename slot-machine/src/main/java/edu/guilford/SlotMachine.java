package edu.guilford;

import java.util.Random;

public class SlotMachine {

    private Random random = new Random();

    enum Fruit {
        SEVEN,
        CHERRY,
        ORANGE,
        LEMON,
        GRAPE
    }

    // Spinner method
    public Fruit spin() {
        int pick = random.nextInt(Fruit.values().length);
        return Fruit.values()[pick];
    }

    // Play method
    public void play() {
        Fruit slot1 = spin();
        Fruit slot2 = spin();
        Fruit slot3 = spin();

        System.out.println(slot1 + " " + slot2 + " " + slot3);

        if (slot1 == slot2 && slot2 == slot3) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

}
