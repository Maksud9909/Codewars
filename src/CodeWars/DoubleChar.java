package CodeWars;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("Maksud"));
    }
    public static String doubleChar(String string){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            builder.append(ch);
            builder.append(ch);
        }
        return builder.toString();
    }
}
