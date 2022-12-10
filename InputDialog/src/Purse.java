
/*
        Implementare una classe Purse con i seguenti metodi:
        -addNickels;
        -addDimes;
        -addQuarter;
        -getTotal;       ->     nickels*0.5 + dimes*0.1 + quarters*0.25
 */
public class Purse {
    private static final double nickel_val = 0.05;
    private static final double dimes_val = 0.1;
    private static final double quarter_val = 0.25;
    private double nickel;
    private double dimes;
    private double quarter;

    //costruttore
    public Purse () {
        nickel = 0;
        dimes = 0;
        quarter = 0;
    }


    public void addNickels (double amount) {
        nickel = nickel + amount;
    }
    public void addDimes (double amount) {
        dimes = dimes + amount;
    }
    public void addQuarter (double amount) {
        quarter = quarter + amount;
    }

    public double getTotal() {
        return (nickel*nickel_val) + dimes*(dimes_val) + quarter*(quarter_val);
    }

}

