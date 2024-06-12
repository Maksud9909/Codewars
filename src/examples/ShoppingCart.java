package examples;

public class ShoppingCart {
    public PaymentStrategy paymentStrategy;
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
