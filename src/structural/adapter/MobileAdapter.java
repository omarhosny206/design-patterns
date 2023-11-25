package structural.adapter;

public class MobileAdapter implements Chargeable {
    private final Mobile mobile;

    public MobileAdapter(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public void charge() {
        mobile.chargeMobile();
    }
}
