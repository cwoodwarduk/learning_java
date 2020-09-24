package com.company;

public class Main {

    public static void main(String[] args) {

        // POOR ENCAPSULATION

        // One problem with setting everything to public is that, without
        // constructors, getters or setters being required, any internal
        // change within a class, such as renaming a variable, breaks all
        // the code that references that changed variable or method.

        // Also, the total lack of a constructor can cause us to fail to
        // initialise variables within that class because we can't remember
        // every variable for every class!

        // Finally, because variables can be accessed directly, there is
        // no way to validate data.
        Player playerOne = new Player();
//        playerOne.name = "Calum";
        playerOne.health = 20;
        playerOne.weapon = "sword";

        int damage = 10;
        playerOne.loseHealth(damage);
        System.out.println("Remaining health = " + playerOne.healthRemaining() + ".");

        // Another problem with setting everything to public is that it can
        // be accessed at any time to create undesirable effects.
        damage = 11;
        playerOne.health = 200; // Cheating much?
        playerOne.loseHealth(damage);
        System.out.println("Remaining health = " + playerOne.healthRemaining() + ".");


        // BETTER ENCAPSULATION

        // We can now validate against incorrect data or shenanigans.
        EncapsulatedPlayer playerTwo = new EncapsulatedPlayer("Yeebee", 2000, "hammer");

        // And we can change the name of variables internally within a class
        // without any effect to classes that inherit it.
        System.out.println("Initial health is " + playerTwo.getHealth());


        // CHALLENGE - PRINTER
        Printer printer = new Printer(80, true);
        System.out.println("Initial page count = " + printer.getPagesRequired());
        printer.printPages(45);
    }
}
