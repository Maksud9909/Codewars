package CodeWars;


import java.util.ArrayList;
import java.util.List;

public class Digitize {
    public static List<Integer> extractDigits(int num) {
        List<Integer> result = new ArrayList<>();

        // Convert the non-negative integer to a string
        String numStr = Integer.toString(num);

        // Iterate through each character in the string and convert it to an integer
        for (char digitChar : numStr.toCharArray()) {
            // Convert the character to an integer and add it to the result list
            int digit = Character.getNumericValue(digitChar);
            result.add(digit);
        }

        return result;
    }
}
