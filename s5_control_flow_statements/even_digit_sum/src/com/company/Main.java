package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if ((lastDigit & 1) == 0){
                sumOfEvenDigits += lastDigit;
            }

            number = number/10;
        }

        return sumOfEvenDigits;
    }
}
