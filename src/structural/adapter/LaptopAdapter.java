package structural.adapter;

public class LaptopAdapter implements Chargeable {
    private final Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void charge() {
        laptop.chargeLaptop();
    }
}
