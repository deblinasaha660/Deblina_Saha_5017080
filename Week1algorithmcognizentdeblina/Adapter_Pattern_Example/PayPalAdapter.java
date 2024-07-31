package AdapterPatternExample;

// PayPal Adapter
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter() {
        this.payPalGateway = new PayPalGateway();
    }

    @Override
    public boolean processPayment(double amount) {
        return payPalGateway.makePayment(amount);
    }
}

// Stripe Adapter
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter() {
        this.stripeGateway = new StripeGateway();
    }

    @Override
    public boolean processPayment(double amount) {
        String result = stripeGateway.executePayment(amount);
        return "SUCCESS".equals(result);
    }
}
