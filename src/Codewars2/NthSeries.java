package Codewars2;

import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / (3 * i - 2);
        }

        // Round to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(result);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(1)); // Output: "1.00"
        System.out.println(seriesSum(2)); // Output: "1.25"
        System.out.println(seriesSum(5)); // Output: "1.57"
    }
}
