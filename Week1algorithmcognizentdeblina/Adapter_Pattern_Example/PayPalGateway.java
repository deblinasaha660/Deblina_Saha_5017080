package AdapterPatternExample;

// PayPal Gateway
public class PayPalGateway {
    public boolean makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal");
        // Simulating payment processing
        return true;
    }
}

// Stripe Gateway
class StripeGateway {
    public String executePayment(double amount) {
        System.out.println("Executing payment of $" + amount + " through Stripe");
        // Simulating payment processing
        return "SUCCESS";
    }
}
