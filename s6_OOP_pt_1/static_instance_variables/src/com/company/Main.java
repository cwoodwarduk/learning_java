package com.company;

public class Main {

    public static void main(String[] args) {

        // STATIC VARIABLES

	    // These are also known as "static member variables".
        // Every instance of that class shares the same static variable.
        // If changes are made to that variable, all other instances will
        // also change.

        // Static variables are not used often but are very useful.
        // For example when reading user input using Scanner we declare
        // scanner as a static variable. That way static methods can
        // access it directly.

        // In this example we have instantiated two instances of the Dog
        // object. But the method printName() will print "Fluffy" in both
        // cases as the private static name is shared amongst all instances
        // of the Dog object.

        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");
        rex.printName();
        fluffy.printName();


        // INSTANCE VARIABLES

        // Instance variables are also known as "fields" or "member
        // variables".
        // Instance variables belong to an instance of a class.

        // Every instance can has its own copy of an instance variable.
        // Every instance can have a different value (state).
        // Instance variables represent the state of an instance.

        // In the example above, if the variable name of the Dog class
        // was not static, then separate instantiations would be made
        // for the name variable for each instance of the Dog object.
        // In that way "Rex" and "Fluffy" would be printed as they are
        // no longer referencing the same name variable.


    }
}
