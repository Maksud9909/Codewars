package codingBat.Warmup2;
import java.util.HashMap;
import java.util.Map;
public class FirstChar {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, StringBuilder> charMap = new HashMap<>();

        // Iterate through the strings
        for (String str : strings) {
            // Extract the first character
            String firstChar = str.substring(0, 1);

            // Append the string to the corresponding StringBuilder in the map
            if (charMap.containsKey(firstChar)) {
                charMap.get(firstChar).append(str);
            } else {
                charMap.put(firstChar, new StringBuilder(str));
            }
        }

        // Convert StringBuilder values to String and create the final result map
        Map<String, String> resultMap = new HashMap<>();
        for (Map.Entry<String, StringBuilder> entry : charMap.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue().toString());
        }
        return resultMap;
    }

}
