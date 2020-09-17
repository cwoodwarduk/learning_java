package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numbersRequired = 1;
        int sumOfNums = 0;

        Scanner scanner = new Scanner(System.in);

        while (numbersRequired <= 10){
            System.out.println("Enter number #" + numbersRequired + ": ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sumOfNums += scanner.nextInt();
                scanner.nextLine();
            } else {
                break;
            }

            numbersRequired++;
        }

        scanner.close();

        if (numbersRequired == 10){
            System.out.println(sumOfNums);
        } else {
            System.out.println("Invalid Number");
        }

    }
}
