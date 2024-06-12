package codingBat.Array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int middleIndex = nums.length / 2; // 2
        int[] middleElements = new int[2];
        middleElements[0] = nums[middleIndex - 1];
        middleElements[1] = nums[middleIndex];
        return middleElements;
    }

}
