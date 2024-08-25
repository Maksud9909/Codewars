package codingBat.array2;

public class Either24 {
    public boolean either24(int[] nums) {
        boolean res = false;
        for (int i = 0; i < nums.length - 1; i++) {
            boolean two = nums[i] == 2 && nums[i + 1] == 2;
            boolean four = nums[i] == 4 && nums[i + 1] == 4;

            if ((two && !four) || (!two && four))
                res =  true;
            else if (two && four)
                res =  false;
        }
        return res;
    }

}
