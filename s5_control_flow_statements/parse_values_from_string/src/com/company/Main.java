package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2020.125";
        System.out.println("numberAsString = " + numberAsString);

        // When parsing strings to other data types, make sure
        // to use the class wrapper name before invoking the
        // relevant parsing method.
        // e.g. Integer.parseInt()
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);
    }


}
