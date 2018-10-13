package ProductInventory.model;

//An inventory consists of products

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> productsList;

    public Inventory()
    {
        productsList = new ArrayList<>();
    }

    public void add(Product product)
    {
        productsList.add(product);
    }

    public Product remove(int priceID)
    {
        for(Product test:productsList)
        {
            if(test.getIdNum() == priceID)
            {
                productsList.remove(test);
                return test;
            }
        }
        return null;
    }

    public int countInventory()
    {
        return productsList.size();
    }

    public String toString()
    {
        String string = "";
        for(Product product: productsList)
        {
            string += product.getName() + "(ID: " + product.getIdNum() + ", Price: " + product.getPrice() + ", Quantity: " + product.getNumInventory() + ")\n";
        }
        return string;
    }

}
