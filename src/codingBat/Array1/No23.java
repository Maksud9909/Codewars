package codingBat.Array1;

public class No23 {
    public boolean no23(int[] nums) {
        for (int num:nums){
            if (num == 2 || num == 3){
                return false;
            }
        }
        return true;
    }

}
