package examples.strategy;

public class Test1 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart1 = new ShoppingCart(new Paypal("Maksud"));
        shoppingCart1.checkout(10);

        ShoppingCart shoppingCart2 = new ShoppingCart(new CreditCard(8700));
        shoppingCart2.checkout(100);
    }
}
