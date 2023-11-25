package structural.adapter;

public class Main {
    public static void main(String[] args) {
        MobileAdapter mobileAdapter = new MobileAdapter(new Mobile());
        Client.chargeDevice(mobileAdapter);

        LaptopAdapter laptopAdapter = new LaptopAdapter(new Laptop());
        Client.chargeDevice(laptopAdapter);
    }
}
