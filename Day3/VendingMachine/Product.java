package Day3.VendingMachine;

public class Product {
    private String name;
    private int price;
    private String description;

    public Product(String name, int price, String desc) {
        this.name = name;
        this.price = price;
        this.description = desc;
    }

    public String getName() {

        return name;
    }

    public int getPrice() {

        return price;
    }


    public String getDescription() {

        return description;
    }
}
