package codingBat.array2;

import java.util.Arrays;

public class Without10 {
    public int[] withoutTen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10){
                nums[i] = 0;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}
