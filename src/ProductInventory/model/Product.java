package ProductInventory.model;

//A product to be added into an inventory. Consists of a product ID, price, quantity in inventory, and a name.

public class Product {

    private int idNum;
    private int numInventory;
    private double price;
    private String name;

    public Product()
    {
        idNum = 1;
        numInventory = 0;
        price = 0.00;
        name = "Unnamed";
    }

    public Product(int idNum, int numInventory, double price, String name)
    {
        this.idNum = idNum;
        this.numInventory = numInventory;
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getIdNum() {
        return idNum;
    }

    public int getNumInventory() {
        return numInventory;
    }

    public String getName() {
        return name;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void setNumInventory(int numInventory) {
        this.numInventory = numInventory;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
