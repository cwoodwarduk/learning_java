package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit (int numOne, int numTwo) {
        if ((numOne < 10 || numOne > 99) || (numTwo < 10 || numTwo > 99)){
            return false;
        }

        return (numOne / 10) == (numTwo / 10) || (numOne / 10) == (numTwo % 10) || (numOne % 10) == (numTwo / 10) || (numOne % 10) == (numTwo % 10);
    }
}
