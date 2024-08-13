package codingBat.string2;

public class CountHi {
    public int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                result++;
        }
        return result;
    }

}
