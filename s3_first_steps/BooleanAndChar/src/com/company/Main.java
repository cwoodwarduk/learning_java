package com.company;

public class Main {

    public static void main(String[] args) {

        //CHARS

        //Chars and Strings are different.
        //Chars can only store a single character.
        //Were used more in the past
        //- mostly as a way to store data in arrays using minimal memory.
        //Nowadays a use case would be to store the last key-press by a user.
        //16 bits (width of 16)
        //The reason it isn't 8 bits is because a Char allows you to store unicode characters.
        char myChar = 'D';

        //To assign a unicode value to a Char:
        char myUnicode = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicode);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);


        //BOOLS

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //A common standard is to name boolean variables starting with 'is'
        //Basically in the format of a truthy question
        boolean isCustomerOverTwentyOne = true;
    }
}
