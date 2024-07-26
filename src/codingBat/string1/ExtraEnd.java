package codingBat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append(str.substring(str.length() - 2));
        }
        return builder.toString();
    }

}
