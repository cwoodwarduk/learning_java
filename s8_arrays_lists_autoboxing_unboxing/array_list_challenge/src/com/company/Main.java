package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contact.");
        System.out.println("\t 2 - To add a person to your contacts.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove a contact from your phone.");
        System.out.println("\t 5 - To search for a contact on your phone.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addContact() {
        System.out.print("Please enter the new contact's name: ");
        String contactName = scanner.nextLine();
        System.out.print("Please enter the new contact's number: ");
        String contactNumber = scanner.nextLine();
//        Contact newContact = new Contact (contactName, contactNumber);
        myPhone.addContact(contactName, contactNumber);
    }

    private static void modifyContact() {
        System.out.print("Please enter contact's name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = myPhone.queryContact(contactName);

        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Please enter contact's new name: ");
        String contactNewName = scanner.nextLine();
        System.out.println("Please enter contact's new number");
        String contactNewNumber = scanner.nextLine();

        Contact updatedContact = new Contact(contactNewName, contactNewNumber);

        myPhone.updateContact(existingContact, updatedContact);
    }

    public static void removeContact() {
        System.out.print("Please enter contact's name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = myPhone.queryContact(contactName);

        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        myPhone.removeContact(existingContact);
    }

    public static void searchForContact() {
        System.out.print("Please enter contact's name to search for: ");
        String contactName = scanner.nextLine();
        Contact existingContact = myPhone.queryContact(contactName);

        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        myPhone.queryContact(existingContact);
    }
}
