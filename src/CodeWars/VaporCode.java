package CodeWars;

public class VaporCode {
    public static void main(String[] args) {
        System.out.println(vaporcode("Maksud Rustamov"));
    }
    public static String vaporcode(String s) {
        String string = new String(s.toUpperCase().replace(" ","")); // перевод в стоку в большие буквы

        StringBuilder builder = new StringBuilder(string.length() * 2); // создается буилдер в 2 раза больше размера String

        for (int i = 0; i < string.length(); i++) {
            builder.append(string.charAt(i)); // записали инфу в буилдер
            if (i < string.length() - 1){ // после каждой итерации добавляется пробел
                builder.append(" ");
            }
        }

        return builder.toString();
    }
}
