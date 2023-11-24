package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy();

        Client.pay(creditCardPaymentStrategy);
        Client.pay(paypalPaymentStrategy);
    }
}
