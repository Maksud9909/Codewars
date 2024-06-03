package codingBat.warmup1;

public class NearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(89));
    }
    public static boolean nearHundred(int n) { // 89
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

}
