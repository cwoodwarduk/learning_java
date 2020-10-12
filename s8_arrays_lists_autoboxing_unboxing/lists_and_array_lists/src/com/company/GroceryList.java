package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItemPosition(currentItem);
        if(position > 0){
            modifyGroceryItem(position, newItem);
        } else {
            System.out.println("Item not found.");
        }
    }

    private void removeGroceryItem(int position) {
        String itemToBeDeleted = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(itemToBeDeleted + " has been deleted.");
    }

    public void removeGroceryItem(String item) {
        int position = findItemPosition(item);
        if(position > 0){
            removeGroceryItem(position);
        } else {
            System.out.println("Item not found.");
        }
    }

    public String findItem(String searchItem) {
        boolean itemExists = groceryList.contains(searchItem);

        return itemExists ? searchItem + " is on the grocery list." : searchItem + " isn't on the grocery list.";
    }

    private int findItemPosition(String searchItem) {
        return groceryList.indexOf(searchItem);
    }



}
