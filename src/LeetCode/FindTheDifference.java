package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> charCount = new HashMap<>();

        for (char ch: s.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0) + 1);
        }
        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
            if (charCount.get(c) < 0) {
                return c;
            }
        }

        return '\0';
    }
}
