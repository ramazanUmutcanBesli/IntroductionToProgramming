package week03;

import java.util.Scanner;

public class GroceryListMainStatic {
// 1.make your varıables and reference varıables Global
// if we are going to use thıs varıables or references ınsıde maın method  , we need to make them static

    static GroceryList shoppingList;
    static Scanner input;

    public static void main(String[] args) {
         shoppingList=new GroceryList();
        printInstructions();
        boolean Continue=true;
        input= new Scanner(System.in);


        while(Continue){
            System.out.println("Enter your next ınstructors");
            int choice =input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println(shoppingList);
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyList();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    Continue=false;
                    System.err.println("See you again!!!");
                    break;
            }
        }
    }
    public static void printInstructions() {

        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item from the list.");
        System.out.println("\t 6 - To quit the application.");

    }
    // add remove modify...
    public static void addItem(){
        System.out.println("Enter your grocery Item: ");
        shoppingList.addGroceryList(input.nextLine());
    }
    public static void modifyList(){
        System.out.println("Enter item number: ");
        int itemNo =input.nextInt();
        input.nextLine();
        System.out.println("Enter a replacement item: ");
        String newItem= input.nextLine();
        shoppingList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item number that will be removed: ");
        int itemNoRemove= input.nextInt();
        input.nextLine();
        shoppingList.removeGroceryItem(itemNoRemove);
    }
    public static void findItem(){
        System.out.println("Put te item name that you are looking for: ");
        String searchItem= input.nextLine();
        System.out.println(shoppingList.findItem(searchItem));
    }
}
