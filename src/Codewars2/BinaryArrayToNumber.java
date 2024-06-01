package Codewars2;


import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < binary.size(); i++) {
            builder.append(binary.get(i));
        }
        return Integer.parseInt(builder.toString(),2);
    }
}
