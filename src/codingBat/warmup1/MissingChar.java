package codingBat.warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {
        StringBuilder builder = new StringBuilder(str);

        char delete = str.charAt(n);

        builder.delete(n,n+1);

        return builder.toString();
    }

}
