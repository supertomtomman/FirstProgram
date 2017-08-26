package Day3.VendingMachine;

public class Money {
    // wartosc w groszach
    private int value;

    public Money(int value) {

        this.value = value;
    }

    public void add(Coin c){
        this.value += c.getValue();
    }
}
