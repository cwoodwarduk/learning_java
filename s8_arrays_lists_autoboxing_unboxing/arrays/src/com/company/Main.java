package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaring and initialising an array.
        // You must initialise the array with a specific length.
        int[] myIntArray = new int[10];

        // Adding elements to an array.
        // All elements should be of the same type as the array.
        myIntArray[5] = 50;

        // Another way to initialise an array with elements in
        // one go.
        // The defined length of the array is calculated from the
        // number of elements added on initialisation.
        int[] myIntArrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Accessing elements in an array.
        System.out.println(myIntArrayTwo[5]);

        // A third way to initialise an array, with a for loop.
        int[] myIntArrayThree = new int[10];

        for(int i = 0; i < myIntArrayThree.length; i++){
            myIntArrayThree[i] = i * 10;
        }

        printArray(myIntArrayThree);


        // EXAMPLE
        int[] myInts = getInts(5);

        printArray(myInts);

        System.out.println("The average value of the array is " + getAverage(myInts) + ".");
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " of array is " + array[i] + ".");
        }
    }

    public static int[] getInts(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

}