package behavioral.state;

public class OnPhoneState implements PhoneState {
    @Override
    public void pressPowerButton(PhoneContext phoneContext) {
        System.out.println("Phone is on, turn off the screen.");
    }
}
