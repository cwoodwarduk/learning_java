package com.company;

public class Main {

    public static void main(String[] args) {

        //32 bits - has a "width" of 32
        int myValue = 10000;

        //int is a "primitive type", and Integer is a "Wrapper Class".
        //Wrapper classes give us ways to perform operations on primitive types.
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //Overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        //Underflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        //It's possible to write ints to be more readable with underscores
        //but this standard is rarely used
        int myMaxIntTest = 2_147_483_647;

        //Smaller datatypes have improved performance
        //Use for smaller numerical values where appropriate

        //8 bits - so has a "width" of 8.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        //16 bits - so has a "width" of 16.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        //For a numerical value larger than an int, use a long
        //When initialising a value for a long, end the value with a capital L
        
        //64 bits - a "width" of 64
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);


        //CASTING

        int myTotal = (myMinIntValue / 2);

        //Java will cast numerical values as an int by default.
        //So you need to typecast values that aren't to be ints.
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        //CHALLENGE

        byte challengeByte = 80;
        short challengeShort = 16575;
        int challengeInt = 1289571243;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);
        System.out.println("Challenge Value = " + challengeLong);
    }
}
