package Day3.VendingMachine;

public class VM_Box {
    private String name;
    private String description;
    private int numberOfShelves;
    private Money totalCashCollected;
    private Shelf[] shelves;

    public VM_Box(String name, String description, int numberOfShelves) {
        this.name = name;
        this.description = description;
        this.numberOfShelves = numberOfShelves;
        this.totalCashCollected = new Money(0);
        this.shelves = new Shelf[numberOfShelves];
    }

    public void loadMachineWithProducts(Shelf[] shelves){

        for (int i = 0; i <this.shelves.length; i++) {
            this.shelves[i]=new Shelf(new Product("NA",0,"NA"),0);
        }
        if (this.shelves.length<=shelves.length){
            System.out.println("Maszyna ma tylko" + this.numberOfShelves + "pulek");
        }
        else {
            for (int i = 0; i <shelves.length; i++) {
                this.shelves[i]=shelves[i];
            }
        }

    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public String showShelfInfo(int userInput) {
        if (this.shelves.length<userInput||
                this.shelves[userInput].getCounter()==0   ){
            return "Ta pulka jest pusta";
        }

        return " "+
        this.shelves[userInput].getProduct().getName()+" za cene "+
                this.shelves[userInput].getProduct().getPrice()  +
                " groszy, dostepnych jest : "+
                this.shelves[userInput].getCounter();

    }
}
