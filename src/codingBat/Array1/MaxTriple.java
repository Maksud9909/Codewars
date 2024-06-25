package codingBat.Array1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = 0;
        if (nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]){
                max = nums[i];
            }
        }
        return max;
    }

}
