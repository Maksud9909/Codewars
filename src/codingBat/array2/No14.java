package codingBat.array2;

public class No14 {
    public boolean no14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int num : nums) {
            if (num == 4){
                fours++;
            } else if (num == 1) {
                ones++;
            }
        }
       if (ones >= 1 && fours >= 1)
           return false;
       else
           return true;
    }
}
