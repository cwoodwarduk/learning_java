package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // Java allocates 4 bytes of memory to each integer.
        // This is the amount of memory Java requires to store
        // the highest-value integer.

        // So Java uses this to create a memory address to
        // access each index in an array, linked list or any
        // primitive type.

        // For arrays and linked lists the formula is starting
        // at 100 for index 0, then adding 4x the index number
        // to that value. So i = 2 has an address of 108 etc.

        // Strings have a 'string address' of four digits. This
        // is used to reference a string in memory.

        // You can see this internal memory address allocation
        // in action when you create multiple references to the
        // same object in memory or reassign a reference to a
        // different object.

        Customer customer = new Customer("Calum", 487.75);
        Customer customerTwo;
        customerTwo = customer;
        customerTwo.setBalance(23.75);
        System.out.println("Balance for customer " + customer.getName() + " has " + customer.getBalance());


        // Array lists, when manipulated, take up far more memory
        // as they require re-indexing of the entire array list to
        // alter.
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        // Linked lists on the other hand, store the memory address
        // to the next item in the list. So to manipulate the list
        // all an algorithm has to do is insert/delete/repoint one
        // "node".
    }
}
