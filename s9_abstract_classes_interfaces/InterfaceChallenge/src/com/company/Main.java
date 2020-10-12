package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player calum = new Player("Calum", 100, 22);
        System.out.println(calum.toString());
        saveObject(calum);

        calum.setHitPoints(70);
        System.out.println(calum);
        calum.setWeapon("catapult");
        saveObject(calum);
//        loadObject(calum);
        System.out.println(calum);

        ISaveable werewolf = new Monster("werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static void saveObject(ISaveable objectToBeSaved) {
        for(int i = 0; i < objectToBeSaved.write().size(); i++) {
            System.out.println("Saving " + objectToBeSaved.write().get(i) + " to storage.");
        }
    }

    public static void loadObject(ISaveable objectToBeLoaded) {
        ArrayList<String> values = readValues();
        objectToBeLoaded.read(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
