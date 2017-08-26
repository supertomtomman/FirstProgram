package Day3.VendingMachine;

public class Shelf {

    private Product product;
    private  int counter;


    public Shelf(Product product, int counter) {

        this.product = product;
        this.counter = counter;
    }

    public Product getProduct() {
        return product;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isEmpty() {
        return counter==0;
    }
}
