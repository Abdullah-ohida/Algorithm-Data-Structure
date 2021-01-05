package com.part1.ArrayList.groceryList;

import java.util.Scanner;

public class MainGroceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> quit = true;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice option.");
        System.out.println("\t 1 - To print the list of the grocery items.");
        System.out.println("\t 2 - To add an item to the grocery list.");
        System.out.println("\t 3 - To modify an item in the grocery list.");
        System.out.println("\t 4 - To remove an item in the grocery list.");
        System.out.println("\t 5 - To search for item in the grocery list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String currentItem = scanner.nextLine();;

        System.out.print("new item name : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter remove item: ");;
        String remove = scanner.nextLine();;

        groceryList.removeGroceryItem(remove);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();

        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in or grocery list");
        }else{
            System.out.println(searchItem + " is not found in the shopping list");
        }
    }
}
