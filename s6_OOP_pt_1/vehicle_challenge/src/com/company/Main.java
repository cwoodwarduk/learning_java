package com.company;

public class Main {

    public static void main(String[] args) {
	    Maserati a6g = new Maserati(4, 95, 5, "ahead", "Maserati", "A6G", 2, 1955);
	    a6g.changeDirection("left");
	    a6g.moving(50);
	    a6g.changeGear(4);
    }

    
}
