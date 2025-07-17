public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Nenhum método de pagamento selecionado.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
