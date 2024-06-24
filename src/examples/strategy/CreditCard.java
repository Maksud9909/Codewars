package examples.strategy;

public class CreditCard implements PaymentStrategy{
    int cardNumber;

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard is used to spend " + amount);
    }
}
