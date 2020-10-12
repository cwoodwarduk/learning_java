package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] stringArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Calum");

        // Array lists are objects that need to be made up of objects,
        // not primitive types. Therefore the following isn't a thing.
//        ArrayList<int> intArrayList = new ArrayList<int>();

        // A messy way around this would be to create a custom int class
        // that you can instantiate int objects from and pass to an array
        // list.
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // For all the primitive types there are object wrappers similar
        // to above.
        // In earlier versions of Java this would have looked more like:
        // Integer integerValue = new Integer(23);
        Integer integerValue = 23;
        Double doubleValue = 45.7;
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            integerArrayList.add(i);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i));
        }

    }

}

class IntClass {
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
