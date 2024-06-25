package codingBat.Array1;

public class Double23 {
    public boolean double23(int[] nums) {
        if (nums.length >= 2){
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] == 2 && nums[i + 1] == 2) || (nums[i] == 3 && nums[i + 1] == 3)){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

}
