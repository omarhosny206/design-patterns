package behavioral.strategy;

public class Context {
    public static void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay();
    }
}
