package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage (){
        int sum = 0;
        int numsEntered = 0;

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            sum += scanner.nextInt();
            numsEntered++;
        }

        scanner.close();

        long average = Math.round((double)sum / (double)numsEntered);

        System.out.println("SUM = " + sum + " AVG = " + average);

    }
}
