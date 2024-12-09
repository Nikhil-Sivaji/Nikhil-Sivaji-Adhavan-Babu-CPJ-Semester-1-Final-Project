import java.util.Scanner;
public class Main {


     public static void main(String[] args)
     {

         //Variables

         //Items

         //Items for Walmart
         Item sponge = new Item("Scrubber","Scrubs away persisten dirt and grime",3.35);
         Item box = new Item("Box", "A box",12.50 );
         Item paper = new Item("Printer Paper","Paper for printing",20.0);
         Item fictionBook = new Item("Fiction Book", "A thrilling novel", 15.50);
         Item nonFictionBook = new Item("Non-Fiction Book", "An extremely informative piece of literature", 17.25);

         //Items for Trader Joes
         Item orangeChicken = new Item("Trader Joe's Mandarin Orange Chicken"," Crispy chicken in a tangy orange sauce", 4.99 );
         Item darkChocolatePeanutButterCups = new Item("Trader Joe's Dark Chocolate Peanut Butter Cups", "Creamy peanut butter covered in rich dark chocolate, perfect for satisfying sweet cravings.",4.49);
         Item cauliflowerGnocchi = new Item("Trader Joe's Cauliflower Gnocchi","Gluten-free gnocchi made with cauliflower, an excellent alternative to traditional pasta.", 3.99);
         Item cheddarCheese = new Item( "Trader Joe's Unexpected Cheddar Cheese","sharp cheddar with a hint of Parmesan flavor, great for snacking or recipes.", 3.99);
         Item pumpkinSpiceCoffee = new Item("Trader Joe's Pumpkin Spice Coffee","Ground Arabica coffee beans infused with warm pumpkin spices for a cozy cup.\n",7.99);

         //Items for Whole Foods
         Item strawberry = new Item("Strawberry", "A box of strawberries", 6.50);
         Item watermelon = new Item("Watermelon", "A watermelon", 7.0);
         Item trailMix = new Item("Trail Mix", "A family sized bag of trail-mix", 10.50);
         Item nonFatMilk = new Item("Non-Fat Milk", "A gallon of non-fat milk", 8.0);
         Item wholeMilk = new Item("Whole Milk", "A gallon of whole milk",8.0);
         Item blueberry = new Item("Blueberry", "A box of blueberries", 6.50);
         Item yogurt = new Item("Yogurt", "A cup of yogurt", 1.50);

         //Items for Safeway
         Item largeBrownEggs = new Item("O Organics Cage-Free Large Brown Eggs (Dozen)\n","Organic, cage-free brown eggs for a healthier, more ethical choice.", 3.99);
         Item thinCrustPepperoniPizza =  new Item("Signature Select Thin Crust Pepperoni Pizza (12-inch)", "A frozen pizza with a crispy thin crust topped with pepperoni and mozzarella.", 5.99);
         Item cafeRotisserieChicken = new Item("Signature Cafe Rotisserie Chicken\n","Hot and ready-to-eat rotisserie chicken, seasoned to perfection.",7.99);
         Item babySpinach = new Item("O Organics Baby Spinach (5 oz)", "Fresh, organic baby spinach for salads, smoothies, or cooking.", 3.99);
         Item freshBakedFrenchBread = new Item("Safeway Fresh Baked French Bread (16 oz)", "Soft and crusty freshly baked French bread, great for sandwiches or dipping.", 2.49);
         Item selectVanillaIceCream = new Item("Signature Select Vanilla Ice Cream (48 oz)","Signature Select Vanilla Ice Cream (48 oz)", 4.99);


         //Item Array's for the Respective Stores
         Item[] Walmart_Items = {sponge,box,paper,nonFictionBook,fictionBook};
         Item[] WholeFoods_Items = {strawberry,watermelon,trailMix,nonFatMilk,wholeMilk,blueberry,yogurt};
         Item[] TraderJoes_Items = {orangeChicken,darkChocolatePeanutButterCups,cauliflowerGnocchi,cheddarCheese,pumpkinSpiceCoffee};
         Item[] Safeway_Items = {largeBrownEggs,thinCrustPepperoniPizza,cafeRotisserieChicken,babySpinach,freshBakedFrenchBread,selectVanillaIceCream};

         //Shopping Cart
         ShoppingCart cart = new ShoppingCart();
         //Shop
         Shopping walmart = new Shopping("Walmart","Cheap and High-Quality goods",3.5,Walmart_Items);
         Shopping wholeFoods = new Shopping("Whole Foods","Fresh and High-Quality produce ",4.0,WholeFoods_Items);
         Shopping traderJoes = new Shopping("Trader Joes","Local and Delicous food",5.0,TraderJoes_Items);
         Shopping safeway = new Shopping("Safeway","Tasty produce and tons of items",3.0,Safeway_Items);

         //Input
             //Input Collection
             Scanner scan = new Scanner(System.in);

             //Input Storage
             String shop;
             String item;



         //1. Welcomes User and Displays all the shops with their ratings
        System.out.println("Welcome to the Shop menu");
            //Display all shops

         //2.Asks for Which shop to Join
         System.out.print("Which shop would you like to go to? ");

         //3.Collects the input and displays all the items in the shop
         shop = scan.nextLine().toLowerCase();
         if(shop.equals(walmart.getShopName().toLowerCase()) ) // Checks if the shop name is
         {
            System.out.println(walmart.listItems()); // Lists the items down

             //4.Asks for Which item to add to the cart
             System.out.println("Which items do you want to add to your cart ?");
             item = scan.nextLine().toLowerCase();
             System.out.println("The item you want: " + item);
             //For loop to check which item in the store matches the input
             for(int i = 0; i < Walmart_Items.length; i++)
             {
                 String itemName = walmart.getShopItemName(i).toLowerCase();
                 if(item.equals(itemName))
                 {
                     System.out.println("Adding to cart...");
                     System.out.println("Cart Balance: ");
                     //Make a addItemToCart function
                     cart.addItemToCart(Walmart_Items[i]); // Adds the item in this list which matches the items in the cart
                     System.out.println(cart.toString());//Listing out the cart



                 }


             }





         }




         //5.Adds item to cart

         //6.Displays card

         //7.Loop Back to step 3 till the user adds all 4 items or says no to continue adding more to the cart

         //8. Says thank you and exits the program




     }
}