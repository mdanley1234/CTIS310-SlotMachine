package edu.guilford;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Call the analyzeMachines() method to analyze the slot machines
        analyzeMachines();
        System.out.println("\n\n\n");

        System.out.println("Let's gamble!");

        SlotMachine slotMachine = new SlotMachine();

        // When user hits the enter key, the program will run the slotMachine.play() method
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("You have " + slotMachine.getStart_amount() + " dollars");
            System.out.println("It costs " + slotMachine.getCost() + " dollars to play");
            System.out.println("You can win " + slotMachine.getWin() + " dollars");
            System.out.println("Press enter to play or type 'exit' to quit");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            slotMachine.play();
        }
    }

    public static void analyzeMachines() {
        // Instantiate one object with values for all attributes
        SlotMachine firstMachine = new SlotMachine(3, 3, 10, 50);

        // Create an ArrayList to store SlotMachine objects
        ArrayList<SlotMachine> slotMachines = new ArrayList<>();

        // Add the first object to the ArrayList
        slotMachines.add(firstMachine);

        // Loop to instantiate at least five objects and add them to the ArrayList
        for (int i = 0; i < 5; i++) {
            SlotMachine machine = new SlotMachine();
            slotMachines.add(machine);
        }

        // Loop to print out all elements of the ArrayList
        for (SlotMachine machine : slotMachines) {
            System.out.println(machine);
        }

        // Analysis of the objects
        int totalWinAmount = 0;
        for (SlotMachine machine : slotMachines) {
            totalWinAmount += machine.getWin();
        }
        double averageWinAmount = totalWinAmount / (double) slotMachines.size();
        System.out.println("Average win amount of all slot machines: " + averageWinAmount);
    }
}
