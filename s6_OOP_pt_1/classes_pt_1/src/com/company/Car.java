package com.company;

// ACCESS MODIFIERS
// Public = unrestricted access
// Private = no other class can access this class
// Protected = only accessible by other classes in this package
public class Car {

    // ENCAPSULATION
    // By using private access modifiers and the use of
    // getters and setters, can ensure that data passed to
    // a class is valid.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Setters allow for validation and sanitisation prior
    // to assignment of a value to a field.
    public void setModel (String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
