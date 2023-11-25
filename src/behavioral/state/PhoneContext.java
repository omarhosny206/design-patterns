package behavioral.state;

public class PhoneContext {
    private PhoneState phoneState;

    public PhoneContext(PhoneState phoneState) {
        this.phoneState = phoneState;
    }

    public void pressPowerButton() {
        phoneState.pressPowerButton(this);
    }

    public void changePhoneState(PhoneState phoneState) {
        this.phoneState = phoneState;
    }
}
