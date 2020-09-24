package com.company;

public class Main {

    public static void main(String[] args) {
	    // A CLASS is a blueprint for an object e.g. a house.

        // Each house you build is an INSTANCE of that object.

        // Each house you build has an address (a physical location).
        // This is the object's REFERENCE.
        // You can copy that reference as many times as you like,
        // but there's still only one house you're referring to.
        // So you're referring to the object's location, not the
        // object itself.
        // References can be passed as parameters to constructors
        // and methods.


        // EXAMPLE

        // We instantiate an instance of house under the variable name
        // "blueHouse". This is a reference to the new instance of the
        // house object.
        // We then have "anotherHouse", which is a second REFERENCE to
        // the blueHouse.
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        // Here when we set the colour of anotherHouse, we actually also
        // set the colour of blueHouse as well, because they're both
        // REFERENCES to the same object in memory.
        anotherHouse.setColour("yellow");

        // Here we create a new instance of the House object, greenHouse.
        // We then de-reference anotherHouse from blueHouse, and then
        // couple it to greenHouse to make it a second reference of the
        // greenHouse.
        House greenHouse = new House("green");
        anotherHouse = greenHouse;


    }
}
