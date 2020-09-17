package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome (int number) {
        int reversedNumber = 0;
        int palindrome = Math.abs(number);

        while (palindrome > 0) {
            int remainder = palindrome % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return Math.abs(number) == reversedNumber;

    }
}
