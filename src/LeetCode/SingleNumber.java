package LeetCode;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{4,1,2,1,2}));
    }
        public static int findSingleNumber(int[] nums) {
            int result = 0;


            for (int num : nums) {
                result ^= num;
            }

            return result;
        }


}
