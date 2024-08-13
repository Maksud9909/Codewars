package codingBat.string2;

public class XYBalanced {
    public boolean xyBalance(String str) {
        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x')
                xCount++;
            if (str.charAt(i) == 'y')
                yCount++;
        }

        int dif = xCount - yCount;

        if (dif >= 0){
            return true;
        }
        return false;
    }

}
