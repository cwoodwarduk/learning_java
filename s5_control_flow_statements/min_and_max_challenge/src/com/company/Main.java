package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int minNum = 0;
        int maxNum = 0;

        while (count > 0) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int num = scanner.nextInt();
                if (count == 1){
                    minNum = num;
                    maxNum = num;
                } else if (num < minNum){
                    minNum = num;
                } else if (num > maxNum){
                    maxNum = num;
                }
            } else {
                break;
            }

            count++;
        }

        System.out.println("The minimum number is " + minNum + " and the maximum number is " + maxNum + ".");
    }

}
