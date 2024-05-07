package LeetCode;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        int [] sorted = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < max; i++) {
            if (i == sorted[i]){
                continue;
            }
            else {
                res = i;
            }
        }
        return res;

    }
}
