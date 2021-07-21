/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartmanager;

import java.util.Scanner;

/*
 *
 * @author 4804717
 * Title: Shopping Cart (ArrayLists)
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program's Functionality:
 *      This program demonstrates the use of arraylists and OOP
 *      It outputs a menu where a user can add, remove and edit items to a basket. The user can also display the basket information such as total price and a list of product descriptions.
 */

public class ShoppingCartManager {
    /**
     * This is the main method that was already created, it asks the user for all personal input to create the shopping cart and handles the main menu outer loop.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I only changed prices types from int to double since the UML diagram  asked for the price to be double even though it just ask for ints everywhere else.
        Scanner scnr = new Scanner(System.in);
        String customerName;
        String todaysDate;
        char menuChoice = ' ';

        System.out.println("Enter Customer's Name:");
        customerName = scnr.nextLine();

        System.out.println("Enter Today's Date:");
        todaysDate = scnr.nextLine();

        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Today's Date: " + todaysDate);
        System.out.println();

        ShoppingCart myCart = new ShoppingCart(customerName, todaysDate);

        printMenu();

        while (menuChoice != 'q') {
            System.out.println("Choose an option:");
            menuChoice = scnr.next().charAt(0);
            executeMenu(menuChoice, myCart, scnr);
            printMenu();
        }
        System.out.println("Thanks for shopping with us.  Please come again.");
    }

    /**
     * This is the printmenu method and it just prints the different options the user has. This method is called in main();
     */
    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println();
    }

    /**
     * This is the executeMenu method that takes the user input and request further information depending on the choice. It's also the one in charge of invoking ShoppingCart methods.
     *
     * @param option  the user input
     * @param theCart the cart object created at the beginning of the program
     * @param scnr    scanner class for console output
     */
    public static void executeMenu(char option, ShoppingCart theCart, Scanner scnr) {
        String productName;
        String productDescription;
        int productPrice = 0;
        int productQuantity = 0;

        switch (option) {
            case 'a':
                scnr.nextLine();
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                productName = scnr.nextLine();

                System.out.println("Enter the item description:");
                productDescription = scnr.nextLine();

                System.out.println("Enter the item price:");
                productPrice = scnr.nextInt();

                System.out.println("Enter the item quantity:");
                productQuantity = scnr.nextInt();

                ItemToPurchase newItem = new ItemToPurchase(productName, productDescription, productPrice, productQuantity);
                theCart.addItem(newItem);

                System.out.println();
                break;

            case 'd':
                scnr.nextLine();

                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                productName = scnr.nextLine();

                theCart.removeItem(productName);
                System.out.println();
                break;

            case 'c':
                scnr.nextLine();

                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                productName = scnr.nextLine();

                System.out.println("Enter the new quantity:");
                productQuantity = scnr.nextInt();

                ItemToPurchase modItem = new ItemToPurchase();
                modItem.setName(productName);
                modItem.setQuantity(productQuantity);

                theCart.modifyItem(modItem);
                System.out.println();
                break;

            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                theCart.printDescriptions();
                System.out.println();
                break;

            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                theCart.printTotal();
                System.out.println();
                break;
        }

    }


}