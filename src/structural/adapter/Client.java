package structural.adapter;

public class Client {
    public static void chargeDevice(Chargeable chargeable) {
        chargeable.charge();
    }
}
