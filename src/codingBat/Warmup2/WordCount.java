package codingBat.Warmup2;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String string : strings) {
            if (countMap.containsKey(string)) {
                countMap.put(string, countMap.get(string) + 1);
            } else {
                countMap.put(string, 1);
            }
        }
        return countMap;
    }

}
