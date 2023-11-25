package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy();

        Context creditCardPaymentContext = new Context(creditCardPaymentStrategy);
        Context paypalPaymentContext = new Context(paypalPaymentStrategy);

        creditCardPaymentContext.pay();
        paypalPaymentContext.pay();
    }
}
