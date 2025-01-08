package edu.guilford;

import java.util.Random;

public class SlotMachine {

    private Random random = new Random();

    // Attributes
    private int wheels = 3; // Number of wheels
    private int symbols = 5; // Number of symbols

    enum Fruit {
        SEVEN,
        CHERRY,
        ORANGE,
        LEMON,
        GRAPE,
        BANANA,
        APPLE,
        PEAR,
        STRAWBERRY,
        WATERMELON,
        PINEAPPLE,
        PEACH,
        PLUM,
        COCONUT,
        MANGO,
        PAPAYA,
        GUAVA,
        POMEGRANATE,
        LYCHEE,
        KIWI,
        PASSIONFRUIT,
        DRAGONFRUIT,
        STARFRUIT,
        JACKFRUIT,
        RAMBUTAN,
        DURIAN,
        MANGOSTEEN,
        LONGAN,
        SALAK,
        CUSTARDAPPLE,
        SUGARCANE
    }

    // Spinner method
    public Fruit spin() {
        int pick = random.nextInt(symbols);
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
