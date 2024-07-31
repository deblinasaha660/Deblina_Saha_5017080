package AdapterPatternExample;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create adapters for different payment gateways
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        // Process payments using different gateways
        processPayment(paypalProcessor, 100.0);
        processPayment(stripeProcessor, 200.0);
    }

    private static void processPayment(PaymentProcessor processor, double amount) {
        boolean result = processor.processPayment(amount);
        System.out.println("Payment " + (result ? "successful" : "failed"));
        System.out.println();
    }
}
