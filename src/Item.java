public class Item
{

    //Instance Variables
    private String itemName;
    private String itemDescription;
    private double itemPrice;

    /** Constructor for Item class
     * @param itemName the item's name
     * @param itemDescription the item's description
     * @param itemPrice the item's price
     */
    public Item(String itemName, String itemDescription, double itemPrice)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    //Mutators
        //Note: Add more features from Java doc if time persists
        //Note: Add programming list

    // Format for description: the attribute of the object
    /**  The setter Method changes the item's name based on the parameter
     *@param itemName the name of the item
     */
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    /** The setter Method changes the item's price name based on the parameter
     * @param itemPrice the price for the item
     */
    public void setPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    /** The setter Method changes the item's description name based on the parameter
     * @param itemDescription the description of the item
     */
    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }
    // Accessor
    //Format: return's object's attribute
    /** Getter method that returns items name
     * @return returns items name
     */
    public String getItemName()
    {
        return itemName;
    }

    /** Getter method that returns items price
     * @return returns items price
     */
    public double getItemPrice()
    {
        return itemPrice;
    }

    /** Getter method that returns item description
     * @return return items description
     */
    public String getItemDescription()
    {
        return itemDescription;
    }

    /** Formats and returns the information of the item of item
     * @param space_ String used for formatting the spacing for toString in "Shopping Cart" and "Shopping" class
     * @return returns items name, price, and description
     */
    public String toString(String space_)
    {
        return  " " + itemName +  " --> $" + itemPrice + "\n" + space_ + itemDescription + "\n";
    } // work on to String method


    /** Formats and returns the information of the item of item
     * @return returns items name, price, and description
     */
    public String toString()
    {
        return  " " + itemName +  " --> $" + itemPrice + "\n" + "   " + itemDescription + "\n";

    }


    /** Main method - for testing
     * @param args idk wat it means
     */
   public static void main(String[] args)
   {
       Item scrub = new Item("Scrub Daddy", "Helps in Scrubbing", 16.57);
        System.out.println(scrub.toString());

   }



}
