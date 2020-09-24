package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getInts(10);
        printArray(myArray);

        int[] reverseArray = sortIntegersNative(myArray);
        printArray(reverseArray);

        int[] reverseArrayTwo = sortIntegersCustom(myArray);
        printArray(reverseArrayTwo);
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Value at element " + i + " is " + array[i] + ".");
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

    public static int[] sortIntegersNative(int[] array) {
        return IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    }

    public static int[] sortIntegersCustom(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean isSorted = true;
        int temp;

        while(isSorted) {
            isSorted = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    isSorted = true;
                }
            }
        }

        return sortedArray;

    }
}
