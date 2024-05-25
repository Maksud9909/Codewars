package codingBat.Warmup2;




public class Array123 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }







}
