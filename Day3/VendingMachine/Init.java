package Day3.VendingMachine;

public class Init {
    public static void main(String[] args) {
        VM_Box box = new VM_Box("Automat nr 1",
                "Automat przy kuchni z przekaskami oraz napojami",
                10);
        Product product1 = new Product("Coca Cola Regular",
                200,"Cola w puszce - regular");
        Product product2 = new Product("Sprite",
                200,"Sprite w puszce");
        Product product3 = new Product("7up",
                200,"7up w puszce");
        Product product4 = new Product("Prince Polo Orzech",
                350,"Baton Prince Polo");
        Product product5 = new Product("Woda Mineralna",
                250,"Woda Mineralna Niegazowana 0.5l");
        Product product6 = new Product("Zelki Misie",
                450,"Zelki Misie w torebce 0.2 kg");
        Product product7 = new Product("Tymbark Kiwi",
                250,"Sok Tymbark 0.3l");
        Product product8 = new Product("Tymbark Kiwi",
                250,"Sok Tymbark 0.3l");

        Shelf s1 = new Shelf(product1,15);
        Shelf s2 = new Shelf(product1,15);
        Shelf s3 = new Shelf(product2,10);
        Shelf s4 = new Shelf(product3,5);
        Shelf s5 = new Shelf(product4,9);
        Shelf s6 = new Shelf(product5,7);
        Shelf s7 = new Shelf(product6,20);
        Shelf s8 = new Shelf(product7,9);
        Shelf s9 = new Shelf(product8,2);

        box.loadMachineWithProducts(new Shelf[]{s1,s2,s3,s4,s5,s6,s7,s8,s9});
        Display display = new Display(box);
        display.startDisplay();

    }
}
