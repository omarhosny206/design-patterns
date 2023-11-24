package behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid by credit-card payment strategy.");
    }
}
