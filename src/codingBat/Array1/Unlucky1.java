package codingBat.Array1;

public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i+1] == 3){
                return true;
            }
            if (nums[0] == 1 || nums[1] == 1 || nums[nums.length - 2] == 1 || nums[nums.length - 1] == 1){
                return true;
            }
        }
        return false;
    }
}
