package LeetCode;



public class RemoveDublicates {
    public static void main(String[] args) {
        RemoveDublicates removeDublicates = new RemoveDublicates();
        int [] nums = new int[]{1,1,2};
        System.out.println(removeDublicates.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        int l = 1;// {0,0,1,1,1,2,2,3,3,4}


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[l] = nums[i];
                l+=1;
            }
        }
        return l;
    }
}
