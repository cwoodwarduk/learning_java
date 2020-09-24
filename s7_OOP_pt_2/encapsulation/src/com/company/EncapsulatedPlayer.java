package com.company;

public class EncapsulatedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100){
            this.health = health;
        }

        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out");
            this.health = 0;
        }
    }


}
