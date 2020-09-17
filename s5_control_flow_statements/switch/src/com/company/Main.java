package com.company;

public class Main {

    public static void main(String[] args) {

        // Major difference between if and switch statements is that
        // switch statements test on one variable, if statements work
        // on multiple variables.

        // Prior to JDK7 switch statements could only be used with
        // Byte, Short, Char and Int data types.

        // Since JDK7 switch statements can also be used with Strings.

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }


        // CHALLENGE

        char challengeValue = 'A';

        switch (challengeValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The character " + challengeValue + " was found.");
                break;
            default:
                System.out.println("Not found");
                break;
        }


        // SWITCH STATEMENTS WITH STRINGS

        // Rather than setting a case for every possible variation of
        // a string, just alter the variable using the toLowerCase()
        // function to equalise all strings for case type errors.


        int getDaysInMonth = getDaysInMonth(1, -2020);
        System.out.println("There's " + getDaysInMonth + " days in the month.");

    }

    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printNumberInWord (int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        int daysInMonth;

        if (!isLeapYear){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = 28;
                    break;
                default:
                    daysInMonth = -1;
                    break;
            }
        } else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = 29;
                    break;
                default:
                    daysInMonth = -1;
                    break;
            }
        }

        return daysInMonth;
    }
}
