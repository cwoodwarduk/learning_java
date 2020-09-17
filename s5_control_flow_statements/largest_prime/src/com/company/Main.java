package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime (int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 0;

        while (number % 2 == 0) {
            largestPrime = 2;
            number >>= 1;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2){
            while (number % i == 0){
                largestPrime = i;
                number = number / i;
            }
        }
        if (number > 2)
            largestPrime = number;

        return largestPrime;
    }
}
