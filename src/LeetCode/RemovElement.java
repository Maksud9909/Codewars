package LeetCode;

public class RemovElement {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 3;
        RemovElement removElement = new RemovElement();
        System.out.println(removElement.removeElement(nums,val));
    }
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
