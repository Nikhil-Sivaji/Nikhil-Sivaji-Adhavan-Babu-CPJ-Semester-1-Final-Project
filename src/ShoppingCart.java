import java.sql.Array;
import java.util.*;

public class ShoppingCart
{

    //private Item[] cartItems = new Item[15]; //Note: Figure out  how to add more items
    private ArrayList<Item> cartItems = new ArrayList<Item>();// since it is a resizable array so I can push more products into the cart
    private Item empty = new Item("Empty", "No Description", 0.0); // Created this to allow getTotal to work
    private double totalPrice;

    //Items, total price, toString
    //Note: Add Java Doc
    //Constructor

    /** Constructor for a Shopping. Has no parameters because it's always empty when first used
     *
     */
    public ShoppingCart()
    {
        for(int i = 0; i < cartItems.size() - 1; i++) // "cartItems.size() - 1"
        {
            cartItems.set(1,empty);
        }
        totalPrice = 0;
    }
    //Mutator

    /**
     *
     * @param index the index we want to change
     * @param item the item we want to choose
     */
    public void setItem(int index, Item item)
    {
            //Figure out how to push an item to the end of a list
            cartItems.set(index,item);

    }

    /**
     *
     * @param item the item we want to append to the "cartItems" Array List
     */
    public void addItemToCart(Item item)
    {
       cartItems.add(item);

    }


    //Accessor
    /**
     *
     * @return the total cart price
     */
    public double getTotalPrice()
    {
        for(int i = 0; i < cartItems.size() - 1; i++)
        {
            totalPrice += cartItems.get(i).getItemPrice();
        }
        return totalPrice;
    }

    //Accessor

    public String getCartItem(int index)
    {
        return cartItems.get(index).toString();
    }

    /**
     *
     * @return  returns attributes for the item's in the shopping cart as a formatted list
     */
    public String toString()
    {

        String s = "Shopping Cart:\n ";

        for(int i = 0; i < cartItems.size(); i++)
        {
            s += cartItems.get(i).toString("      ") + "\n";

        }
        return s;


    }    



}
