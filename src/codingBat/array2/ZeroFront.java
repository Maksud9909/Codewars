package codingBat.array2;

import java.util.Arrays;

public class ZeroFront {
    public static void main(String[] args) {
        ZeroFront zeroFront = new ZeroFront();
        System.out.println(Arrays.toString(zeroFront.zeroFront(new int[]{1, 0, 0, 1})));
    }
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;


        for (int num : nums) {
            if (num == 0) {
                result[index++] = 0;
            }
        }


        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }


}
