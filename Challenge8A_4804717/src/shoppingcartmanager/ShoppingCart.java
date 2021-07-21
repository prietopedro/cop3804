/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartmanager;

import java.util.ArrayList;

/*
 *
 * @author 4804717
 * Title: Shopping Cart (ArrayLists)
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 */
public class ShoppingCart {
    private final String customerName;
    private final String currentDate;
    private final ArrayList<ItemToPurchase> cartItems;

    /**
     * This is the parameterized constructor, it accepts the customerName and date as params and assign it to the object properties. It creates an empty arrayList of ItemsToPurchase
     *
     * @param customerName The name of the user
     * @param currentDate  The date the shopping cart was created // Or today's date but there is no logic to change that if the user abandons the cart and comes back at a later date
     */
    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        this.cartItems = new ArrayList<>();
    }

    /**
     * This is the default constructor, it assigns default values to the object properties. Creates a new arrayList of type ItemsToPurchase for cartItems
     */
    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2022";
        cartItems = new ArrayList<>();
    }

    /**
     * @return customerName The name of the cart's customer
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return currentDate The date the shopping cart was created // Or today's date but there is no logic to change that if the user abandons the cart and comes back at a later date
     */
    public String getDate() {
        return currentDate;
    }

    /**
     * @param item ItemToPurchase object to be added to the shopping list
     *             Will perform an update and combine quantities if there is already another object with the same name
     */
    public void addItem(ItemToPurchase item) {
        // Instruccions did not ask for this but I'm adding up quantities and editing price and description if the product is found, otherwise we would have 2 entries with the same name and it could lead to bugs when trying to edit or delete.
        for (int i = 0; i < cartItems.size(); i++) {
            ItemToPurchase curr = cartItems.get(i);
            if (curr.getItemName().equalsIgnoreCase(item.getItemName())) {
                curr.setQuantity(curr.getItemQuantity() + item.getItemQuantity());
                curr.setItemPrice(item.getItemPrice());
                curr.setItemDescription(item.getItemDescription());
                return;
            }
        }
        cartItems.add(item);
    }

    /**
     * @param item Name of the item that needs to be removed
     *             If not found will display console feedback
     */
    public void removeItem(String item) {
        for (int i = 0; i < cartItems.size(); i++) {
            ItemToPurchase curr = cartItems.get(i);
            if (curr.getItemName().equalsIgnoreCase(item)) {
                cartItems.remove(curr);
                return;
            }
        }
        System.out.println("Item not found in cart. Nothing removed.");
    }

    /**
     * @param item ItemToPurchase that need to be edited. (If it has default values it will not modify the item)
     *             If not found will display console feedback
     */
    public void modifyItem(ItemToPurchase item) {
        for (int i = 0; i < cartItems.size(); i++) {
            ItemToPurchase curr = cartItems.get(i);
            if (curr.getItemName().equalsIgnoreCase(item.getItemName())) {
                if (!item.getItemDescription().equalsIgnoreCase("none"))
                    curr.setItemDescription(item.getItemDescription());
                if (item.getItemQuantity() != 0) curr.setQuantity(item.getItemQuantity());
                if (item.getItemPrice() != 0) curr.setItemPrice(item.getItemPrice());
                return;
            }
        }
        System.out.println("Item not found in cart. Nothing modified.");
    }

    /**
     * @return totalQuantity the total number of items in the cart - Takes quantity into consideration
     */
    public int getNumItemsInCart() {
        int totalQuantity = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            totalQuantity += cartItems.get(i).getItemQuantity();
        }
        return totalQuantity;
    }

    /**
     * @return totalCost the total cost of all items in the cart - Takes quantity into consideration
     */
    public int getCostCart() {
        int totalCost = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            ItemToPurchase curr = cartItems.get(i);
            totalCost += curr.getItemPrice() * curr.getItemQuantity();
        }
        return totalCost;
    }

    /**
     * Prints the name of the shopping cart, the date it was created, the total items in the cart, and all the objects in cart.
     * If cart is empty, outputs the message: SHOPPING CART IS EMPTY
     */
    public void printTotal() {
        if (cartItems.size() == 0) {
            System.out.println("Shopping cart is empty");
            return;
        }
        System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate() + "\nNumber of Items: " + getNumItemsInCart() + "\n");
        for (int i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemCost();
        }
        System.out.println("\nTotal: $" + getCostCart());
    }

    /**
     * Prints the name of the shopping cart, the date it was created, the literal “Item Descriptions”, and the name and description of each object in cart.
     * If cart is empty, outputs the message: SHOPPING CART IS EMPTY
     */
    public void printDescriptions() {
        if (cartItems.size() == 0) {
            System.out.println("Shopping cart is empty");
            return;
        }
        System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate() + "\n\nItem Descriptions:");

        for (int i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemDescription();
        }
    }
}
