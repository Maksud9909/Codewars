package codingBat.Array1;

public class MidThree {
    public int[] midThree(int[] nums) {
        if (nums.length == 3){
            return nums;
        }
    int middle = (nums.length / 2);

        return new int[]{nums[middle-1],nums[middle],nums[middle+1]};

    }

}
