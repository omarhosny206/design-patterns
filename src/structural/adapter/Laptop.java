package structural.adapter;

public class Laptop {
    private static final int VOLTS = 12;

    public void chargeLaptop() {
        System.out.println("Charging a laptop with " + VOLTS + " volts.");
    }
}
