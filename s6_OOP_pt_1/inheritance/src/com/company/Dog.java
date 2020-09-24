package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // The super keyword calls the constructor of the extended class,
    // allowing you to initialise the variables inside the parent class.
    public Dog(String name,
            int size,
            int weight,
            int eyes,
            int legs,
            int tail,
            int teeth,
            String coat) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("chomp chomp chomp");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    // When invoking the super.method(), it will call the method by
    // that name inherited from the parent class. It will not look
    // at its own class for an overriding method.
    public void walk() {
        System.out.println("plod plod");
        super.move(5);
    }

    // When invoking a method by name only, it will look for an overloaded
    // method within its own class first before then invoking the super
    // method from the parent class should no method be found by that name
    // in its own class.
    public void run() {
        System.out.println("kaploomp kaploom");
        move(15);
    }

    private void moveLegs(int speed) {
        System.out.println("Legs moving");

    }

    // The override keyword is used to set a local method that
    // supersedes a method in its parent class of the same name.
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
