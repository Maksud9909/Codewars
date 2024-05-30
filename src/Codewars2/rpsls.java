package Codewars2;

public class rpsls {

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Calculate the sum of the array and find the min and max values
        for (int num : nums) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Subtract the min and max values from the sum
        sum -= min;
        sum -= max;

        // Calculate the centered average
        return sum / (nums.length - 2);
    }





}
