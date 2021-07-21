/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartmanager;


/*
 *
 * @author 4804717
 * Title: Shopping Cart (ArrayLists)
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 */

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    /**
     * This is the parameterized constructor, it accepts the itemName, description, price and quantity and assigns it to the object properties
     *
     * @param itemName        The name of the item
     * @param itemDescription Brief description of the item
     * @param itemPrice       { int } Price of the item
     * @param itemQuantity    Quantity of this product in the cart
     */
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    /**
     * This is the default constructor, it assigns default values to the object properties.
     */
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
        itemDescription = "none";
    }

    /**
     * @return itemName The name of the item
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName The name that will be given to the item
     */
    public void setName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return { int } The price of 1 quantity of the item
     */
    public int getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice The price that will be given to the item - price / quantity
     */
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return itemQuantity The amount of this specific item in the shopping cart
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    /**
     * @param itemQuantity The quantity that the user has of this product in their cart
     */
    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /**
     * @return itemDescription A brief description of the item
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription The brief description that will be given to the item
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * Outputs the item name followed by the quantity, price, and subtotal (quantity x price)
     * Used by the shopping cart printTotal method
     */
    public void printItemCost() {
        int cost = getItemPrice() * getItemQuantity();
        System.out.println(getItemName() + " " + getItemQuantity() + " @ $" + getItemPrice() + " = $" + cost);
    }

    /**
     * Outputs the item name and description
     * Used by the shopping cart printDescriptions method
     */
    public void printItemDescription() {
        System.out.println(getItemName() + ": " + getItemDescription());
    }
}
