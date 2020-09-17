package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
        System.out.println(reverse(-234));
        System.out.println(getDigitCount(0));
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        int reversedNum = reverse(number);
        int leadingZeroes = 0;

        if (getDigitCount(reversedNum) < getDigitCount(number)){
            leadingZeroes = getDigitCount(number) - getDigitCount(reversedNum);
        }

        while (reversedNum > 0) {
            int lastDigit = reversedNum % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reversedNum = reversedNum / 10;
        }

        while (leadingZeroes > 0) {
            System.out.println("Zero");
            leadingZeroes--;
        }
    }

    public static int reverse (int number) {
        int reversedNum = 0;

        while(number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }

        return reversedNum;
    }

    public static int getDigitCount (int number) {
        if (number < 0){
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int digitCount = 0;

        while (number > 0){
            number = number / 10;
            digitCount ++;
        }

        return digitCount;
    }
}
