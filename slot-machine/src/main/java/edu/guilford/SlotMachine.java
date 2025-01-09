package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

public class SlotMachine {

    private Random random = new Random();

    // Attributes
    private int wheels = 3; // Number of wheels
    private int symbols = 5; // Number of symbols
    private int start_amount = 100; // Starting amount of money
    private int cost = 10; // Bet cost
    private int win = 1000; // Win amount

    // Constructors
    public SlotMachine(int wheels, int symbols, int cost, int win) {
        this.wheels = wheels;
        this.symbols = symbols;
        this.cost = cost;
        this.win = win;
    }

    public SlotMachine() {
        this.wheels = random.nextInt(10) + 1;
        this.symbols = random.nextInt(10) + 1;
        this.cost = random.nextInt(46) + 5;
        this.win = random.nextInt(901) + 100;
    }

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

    @Override
    public String toString() {
        return "SlotMachine{" +
                "wheels=" + wheels +
                ", symbols=" + symbols +
                ", start_amount=" + start_amount +
                ", cost=" + cost +
                ", win=" + win +
                '}';
    }

    // Helper method | The play method invokes the spin method to account for each wheel
    // If the user wins the method adds money to the start_amount and if the user loses the method subtracts money from the start_amount
    public void play() {

        if (start_amount < cost) {
            System.out.println("You don't have enough money to play!");
            return;
        }

        ArrayList<Fruit> fruits = new ArrayList<Fruit>();

        System.out.println("---------------------------");

        for (int i = 0; i < wheels; i++) {
            Fruit fruit = spin();
            fruits.add(fruit);
            System.out.print(fruit + " ");
        }

        System.out.println("\n---------------------------");

        // Check if all fruits in the fruits array list are the same
        boolean allSame = true;
        for (Fruit fruit : fruits) {
            if (fruit != fruits.get(0)) {
            allSame = false;
            break;
            }
        }
        System.out.println();

        if (allSame) {
            System.out.println("YOU WIN!");
            start_amount += win;
        } else {
            System.out.println("YOU LOSE!");
            start_amount -= cost;
        }
        
    }


    // Getters and Setters
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSymbols() {
        return symbols;
    }

    public void setSymbols(int symbols) {
        this.symbols = symbols;
    }


    public int getStart_amount() {
        return start_amount;
    }

    public void setStart_amount(int start_amount) {
        this.start_amount = start_amount;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

}
