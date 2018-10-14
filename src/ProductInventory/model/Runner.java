package ProductInventory.model;

import java.util.Scanner;

public class Runner {

    private static Inventory inv;

    public Runner()
    {
        Product apple, banana, pineapple, pen, mouse;
        apple = new Product(1, 10, 10, "Apple");
        banana = new Product(2, 15, 2, "Banana");
        pineapple = new Product(3, 13, 8, "Pineapple");
        pen = new Product(4, 10, 1, "Pen");
        mouse = new Product(5, 20, 30, "Mouse");

        inv = new Inventory();
        inv.add(apple);
        inv.add(banana);
        inv.add(pineapple);
        inv.add(pen);
        inv.add(mouse);

        System.out.print(inv.toString());

        inv.remove(1);
        inv.remove(5);

        System.out.print("\n" + inv.toString());
    }
    public static void main(String args[])
    {
        act();
    }

    public static void act()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to add, remove, or print the inventory?");
        String action = s.nextLine();
        action.toLowerCase();
        if(action.equals("add"))
        {
            Product newProduct = new Product();
            System.out.println("What is the product name?");
            String name = s.nextLine();
            newProduct.setName(name.toLowerCase());

            System.out.println("What is the product ID number?");
            int number = s.nextInt();
            newProduct.setIdNum(number);

            System.out.println("What is the quantity of product in inventory?");
            int inventory = s.nextInt();
            newProduct.setNumInventory(inventory);

            System.out.println("What is the product price?");
            double price = s.nextDouble();
            newProduct.setPrice(price);

            inv.add(newProduct);
            System.out.println("Product added");
        }
        else if(action.equals("remove"))
        {
            System.out.println("Please enter the ID of the product you would like to remove");
            int number = s.nextInt();

            inv.remove(number);
        }
        else if(action.equals("print"))
        {
            inv.toString();
        }
        else
        {
            System.out.println("Please enter add, remove, or print");
        }

    }
}
