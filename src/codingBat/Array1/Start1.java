package codingBat.Array1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0){
            int aFirst = a[0];
            int bFirst = b[0];
            if (aFirst == 1 && bFirst == 1){
                return 2;
            }else if (aFirst == 1 || bFirst == 1){
                return 1;
            }
            return 0;
        } else if (a.length > 0) {
            int aFirst = a[0];
            if (aFirst == 1){
                return 1;
            }
            return 0;
        } else if (b.length > 0) {
            int bFirst = b[0];
            if (bFirst == 1){
                return 1;
            }
            return 0;
        }
        return 0;
    }
}
