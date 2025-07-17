public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$" + amount + " com cartão de crédito.");
    }
}
