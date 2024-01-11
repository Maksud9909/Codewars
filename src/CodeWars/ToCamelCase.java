package CodeWars;

import java.util.Arrays;
import java.util.Locale;

public class ToCamelCase {
    public static void main(String[] args) {

        System.out.println(toCamelCase("the-stealth-warrior"));
    }
        public static String toCamelCase(String input) {
            if (input == null || input.isEmpty()) {
                return "";
            }

            StringBuilder result = new StringBuilder();

            // Split the input string by dashes or underscores
            String[] words = input.split("[-_]");
            System.out.println(Arrays.toString(words));

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                // Capitalize the first word if it's not the first word in the array
                if (i > 0) {
                    word = word.substring(0, 1).toUpperCase() + word.substring(1);
                }

                result.append(word);
            }

            return result.toString();
        }
}
