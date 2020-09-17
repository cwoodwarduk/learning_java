package com.company;

public class Main {

    public static void main(String[] args) {

        // You can set the While break condition in the parentheses
	    int count = 0;

	    while (count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println(" ********* ");

	    // Or you can set While condition to true and
        // set a break condition inside the while loop itself.
	    int countTwo = 0;

	    while (true){
	        if (countTwo == 6){
	            break;
            }

            System.out.println("Count value is " + countTwo);
            countTwo++;
        }

        System.out.println(" ********* ");

	    // Do-While loop
        // These loops are guaranteed to run at least once
        // so can run in infinite loops if While condition
        // isn't met
        int countThree = 0;

        do {
            System.out.println("Count value is " + countThree);
            countThree++;
        } while (countThree != 6);

        System.out.println(" ********* ");

        // CHALLENGE
        int num = 1;
        int finishNum = 50;
        int evenNumsFound = 0;

        while (num <= finishNum){
            num++;
            if (!isEvenNumber(num)){
                continue;
            }

            evenNumsFound++;
            System.out.println("Even number: " + num);

            if (evenNumsFound == 5){
                break;
            }
        }
    }

    public static boolean isEvenNumber (int n) {
        return (n & 1) == 0;
    }
}
