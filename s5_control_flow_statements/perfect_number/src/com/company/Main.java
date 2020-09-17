package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }

        int count = 1;
        int perfect = 0;

        while (count <= number) {

            if (number % count == 0){
                perfect += count;
            }

            if (perfect == number){
                return true;
            } else if (perfect > number) {
                return false;
            } else {
                count ++;
            }
        }

        return false;
    }
}
