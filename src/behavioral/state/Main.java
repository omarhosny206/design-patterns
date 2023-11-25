package behavioral.state;

public class Main {
    public static void main(String[] args) {
        PhoneState onPhoneState = new OnPhoneState();
        PhoneState offPhoneState = new OffPhoneState();

        PhoneContext onPhoneContext = new PhoneContext(onPhoneState);
        PhoneContext offPhoneContext = new PhoneContext(offPhoneState);

        onPhoneContext.pressPowerButton();
        offPhoneContext.pressPowerButton();
    }
}
