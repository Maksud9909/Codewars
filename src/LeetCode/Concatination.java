package LeetCode;

public class Concatination {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }

        for (int i = nums.length; i < nums.length; i++) {
            result[i + n] = nums[i];
        }
        return result;
    }
}
