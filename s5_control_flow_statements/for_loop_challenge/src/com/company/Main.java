package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        System.out.println(" ********** ");

        for (int i = 0; i < 5; i++){
            System.out.println("Loop iteration: " + i);
        }

        System.out.println(" ********** ");

        // Printing various interest rates through for loop
        for (int i = 2; i < 9; i++){
            System.out.println("$10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println(" ********** ");

        // And in reverse...
        for (int i = 9; i > 1; i--){
            System.out.println("$10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println(" ********** ");

        // Prime numbers
        int primeNumbersFound = 0;
        for (int i = 2; i < 500; i++) {
            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
                primeNumbersFound++;
            }

            if (primeNumbersFound == 20){
                break;
            }
        }

        System.out.println(" ********** ");

        // Sum 3 and 5 challenge
        int numbersFound = 0;
        int sumOfNumbers = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is divisible by both 3 and 5.");
                numbersFound++;
                sumOfNumbers += i;
            }

            if (numbersFound == 5){
                System.out.println("Sum of found numbers = " + sumOfNumbers);
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1){
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


}
