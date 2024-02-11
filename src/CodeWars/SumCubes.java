package CodeWars;



public class SumCubes {
    public static void main(String[] args) {
        System.out.println(sumCubes(2));
    }
    public static long sumCubes(long n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {

            result += Math.pow(i,123);

        }
        return result;
    }
}
