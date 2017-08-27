package Day3.VendingMachine;

import java.util.ArrayList;

public class Money {
    // wartosc w groszach
    private int value;
    private ArrayList<Coin> coins = new ArrayList<Coin>();

    public Money(int value) {

        this.value = value;
    }

    public void add(Coin c) {

        this.value += c.getValue();
        coins.add(c);
    }

    public void showCoinsStored() {
        for (Coin c : coins) {
            System.out.print(c.getValue() + " ");
        }

    }

}
