package com.company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //STRINGS

        //Not a primitive datatype. Actually a class.
        //Technically limited by the memory value of an Int.
        //Strings are immutable - they cannot be changed after created.
        //Functions that change a String actually create a new, altered String variable.
        //The previous iteration of the String variable is deleted by Java.

        String myString = "This is a string";
        System.out.println("myString is equal to = " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to = " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to = " + myString);

        //Returns "250.5549.95"
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        //Returns "1050"
        //Java casts Ints concatenated to a String as Strings
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to = " + lastString);

        //Returns "1050120.47"
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to = " + lastString);
    }
}
