package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd (int number) {
        if (number < 1) {
            return false;
        }

        return (number & 1) != 0;
    }

    public static int sumOdd (int start, int end) {
        if ((start < 1 || end < 1) || (start > end)) {
            return -1;
        }

        int sumOfOddNumbers = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sumOfOddNumbers += i;
            }
        }

        return sumOfOddNumbers;
    }

}
