public class ShoppingCart
{

    private Item item1,item2,item3; //Note: Figure out  how to add more items
    private double totalPrice;

    //Items, total price, toString
    //Note: Add Java Doc
    //Constructor

    /**
     * @param item1 the Shopping Cart's first item
     * @param item2 the Shopping Cart's second item
     * @param item3 the Shopping Cart's third item
     */
    public ShoppingCart(Item item1, Item item2, Item item3)
    {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.totalPrice = item1.getItemPrice() + item2.getItemPrice() + item3.getItemPrice();

    }
    //Mutator

    /**
     *
     * @param item1
     */
    public void setItem1(Item item1)
    {
        this.item1 = item1;
    }


    public void setItem2(Item item2)
    {
        this.item2 = item2;
    }

    public void setItem3(Item item3)
    {
        this.item3 = item3;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }
    //Accessor

    /**
     * @return returns a description which consists the name, price, and description of the first item
     */
    public String getItem1()
    {
        return item1.toString();
    }

    /**
     * @return returns a description which consists the name, price, and description of the second item
     */
    public String getItem2()
    {
        return item2.toString();
    }

    /**
     * @return returns a description which consists the name, price, and description of the third item
     */
    public String getItem3()
    {
        return item3.toString();
    }

    /**
     *
     * @return  returns attributes for the item's in the shopping cart as a formatted list
     */
    public String toString()
    {

        return "Shopping Cart" + "\n" + "    1." +  item1.toString("        ") + "    2." + item2.toString("        ") + "    3." + item3.toString("        ") + "\n" + "Total Price: " + totalPrice;



    }    



}
