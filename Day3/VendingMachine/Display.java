package Day3.VendingMachine;

import java.util.Scanner;

public class Display {

    private VM_Box box;

    public Display(VM_Box box) {
        this.box = box;
    }

    public void startDisplay(){

        System.out.println("Witaj, jest" +box.getNumberOfShelves()+" pulek." +
                "\nProsze podaj nr pulki z produktem:\n");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("Podales nr pulki: " + userInput);
        System.out.println("Ta pulka to:"+this.box.showShelfInfo(userInput));
        System.out.println("Prosze wrzuc monety by kupic");

    }





}
