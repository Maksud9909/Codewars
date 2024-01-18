package CodeWars;

public class Split {
    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }
    public static String splitInParts(String s, int partLength) {
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= s.length() - s.length() % partLength - partLength; i += partLength) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(s, i, i + partLength);
        }

        if (s.length() % partLength != 0) {
            sb.append(" ")
                    .append(s.substring(s.length() - s.length()%partLength));
        }

        return new String(sb);
    }
}
