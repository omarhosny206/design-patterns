package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy();

        Context.pay(creditCardPaymentStrategy);
        Context.pay(paypalPaymentStrategy);
    }
}
