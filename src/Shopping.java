public class Shopping
{
    //Constructor
    private Item item1,item2, item3, item4;
    private String shopName;
    private String shopDescription;
    private double rating;
    // Notes: Figure out how to add infinite items
        // Prob use an Array
    /**
     * @param shopName the Shop's name
     * @param shopDescription the Sho
     * @param rating the Shop's rating
     * @param item1 the Shop's first item
     * @param item2 the Shop's second item
     * @param item3 the Shop's third item
     * @param item4 the Shop's fourth item
     */
    public Shopping(String shopName, String shopDescription, double rating, Item item1, Item item2, Item item3, Item item4)
    {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.rating = rating;

        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
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

    //Accessors

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

    /** Method that returns all of item1's info
     * @return return's the items name, price, and description
     */
    public String getItem1() {
        return item1.toString();
    }

    /** Method that returns all of item2's info
     * @return return's the items name, price, and description
     */
    public String getItem2() {
        return item2.toString();
    }

    /** Method that returns all of item3's info
     * @return return's the items name, price and description
     */
    public String getItem3() {
        return item3.toString();
    }

    /** Method that returns all of item4's info
     * @return return's the items name, price and description
     */
    public String getItem4() {
        return item4.toString();
    }

    /** Method that formats and returns all of shop's info
     * @return returns the shops name, rating, and description
     */
    public String toString()
    {
        return getShopName() + ": " + getRating() +  " - " + getShopDescription();
    }



}


