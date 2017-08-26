package Day3.VendingMachine;

public enum Coin {
    // nominały: 5, 2, 1, 0.5, 0.2, 0.1),
    FIVE_ZLOTY(500),
    TWO_ZLOTY(200),
    ONE_ZLOTY(100),
    FIFTY_GROSZY(50),
    TWENTY_GROSZY(20),
    TEN_GROSZY(10);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
