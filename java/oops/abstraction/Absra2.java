package abstraction;

// Interface example
interface Payment {
    // Abstract methods (implicitly public and abstract)
    void processPayment(double amount);
    void refundPayment(double amount);
    
    // Default method (Java 8+)
    default void printReceipt() {
        System.out.println("Payment receipt generated");
    }
    
    // Static method (Java 8+)
    static String getCurrency() {
        return "USD";
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
    
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding $" + amount + " to credit card");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
    
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding $" + amount + " via PayPal");
    }
}  // This closing brace was missing in the original

public class Absra2 {
    public static void main(String[] args) {
        // Usage
        Payment payment = new CreditCardPayment();
        payment.processPayment(100.50);  // Output: Processing credit card payment: $100.5
        payment.printReceipt();         // Output: Payment receipt generated
        String currency = Payment.getCurrency(); // USD
    }
}