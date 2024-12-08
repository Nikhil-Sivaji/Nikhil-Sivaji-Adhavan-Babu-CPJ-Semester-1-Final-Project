public class Test
{

    public static void main(String[] args)
    {
        Item sponge = new Item("Scrubber","Scrubs away persisten dirt and grime",3.35);
        Item box = new Item("Box", "A box",12.50 );
        Item paper = new Item("Printer Paper","Paper for printing",20.0);
        Item fictionBook = new Item("Book", "A thrilling novel", 15.50);

        ShoppingCart cart1 = new ShoppingCart(sponge,box,paper);

        System.out.println(cart1.toString());

        Shopping walmart = new Shopping("Walmart","Cheap and high quality goods",3.5,sponge,box,paper,fictionBook);
        System.out.println(walmart.getItem2());
        System.out.println(walmart.toString());



    }
}