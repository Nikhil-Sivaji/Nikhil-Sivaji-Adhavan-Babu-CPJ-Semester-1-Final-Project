package MegaMart;
import java.util.*;

/**
 * @summary "Shopping Cart" represents the virtual cart which stores the items bought or desired by the users.
 */
public class ShoppingCart
{

    private ArrayList<Item> cartItems = new ArrayList<Item>();// since it is a resizable array so I can push more products into the cart
    private Item empty = new Item("Empty", "No Description", 0.0); // Created this to allow getTotal to work
    private double totalPrice;

    /** Constructor for a MegaMart.Shopping. Has no parameters because it's always empty when first used
     *
     */
    public ShoppingCart()
    {

        for(int i = 0; i < cartItems.size(); i++) // "cartItems.size() - 1"
        {

            cartItems.set(0,empty);

        }
        totalPrice = 0;

    }
    //Mutator Methods

    /** Replaces or adds an Item to the shop
     * @param index the index we want to change
     * @param item the item we want to choose
     */
    public void setItem(int index, Item item)
    {

            cartItems.set(index,item);

    }

    /** Adds an Item to the cart
     * @param item the item we want to append to the "cartItems" Array List
     */
    public void addItemToCart(Item item)
    {

       cartItems.add(item);
       totalPrice += item.getItemPrice();

    }
    //Accessor Methods

    /** Returns the total price of everything in the cart
     * @return the total cart price
     */
    public double getTotalPrice()
    {

        return totalPrice;

    }

    /** gets a specific item found within the cart
     * @param index the index of the Item in the array list
     * @return the item in the cart
     */
    public String getCartItem(int index)
    {

        return cartItems.get(index).toString();

    }

    /** Formats and returns all the tiems in the shopping cart, total price
     * @return  returns attributes for the item's in the shopping cart as a formatted list
     */
    public String toString()
    {

        String s  = "-------------------------- \n";
        s += "MegaMart.Shopping Cart:\n";

        for(int i = 0; i < cartItems.size(); i++)
        {
            s += " " + cartItems.get(i).getItemName() + ": $" + cartItems.get(i).getItemPrice() + "\n" ;

        }
        s += "Total Price: $" + this.getTotalPrice() + "\n";

        s += "-------------------------- \n";
        return s;

    }

    /** Sends ending/checkout message
     * Runs when the customer has completed his purchase
     */
    public void checkout()
    {
        System.out.println(this.toString());
        System.out.println("Thanks for shopping with us. Have a great day!");

    }

}
