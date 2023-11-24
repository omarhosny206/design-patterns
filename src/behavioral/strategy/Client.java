package behavioral.strategy;

public class Client {
    public static void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay();
    }
}
