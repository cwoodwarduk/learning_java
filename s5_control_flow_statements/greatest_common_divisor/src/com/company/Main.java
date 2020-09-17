package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10){
            return -1;
        }

        while(first!=0 && second!=0) {
            int c = second;
            second = first % second;
            first = c;
        }

        return first + second;
    }
}
