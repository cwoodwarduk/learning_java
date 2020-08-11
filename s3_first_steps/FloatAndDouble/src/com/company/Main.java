package com.company;

public class Main {

    public static void main(String[] args) {

	    //Float is 'single precision'.
        //32 bits (width 32).
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);
        

        //Double is 'double precision'.
        //64 bits (width 64).
        //double is the default type for decimals, much like int is for integers
        //Doubles are actually faster than floats,
        //mostly due to the fact they don't require converting as floats do (to doubles)
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myIntValue = 5;

        //Floats can be cast either by declaring value type in parentheses
        //Or by following the value with 'f' e.g. 5.25f - this is more common
        //Floats are not recommended for use these days. Doubles preferred.
        float myFloatValue = (float) 5.25;

        double myDoubleValue = 5.25d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


        //DIVISION

        //Dividing using an int discards remainder
        int myDivIntValue = 5 / 3;

        //Floats can be cast either by declaring value type in parentheses
        //Or by following the value with 'f' e.g. 5.25f - this is more common
        //Floats are not recommended for use these days. Doubles preferred.
        float myDivFloatValue = 5f / 3f;

        double myDivDoubleValue = 5d / 3d;

        System.out.println("myDivIntValue = " + myDivIntValue);
        System.out.println("myDivFloatValue = " + myDivFloatValue);
        System.out.println("myDivDoubleValue = " + myDivDoubleValue);


        //CHALLENGE
        double pounds = 12d;
        double poundsToKilos = pounds * 0.45359237d;
        System.out.println("lb to kg conversion = " + poundsToKilos);


    }
}
