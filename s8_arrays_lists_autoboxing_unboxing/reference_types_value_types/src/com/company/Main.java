package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // All primitive types are "value types" - they refer to single,
        // specific values.
        // Complex types are "reference types" - they refer to collections
        // of value types.
        // Strings are reference types as they are made up of chars.


        // When we copy the value of one variable to another variable
        // we create a new "container" in memory and from that point
        // onwards the two variables are entire serparate.
        int intOne = 10;
        int intTwo = intOne;

        intTwo++;

        System.out.println("intOne = " + intOne);
        System.out.println("intTwo = " + intTwo);

        // Reference types hold a reference to an object in memory.
        // So the second line does not create a new array but instead
        // constitutes a second reference to the same array object in
        // memory.
        int[] intArray = new int[5];
        int[] intArrayTwo = intArray;

        System.out.println(Arrays.toString(intArray));
        System.out.println("*********");
        System.out.println(Arrays.toString(intArrayTwo));

        intArrayTwo[0] = 1;
        System.out.println("*********");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*********");
        System.out.println(Arrays.toString(intArrayTwo));

        // The same behaviour happens when we pass an array to a method
        // that modifies the array passed to it regardless of reference.
        modifyArray(intArray);
        System.out.println("*********");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*********");
        System.out.println(Arrays.toString(intArrayTwo));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
    }
    private static void modifyArrayTwo(int[] array) {
        array[0] = 2;

        // Given the fact that we're assigning a new array to the
        // array reference passed to the method, we're now de-referencing
        // the array parameter from the array passed to the method and
        // instead changing the reference to the new array object we're
        // assigning to that reference. So the array passed to the method
        // is unaffected.
        array = new int[] {1, 2, 3, 4, 5};
    }
}
