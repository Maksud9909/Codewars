package CodeWars;

import java.util.Arrays;

public class ToCsvText {
    public static String toCsvText(int[][] array){
        return Arrays.toString(Arrays.stream(array).toArray());
    }
}
