package MegaMart;

/**
 * @summary the "Shopping Class" instantiates objects representing shops which hold an array list of items within their catalog
 */
public class Shopping
{
    //Instance variables and array list
    private Item[] itemList;
    private String shopName;
    private String shopDescription;
    private double rating;



    /** The constructor for the Shopping Class
     * @param shopName the Shop's name
     * @param shopDescription the Sho
     * @param rating the Shop's rating
     * @param itemList the list of  Shop's items
     */
    public Shopping(String shopName, String shopDescription, double rating, Item[]itemList)
    {

        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.rating = rating;
        this.itemList = itemList;

    }

    //Mutator Methods

    /** Sets the shopName, name of the shop
     * @param shopName the name of the Shop
     */
    public void setShopName(String shopName)
    {

        this.shopName = shopName;

    }

    /** Sets the shopDescription, description of the shop
     * @param shopDescription the description of the Shop
     */
    public void setShopDescription(String shopDescription)
    {

        this.shopDescription = shopDescription;

    }

    /** Sets the rating, rating of the shop
     * @param rating the rating of the Shop
     */
    public void setRating(double rating)
    {

        this.rating = rating;

    }

    /** Replaces or adds an Item to the shop
     * @param index the index of the item list
     * @param item the item that is going to be replaced
     */
    public void setItem(int index,Item item)
    {

        itemList[index - 1] = item;

    }

    //Accessor

    /** Returns information about item, based on index entered
     * @param index the index of the item that we need to access
     * @return return the toString for the item
     */
    public String getItemInfo(int index)
    {

        return itemList[index].toString();

    }

    /** Returns the item
     * @param index the index of the item that we need to access
     * @return the item's memory address
     */
    public Item getItem(int index)
    {

        return itemList[index];

    }

    /** Returns the name of the item
     * @param index the index identifying an item from the Shop's arraylist
     * @return the name of any the Shop's MegaMart.Item
     */
    public String getShopItemName(int index)
    {

        return itemList[index].getItemName();

    }

    /** Returns the length of the item list, which is the number of items
     * @return the number of items
     */
    public int getNumberOfItems()
    {

        return itemList.length;

    }

    /** Method that returns the shops rating
     * @return returns shops rating
     */
    public double getRating()
    {

        return rating;

    }

    /** Method that returns the shops name
     * @return returns shops name
     */
    public String getShopName()
    {

        return shopName;

    }

    /** Method that returns the shops description
     * @return returns shops description
     */
    public String getShopDescription()
    {

        return shopDescription;

    }

    /** Formats and returns the list of items
     * @return the items from the item's list
     */
    public String listItems()
    {

        String s = "________________________________________________________\n";//  stores the return statemtn
        for(int i = 0; i < itemList.length; i++) {
            s += (i+1) + ": " + itemList[i].toString() + "\n";


        }
        s += "________________________________________________________\n";

        return s;

    }

    /** Method that formats and returns all of shop's info
     * @return returns the shops name, rating, and description
     */
    public String toString()
    {

        return getShopName() + ": " + getRating() +  " - " + getShopDescription();

    }





}


