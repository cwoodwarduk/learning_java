package com.company;

public class Main {

    public static void main(String[] args) {

        //OPERATORS

	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 x 10 = 20
        System.out.println("2 x 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);


        //ABBREVIATED OPERATORS

        // result = result + 1;
        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);


        //CONDITIONALS

        boolean isAlien = false;

        //If statements can be executed without code block syntax
        //But in that case can only execute one line after the conditional
        //Standard practice is to use code blocks at all times for readability
        if (isAlien == false) {
            System.out.println("It's not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore > 100) {
            System.out.println("You got the highest possible score!");
        }

        //As a standard, if there are multiple conditions
        //each condition is wrapped in parentheses for readability
        //and to better guard against errors of operator precedence.
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        //Java allows assignment of a new value to a
        //variable within an If statement.
        //Hence the block within runs.
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen.");
        }

        //TERNARY OPERATORS IN JAVA

        boolean isACar = true;
        boolean wasCar = isACar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //Alternative syntax for ternary operators.
        //Better for readability, and operator precedence issues.
        int ageOfClient = 20;
        boolean isOverEighteen = (ageOfClient >= 18) ? true : false;


        //OPERATOR CHALLENGE

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        //myDoubleSum would = 8020.0 without parentheses due to operator precedence.
        //The * operator has higher precedence than +.
        double myDoubleSum = (myFirstDouble + mySecondDouble) * 100.00d;
        double mySumRemainder = myDoubleSum % 40.00d;
        boolean isThereNoRemainder = (mySumRemainder == 0) ? true : false;
        System.out.println("Is there no remainder? " + isThereNoRemainder);
        if (!isThereNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
