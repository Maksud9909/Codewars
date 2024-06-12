package codingBat.Array1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int aRes = 0;
        int bRes = 0;
        for (int num:a){
            aRes+=num;
        }
        for (int num:b){
            bRes+=num;
        }
        if (aRes > bRes){
            return a;
        } else if (bRes == aRes) {
            return a;
        }
        return b;
    }

}
