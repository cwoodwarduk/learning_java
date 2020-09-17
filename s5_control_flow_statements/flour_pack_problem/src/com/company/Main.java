package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 6));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (bigCount > 0) {
            if (goal - 5 > 0){
                goal = goal - 5;
                bigCount--;
            } else if (goal - 5 == 0) {
                return true;
            } else {
                break;
            }
        }

        return goal - (smallCount) <= 0;

    }
}
