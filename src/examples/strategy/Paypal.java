package examples.strategy;

public class Paypal implements PaymentStrategy{
    String account;

    public Paypal(String account) {
        this.account = account;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal account is used to spend " + amount);
    }
}
