package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> phoneContactsList;

    public MobilePhone() {
        this.phoneContactsList = new ArrayList<Contact>();
    }

    public void addContact(String contactName, String contactNumber) {
        Contact newContact = new Contact(contactName, contactNumber);
        phoneContactsList.add(newContact);
        System.out.println("New contact successfully created.");
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }

        phoneContactsList.add(contact);
        return true;
    }

    public boolean updateContact(Contact currentContact, Contact newContact) {
        int currentContactPosition = findContact(currentContact);
        if(currentContactPosition < 0) {
            System.out.println(currentContact.getName() + " was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with that name already exists.");
            return false;
        }

        this.phoneContactsList.set(currentContactPosition, newContact);
        System.out.println("Details successfully updated.");

        return true;
    }

    public boolean removeContact(Contact contact) {
        int contactPosition = findContact(contact);
        if(contactPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }

        this.phoneContactsList.remove(contactPosition);
        System.out.println("Contact successfully deleted.");

        return true;
    }

    private int findContact(Contact contact) {
        return this.phoneContactsList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.phoneContactsList.size(); i++) {
            Contact contact = this.phoneContactsList.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }

        return -1;
    }

    public void queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            System.out.println("Contact found. " + contact.getName() + "'s number is " + contact.getPhoneNumber() + ".");
        } else {
            System.out.println("Contact not found.");
        }

    }

    public Contact queryContact(String name) {
        int position = findContact(name);

        if(position >= 0) {
            return this.phoneContactsList.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Your contacts list:");
        for(int i = 0; i < phoneContactsList.size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                    this.phoneContactsList.get(i).getName() + " -> " +
                    this.phoneContactsList.get(i).getPhoneNumber()
            );
        }
    }


}
