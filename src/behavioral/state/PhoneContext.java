package behavioral.state;

public class PhoneContext {
    private final PhoneState phoneState;

    public PhoneContext(PhoneState phoneState) {
        this.phoneState = phoneState;
    }

    public void pressPowerButton() {
        phoneState.pressPowerButton(this);
    }
}
