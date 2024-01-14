package CodeWars;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class IsIsogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("moose"));
    }
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();  // Ignore letter case
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (seen.contains(ch)) {
                    return false;
                }
                seen.add(ch);
            }
        }

        return true;
    }

}
