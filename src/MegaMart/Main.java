package MegaMart;

import java.util.Scanner;

/**
 * @summary This class integrates the "Shopping", "Shopping Cart" and "Item" classes for running our program
 */
public class Main {
    //Items for every store - seperated by store

    //All Items (Item Objects) for the Walmart Shop
    public static Item sponge = new Item("Scrubber","Scrubs away persistent dirt and grime",3.35);
    public static Item box = new Item("Box", "A box",12.50);
    public static Item paper = new Item("Printer Paper","Paper for printing",20.00);
    public static Item fictionBook = new Item("Fiction Book", "A thrilling novel", 15.50);
    public static Item nonFictionBook = new Item("Non-Fiction Book", "An extremely informative piece of literature", 17.25);

    //All Items (Item Objects) for the Trader Joes Shop
    public static Item orangeChicken = new Item("Trader Joe's Mandarin Orange Chicken"," Crispy chicken in a tangy orange sauce", 4.99 );
    public static Item darkChocolatePeanutButterCups = new Item("Trader Joe's Dark Chocolate Peanut Butter Cups", "Creamy peanut butter covered in rich dark chocolate, perfect for satisfying sweet cravings.",4.49);
    public static Item cauliflowerGnocchi = new Item("Trader Joe's Cauliflower Gnocchi","Gluten-free gnocchi made with cauliflower, an excellent alternative to traditional pasta.", 3.99);
    public static Item cheddarCheese = new Item( "Trader Joe's Unexpected Cheddar Cheese","sharp cheddar with a hint of Parmesan flavor, great for snacking or recipes.", 3.99);
    public static Item pumpkinSpiceCoffee = new Item("Trader Joe's Pumpkin Spice Coffee","Ground Arabica coffee beans infused with warm pumpkin spices for a cozy cup.\n",7.99);

    //All Items (Item Objects) for the Whole Foods Shop
    public static Item strawberry = new Item("Strawberry", "A box of strawberries", 6.50);
    public static Item watermelon = new Item("Watermelon", "A watermelon", 7.00);
    public static Item trailMix = new Item("Trail Mix", "A family sized bag of trail-mix", 10.50);
    public static Item nonFatMilk = new Item("Non-Fat Milk", "A gallon of non-fat milk", 8.00);
    public static Item wholeMilk = new Item("Whole Milk", "A gallon of whole milk",8.00);
    public static Item blueberry = new Item("Blueberry", "A box of blueberries", 6.50);
    public static Item yogurt = new Item("Yogurt", "A cup of yogurt", 1.50);

    //All Items (Item Objects) for the Safeway Shop
    public static Item largeBrownEggs = new Item("O Organics Cage-Free Large Brown Eggs (Dozen)\n","Organic, cage-free brown eggs for a healthier, more ethical choice.", 3.99);
    public static Item thinCrustPepperoniPizza =  new Item("Signature Select Thin Crust Pepperoni Pizza (12-inch)", "A frozen pizza with a crispy thin crust topped with pepperoni and mozzarella.", 5.99);
    public static Item cafeRotisserieChicken = new Item("Signature Cafe Rotisserie Chicken\n","Hot and ready-to-eat rotisserie chicken, seasoned to perfection.",7.99);
    public static Item babySpinach = new Item("O Organics Baby Spinach (5 oz)", "Fresh, organic baby spinach for salads, smoothies, or cooking.", 3.99);
    public static Item freshBakedFrenchBread = new Item("Safeway Fresh Baked French Bread (16 oz)", "Soft and crusty freshly baked French bread, great for sandwiches or dipping.", 2.49);
    public static Item selectVanillaIceCream = new Item("Signature Select Vanilla Ice Cream (48 oz)","Signature Select Vanilla Ice Cream (48 oz)", 4.99);


    //MegaMart.Item Array's for the Respective Stores
    public static Item[] Walmart_Items = {sponge,box,paper,nonFictionBook,fictionBook};
    public static Item[] WholeFoods_Items = {strawberry,watermelon,trailMix,nonFatMilk,wholeMilk,blueberry,yogurt};
    public static Item[] TraderJoes_Items = {orangeChicken,darkChocolatePeanutButterCups,cauliflowerGnocchi,cheddarCheese,pumpkinSpiceCoffee};
    public static Item[] Safeway_Items = {largeBrownEggs,thinCrustPepperoniPizza,cafeRotisserieChicken,babySpinach,freshBakedFrenchBread,selectVanillaIceCream};

    //MegaMart.Shopping Cart
    public static ShoppingCart cart = new ShoppingCart();
    //Shop
    public static Shopping walmart = new Shopping("Walmart","Cheap and High-Quality goods",3.5,Walmart_Items);
    public static Shopping wholeFoods = new Shopping("Whole Foods","Fresh and High-Quality produce ",4.0,WholeFoods_Items);
    public static Shopping traderJoes = new Shopping("Trader Joes","Local and Delicious food",5.0,TraderJoes_Items);
    public static Shopping safeway = new Shopping("Safeway","Tasty produce and tons of items",3.0,Safeway_Items);
    public static Shopping userShop;

    // Shop list
    public static Shopping[] MegaComplex = {wholeFoods,walmart,traderJoes,safeway};
    public static String[] ShopNames = {wholeFoods.getShopName(), walmart.getShopName(), traderJoes.getShopName(),safeway.getShopName()};


    //Input Collection - make scanner
    public static Scanner scan = new Scanner(System.in);

    //Input Storage
    public static  String shop;
    public static String item;
    public static int shopindex;

    /** The main method
     * @param args
     */
     public static void main(String[] args)
     {

         System.out.println("Welcome to the Shop menu");
         System.out.print("Which shop would you like to go to? ");


         shop = scan.nextLine().toLowerCase();

         int shopIndex = shopLinearSearch(shop,MegaComplex) ;



         while(true)
         {
             if(shopIndex != -1) // Checks if the shop name is
             {


                userShop = MegaComplex[shopIndex]; // Assigning the shop from the index to this variable to adapt to the different shops
                while(true)
                {
                    int itemNo = 0;

                    System.out.println(userShop.listItems()); // Lists the items down

                    do {
                        System.out.println("Which item do you want to add to your cart: ");

                        try {

                            itemNo = scan.nextInt() - 1;
                            userShop.getItem(itemNo);//trigger to the error
                            break;

                        } catch (Exception e) {

                            System.out.println("Go back to school");



                        }
                    }
                    while(true);

                     if (itemNo < userShop.getNumberOfItems())
                         {
                             System.out.println("The item you want: " + userShop.getItem(itemNo).getItemName());
                             System.out.println("Adding to cart...");
                             //Make a addItemToCart function
                             cart.addItemToCart(userShop.getItem(itemNo)); // Adds the item in this list which matches the items in the cart
                             System.out.println(cart.toString());//Listing out the cart




                         }
                     else
                         {
                             System.out.println("Sorry, that is not a valid index");
                             continue;
                         }

                     System.out.println("Do you still want to continue adding items(Yes or No): ");
                     String decision = scan.nextLine().toLowerCase();

                     while(true)
                        {

                             decision = scan.nextLine().toLowerCase();
                             break;

                        }

                     if (decision.equals("yes") || decision.equals("y"))
                        {

                            continue;

                        }
                     else if ( decision.equals("no") || decision.equals("n") )
                        {

                            cart.checkout();
                            break;

                        }

                }

             }
             else
             {

                 System.out.println("Please enter a valid shop name");
                 break;

             }
             break;








         }

     }

    /**
     *
     * @param shopName the name inputted by user
     * @param shops the list of shops in the complex
     * @return the index of the Shop's name in its list
     */
     public static int shopLinearSearch(String shopName, Shopping[] shops)
     {
         int index = -1;
         String name;
         shopName = shopName.toLowerCase();

         for(int i = 0; i < shops.length; i++)
         {
             name = shops[i].getShopName().toLowerCase();
             if(name.equals(shopName))
             {

                 index = i;
                 return index;

             }
         }

         System.out.println("Shop not found");
         return index;
     }
}