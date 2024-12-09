public class Shopping
{
    //Constructor
    private Item[] itemList;
    private String shopName;
    private String shopDescription;
    private double rating;
    // Notes: Figure out how to add infinite items
        // Prob use an Array
    /**
     * @param shopName the Shop's name
     * @param shopDescription the Sho
     * @param rating the Shop's rating
     * @param itemList the list of  Shop's items
     */

    // Array
        // replace item 1 - 4 with an array
            // we are going to change the getter and setter methods
    //1 getter and 1 setter for items
        //setitem(1, "value"); --> first parameter is x - 1 to get the index
        // array[book,car] car --> value

    public Shopping(String shopName, String shopDescription, double rating, Item[]itemList)
    {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.rating = rating;
        this.itemList = itemList;
    }
    //Mutators

    /**
     *
     * @param shopName the name of the Shop
     */
    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    /**
     * @param shopDescription the description of the Shop
     */
    public void setShopDescription(String shopDescription)
    {
        this.shopDescription = shopDescription;
    }

    /**
     * @param rating the rating of the Shop
     */
    public void setRating(double rating)
    {
        this.rating = rating;
    }

    /**
     *
     * @param index the index of the item list
     * @param item the item that is going to be replaced
     */
    public void setItem(int index,Item item)
    {
        itemList[index - 1] = item;
    }

    //Accessors

    /**
     *
     * @param index the index of the item that we need to access
     * @return return the toString for the item
     */
    public String getItem(int index)
    {
        return itemList[index].toString();
    }

    public String getShopItemName(int index)
    {

        return itemList[index].getItemName();
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


    public String listItems()
    {
        String s = "";//  stores the return statemtn
        for(int i = 0; i < itemList.length; i++) {
            s += itemList[i].toString() + "\n";


        }
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


