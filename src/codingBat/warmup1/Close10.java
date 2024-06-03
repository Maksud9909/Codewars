package codingBat.warmup1;

public class Close10 {
    public int close10(int a, int b) {
        int aResult = Math.abs(a - 10);
        int bResult = Math.abs(b - 10);
        if (aResult <=2){
            return a;
        } else if (bResult <= 2) {
            return b;
        }
        return 0;
    }

}
