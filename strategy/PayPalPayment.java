public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$" + amount + " com PayPal.");
    }
}
