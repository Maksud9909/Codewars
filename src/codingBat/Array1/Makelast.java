package codingBat.Array1;

public class Makelast {
    public int[] makeLast(int[] nums) {
        int doubleLength = nums.length * 2;

        int [] arr = new int[doubleLength];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

}
