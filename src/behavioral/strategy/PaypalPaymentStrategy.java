package behavioral.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid by paypal payment strategy.");
    }
}
