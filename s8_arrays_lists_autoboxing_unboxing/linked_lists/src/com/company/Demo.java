package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Seoul");
        placesToVisit.add("Wonju");
        placesToVisit.add("Busan");
        placesToVisit.add("Jeju");
        placesToVisit.add("Tongyeong");
        placesToVisit.add("Uljin");
        placesToVisit.add("Suwon");

        printList(placesToVisit);

        placesToVisit.add(1, "Jirisan");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next() + ".");
        }

        System.out.println(" *********** ");

    }
}
