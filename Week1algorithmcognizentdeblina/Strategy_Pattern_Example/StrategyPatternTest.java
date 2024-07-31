package StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Create payment strategies
        PaymentStrategy creditCardStrategy = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        PaymentStrategy payPalStrategy = new PayPalPayment("john.doe@example.com");

        // Make a payment using Credit Card
        System.out.println("Customer 1 is paying using Credit Card:");
        context.setPaymentStrategy(creditCardStrategy);
        context.executePayment(100.50);

        // Make a payment using PayPal
        System.out.println("\nCustomer 2 is paying using PayPal:");
        context.setPaymentStrategy(payPalStrategy);
        context.executePayment(75.25);

        // Try to make a payment without setting a strategy
        System.out.println("\nCustomer 3 is trying to pay without selecting a payment method:");
        context.setPaymentStrategy(null);
        context.executePayment(50.00);
    }
}
