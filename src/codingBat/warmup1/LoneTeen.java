package codingBat.warmup1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aResult = a >= 13 && a <= 19;
        boolean bResult = b >= 13 && b <= 19;
        if (aResult && bResult){
            return false;
        }
        return true;
    }

}
