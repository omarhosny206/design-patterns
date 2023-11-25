package behavioral.state;

public class OffPhoneState implements PhoneState {
    @Override
    public void pressPowerButton(PhoneContext phoneContext) {
        System.out.println("Phone is off, turn on the screen.");
    }
}
