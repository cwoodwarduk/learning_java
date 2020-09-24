package com.company;

public class Player {

    // Changing a variable or method name internally within a class.

//    public String name;
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out");
            this.health = 0;
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
