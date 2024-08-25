package codingBat.array2;

public class IsEveryWhere {
    public boolean isEverywhere(int[] nums, int val) {
        if (nums.length == 0)
            return true;
        int pairs = nums.length - 1;
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val || nums[i + 1] == val){
                counter++;
            }
        }
        return counter == pairs;
    }

}


// 1 2 3 4 5 6 7