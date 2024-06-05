package codingBat.recursion1;

public class Factoriall {
    public int factorial(int n) {
        if (n == 1){
            return 0;
        }

        return n * factorial(n - 1);
    }

}
