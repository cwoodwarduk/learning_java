package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myArray = {6, 34, 78, 12, 95};
        System.out.println(Arrays.toString(myArray));

        reverseArray(myArray);

        System.out.println(Arrays.toString(myArray));

        resizeArray(myArray, 8);
    }

    public static void reverseArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void resizeArray(int[] array, int size) {
        int[] original = array;

        array = new int[size];

        for(int i = 0; i < original.length; i++) {
            array[i] = original[i];
        }
    }
}
