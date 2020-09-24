package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220b", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27ftz", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BD-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, monitor, motherboard);

        // You can call variables and methods up the inheritance chain
        // by using dot notation and getters, as long as these are public.

//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        // If the getters and setters of an inherited class are private
        // then you can create further public methods that access the
        // state of that class internally before handing them down the
        // inheritance chain.

        thePC.powerUp();

        // CHALLENGE - BUILD A ROOM
        Duvet duvet = new Duvet(4, "king size", "white");
        Pillow pillow = new Pillow(false, "white");
        Bed bed = new Bed(new Dimensions(140, 40, 200), duvet, pillow, "Ikea");
        roomWindow window = new roomWindow(new Dimensions(200, 140, 0), false);
        Desk desk = new Desk(new Dimensions(100, 70, 40), "wood");
        Chair chair = new Chair(new Dimensions(40, 100, 40), "leather", true);
        Bedroom bedroom = new Bedroom(new Dimensions(400, 200, 250), bed, window, desk, chair);

        bedroom.cleanRoom();
    }
}
