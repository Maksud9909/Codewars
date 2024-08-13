package codingBat.string2;

public class DoubleChar {

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(ch).append(ch);
        }
        return result.toString();
    }

}
