package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Seoul");
        addInOrder(placesToVisit, "Wonju");
        addInOrder(placesToVisit, "Busan");
        addInOrder(placesToVisit, "Tongyeong");
        addInOrder(placesToVisit, "Uljin");
        addInOrder(placesToVisit, "Suwon");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Jirisan");
        addInOrder(placesToVisit, "Uljin");

        printList(placesToVisit);

        // One of the issues with linked list iterators that
        // regularly arises is the fact that it will not point
        // to a specific node but the *connection* between two
        // nodes, starting at the position *before* the first node.

        // This means that if we remove a node from the list without
        // setting a new connection to the next available node, we
        // would end up in an infinite loop when using a list iterator,
        // as the linked list would simply point back to where it was
        // accessed to begin with in its confusion between list length
        // and lack of a connection to a new node at the point where a
        // new connection was failed to be created.

        // NB: look up "tortoise and hare" algorithm.
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next() + ".");
        }

        System.out.println(" *********** ");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){
                System.out.println(newCity + " is already included.");
                return false;
            } else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){

            }

        }

        stringListIterator.add(newCity);
        return true;
    }

    // In order to circumvent the linked list problem, we can set
    // a check to ensure nodes connections are available before
    // moving either forward or backwards in a list, and setting
    // the available direction of movement forward or backward for
    // the beginning or end of a linked list, respectively.

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No destinations listed in itinerary.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit.\n" +
                "1 - go to next city.\n" +
                "2 - go to previous city.\n" +
                "3 - print menu options.");
    }


}
